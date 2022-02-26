
package com.example;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FindLargest_ThreeNumber {
	public static void main(String[] args) {
		int x = 7;
		int y = 20;
		int z = 56;

		if (x > y && x > z) {
			
			System.out.println(x);

		} else if (y > x && y > z) {
			
			System.out.println(y);
			
		} else {
			System.out.println(z);
		}

	}
}
