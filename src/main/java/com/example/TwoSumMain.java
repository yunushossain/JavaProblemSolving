package com.example;

import java.util.Arrays;

public class TwoSumMain {

	public static void main(String[] args) {
		int[] arr = {15,10,4,7,23};
		int target =11 ;
		
		int[] sumarr = sumArray(arr, target);
		System.out.print(Arrays.toString(sumarr));
	}

	private static int[] sumArray(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				int sum = arr[i] + arr[j];
				
				if (sum == target) {
					return new int[] {i , j};
				}
			}
		}
		
		return new int[] {-1};
		
		
	}
}
