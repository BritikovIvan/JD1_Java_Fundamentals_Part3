package by.htp.les07.main;

public class Main10 {

	/*
	 * Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
	 */

	public static void main(String[] args) {
		int[][] ar = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
		int k = 2;
		int p = 1;
		
		print(ar);
		print(ar, k, p);
	}
	
	public static void print(int[][] ar) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void print(int[][] ar, int k, int p) {
		System.out.println(k + " string: ");
		
		for (int i = 0; i < ar[k].length; i++) {
			System.out.print(ar[k][i] + "\t");
		}
		
		System.out.println("\n" + p + " column: ");
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i][p] + "\t");
		}
	}

}
