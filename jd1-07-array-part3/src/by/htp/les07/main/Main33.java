package by.htp.les07.main;

public class Main33 {

	/*
	 * Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
	 */

	public static void main(String[] args) {
		int[][] ar = { { 1, 1, 20 }, { 1, 20, 3 }, { 4, -5, 6 }, { 7, 8, 9 } };

		sort1(ar);
		print(ar);
		System.out.println();

		sort2(ar);
		print(ar);
	}
	
	public static void print(int[][] ar) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.printf("%d \t", ar[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void sort1(int[][] ar) {
		int perm;
		for (int i = 0; i < ar[0].length; i++) {
			for (int j = 0; j < ar.length - 1; j++) {
				for (int k = j; k < ar.length; k++) {
					if (ar[j][i] > ar[k][i]) {
						perm = ar[j][i];
						ar[j][i] = ar[k][i];
						ar[k][i] = perm;
					}
				}
			}
		}
	}
	
	public static void sort2(int[][] ar) {
		int perm;
		for (int i = 0; i < ar[0].length; i++) {
			for (int j = 0; j < ar.length - 1; j++) {
				for (int k = j; k < ar.length; k++) {
					if (ar[j][i] < ar[k][i]) {
						perm = ar[j][i];
						ar[j][i] = ar[k][i];
						ar[k][i] = perm;
					}
				}
			}
		}
	}

}
