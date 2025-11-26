package com.test.mavenproject1.p6;

import com.test.mavenproject1.p1.Read;

public class SelectionSort {

	public static void main(String[] args) {
		System.out.println("Enter size of array: ");
		int n=Read.sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elements:");
		for(int i=0; i<n; i++) {
			arr[i]=Read.sc.nextInt();
		}
		selectionSort(arr);

	}
	public static void selectionSort(int arr[]) {
		int temp=0;
		for(int i=0; i<arr.length-1; i++) {
			int min=i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[min]>arr[j]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

}
