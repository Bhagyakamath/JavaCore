package com.test.mavenproject1.p8;

import java.util.Arrays;

import com.test.mavenproject1.p1.Read;

public class BinarySearch {

	public static void main(String[] args) {
		Integer arr[]=new Integer[] {20,35,12,55,89,198,2};
		Arrays.sort(arr);
		
		int key;
		System.out.println("Enter key to search: ");
		key=Read.sc.nextInt();
		int x=binarySearch(key, arr, 0, arr.length-1);
		if(x==-1) {
			System.out.println("Key not present");
		}
		else {
			System.out.println("Key is present at position: "+x);
		}

	}

	private static int binarySearch(int key, Integer[] arr, int low, int high) {
		
		if(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[mid]==key) {
				return mid;
			}
			else if(arr[mid]<key) {
				return binarySearch(key, arr, mid+1, high);
			}
			else {
				return binarySearch(key, arr, low, mid-1);
			}
		}
		return -1;
	}

}
