package by.htp.les07.main;

import java.util.Random;

public class Main30 {

	/*
	 * Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму
	 * матрицу и номера строк, в которых число 5 встречается три и более раз.
	 */

	public static void main(String[] args) {
		int[][] ar = new int[10][20];
		
		rand(ar);
		print(ar);
	}
	
	public static void rand(int[][] ar) {
		Random rand = new Random();
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = rand.nextInt(16);
			}
		}
	}
	
	public static void print(int[][] ar) {
		int num;
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("Numbers of strings: ");
		for (int i = 0; i < ar.length; i++) {
			num = 0;
			
			for (int j = 0; j < ar[i].length; j++) {
				if (ar[i][j] == 5) {
					num++;
				}
			}
			
			if (num >= 3) {
				System.out.print(i + "\t");
			}
		}
	}

}
