package by.htp.les07.main;

public class Main11 {

	/*
	 * Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая
	 * строка справа налево, вторая строка слева направо, третья строка справа
	 * налево и так далее.
	 */

	public static void main(String[] args) {
		int[][] ar = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12} };
		print(ar);
	}
	
	public static void print(int[][] ar) {
		for (int i = 0; i < ar.length; i++) {
			if (i % 2 == 0) {
				for (int j = ar[i].length - 1; j >= 0; j--) {
					System.out.print(ar[i][j] + "\t");
				}
			} else {
				for (int j = 0; j < ar[i].length; j++) {
					System.out.print(ar[i][j] + "\t");
				}
			}
			System.out.println();
		}
	}

}
