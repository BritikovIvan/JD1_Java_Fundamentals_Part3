package by.htp.les07.main;

import java.util.Random;

public class Main8 {

	/*
	 * Дан двухмерный массив n×m элементов. Определить, сколько раз встречается
	 * число 7 среди элементов массива. 
	 */

	public static void main(String[] args) {
		int[][] ar = new int[4][3];
		int num;
		
		rand(ar);
		print(ar);
		num = num(ar);
		System.out.println("num = " + num);
	}

	public static void rand(int[][] ar) {
		Random rand = new Random();
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = rand.nextInt(10);
			}
		}
	}
	
	public static void print(int[][] ar) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static int num(int[][] ar) {
		int num = 0;
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if (ar[i][j] == 7) {
					num++;
				}
			}
		}
		
		return num;
	}
	
}
