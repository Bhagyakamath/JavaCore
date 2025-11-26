package com.test.mavenproject1.p6;

import com.test.mavenproject1.p1.Read;

public class BubbleSort {

	public static void main(String[] args) {
		System.out.println("Enter size of array: ");
		int n=Read.sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elements:");
		for(int i=0; i<n; i++) {
			arr[i]=Read.sc.nextInt();
		}
		bubbleSort(arr);

	}
	
	public static void bubbleSort(int arr[]) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
}
