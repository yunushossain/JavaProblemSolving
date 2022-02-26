package com.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrimeNum_1ToN {
	public static void main(String[] args) {
		int n = 11;
		for (int i = 1; i <= n; i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}

	private static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i < n; i++) {
			if (n % 2 == 0) {
				return false;
			}
		}
		return true;
	}

}