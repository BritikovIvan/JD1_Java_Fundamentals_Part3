package by.htp.les07.main;

import java.util.Random;

public class Main7 {

	/*
	 * Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных
	 * элементов.
	 */

	public static void main(String[] args) {
		int[][] ar = new int[5][5];
		int sum;
		rand(ar);
		print(ar);
		sum = sum(ar);
		System.out.println("sum = " + sum);
	}
	
	public static void rand(int[][] ar) {
		Random rand = new Random();
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = rand.nextInt(10) - 5;
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
	
	public static int sum(int[][] ar) {
		int sum = 0;
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if (ar[i][j] < 0 && (-1 * ar[i][j]) % 2 == 1) {
					sum -= ar[i][j];
				}
			}
		}
		
		return sum;
	}

}
