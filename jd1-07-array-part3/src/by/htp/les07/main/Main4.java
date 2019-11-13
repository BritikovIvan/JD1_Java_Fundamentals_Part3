package by.htp.les07.main;

public class Main4 {

	/*
	 * Дана матрица. Вывести на экран первую и последнюю строки.
	 */

	public static void main(String[] args) {
		int[][] ar = { { 0, 1, 0 }, { 1, 2, 3 }, { 4, 5, 6 } };
		print(ar);
		fun(ar);
	}

	public static void fun(int[][] ar) {
		System.out.println("First string: ");

		for (int i = 0; i < ar[0].length; i++) {
			System.out.print(ar[0][i] + "\t");
		}

		System.out.println("\nLast string: ");

		for (int i = 0; i < ar[ar.length - 1].length; i++) {
			System.out.print(ar[ar.length - 1][i] + "\t");
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

}
