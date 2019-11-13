package by.htp.les07.main;

public class Main9 {

	/*
	 * Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
	 */

	public static void main(String[] args) {
		int[][] ar = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
		print(ar);
		System.out.println();
		diagonal(ar);
	}
	
	public static void diagonal(int[][] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i][i] + "\t");
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
