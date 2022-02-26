package com.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SprialPrint {
		public static void main(String[] args) {
			int[][] m = {
					{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12}
					
			};
			//sprialOrder(m);	
			System.out.println(sprialOrder(m));
		}

		private static List<Integer> sprialOrder(int[][] matrix) {
			List<Integer> list = new ArrayList<Integer>();
			int rs = 0;
			int re = matrix.length -1 ;
			int cs = 0;
			int ce = matrix[0].length -1;
			
			while (rs <= re && cs <= ce) {
				//go right
				for (int i = rs; i <= ce ; i++) {
					list.add(matrix[rs][i]);
				}
				rs++;
				
				//go down
				for (int i = rs; i <= re ; i++) {
					list.add(matrix[i][ce]);
				}
				ce--;
				
				if(rs <= re) {
					//go left
					for (int i = ce; i >= cs ; i--) {
						list.add(matrix[re][i]); 
					}
					
					re--;
				}
				
				
				if (cs <= ce) {
					// go up
					for (int i = re; i >= rs; i--) {
						list.add(matrix[i][cs]);
					}
					cs++;
				}
			}
			
			return list;
			
		}
		
		
		
}
