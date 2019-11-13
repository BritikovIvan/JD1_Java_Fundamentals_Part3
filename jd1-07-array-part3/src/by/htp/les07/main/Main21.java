package by.htp.les07.main;

public class Main21 {

	/*
	 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
	 */

	public static void main(String[] args) {
		int[][] ar;
		int n = 6;
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
		int j;
		int l;
		
		for (int i = 0; i < ar.length; i++) {
			j = n - 1;
			while (j > i) {
				ar[i][j] = 0;
				j--;
			}
			l = 0;
			for (; j >= 0; j--) {
				ar[i][j] = n - l++;
			}
		}

		return ar;
	}

}
