package by.htp.les07.main;

public class Main16 {

	/*
	 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
	 */

	public static void main(String[] args) {
		int[][] ar;
		int n = 4;
		ar = fun(n);
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

	public static int[][] fun(int n) {
		int[][] ar = new int[n][n];

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if (j == i) {
					ar[i][j] = (i + 1) * (i + 2);
				} else {
					ar[i][j] = 0;
				}
			}
		}

		return ar;
	}

}
