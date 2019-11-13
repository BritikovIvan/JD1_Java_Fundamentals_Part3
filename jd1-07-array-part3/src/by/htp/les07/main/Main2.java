package by.htp.les07.main;

import java.util.Random;

public class Main2 {

	/*
	 * Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из
	 * [0, 9].
	 */

	public static void main(String[] args) {
		int[][] ar = new int[2][3];
		fun(ar);
		print(ar);
	}
	
	public static void print(int[][] ar) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void fun(int[][] ar) {
		Random rand = new Random();
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = rand.nextInt(10);
			}
		}
	}

}
