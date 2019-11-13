package by.htp.les07.main;

public class Main6 {

	/*
	 * Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент
	 * больше последнего.
	 */

	public static void main(String[] args) {
		int[][] ar = { { 1, 1, 20 }, { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		print(ar);
		fun(ar);
	}

	public static void fun(int[][] ar) {
		for (int i = 0; i < ar[0].length; i += 2) {
			if (ar[0][i] > ar[ar.length - 1][i]) {
				System.out.println("\n" + (i + 1) + " column: ");
				
				for (int j = 0; j < ar.length; j++) {
					System.out.print(ar[j][i] + "\t");
				}
			}
			System.out.println();
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
