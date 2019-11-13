package by.htp.les07.main;

public class Main19 {

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
		int i;
		
		for (i = 0; i < ar.length / 2; i++) {
			j = 0; 
			while (j < i) {
				ar[i][j] = 0;
				j++;
			}
			for (j = i; j < ar[i].length - i; j++) {
				ar[i][j] = 1;
			}
			while (j < ar[i].length) {
				ar[i][j] = 0;
				j++;
			}
		}
		
		for (; i < ar.length; i++) {
			j = 0; 
			while (j < n - i - 1) {
				ar[i][j] = 0;
				j++;
			}
			for (j = n - i - 1; j < ar[i].length + i + 1 - n; j++) {
				ar[i][j] = 1;
			}
			while (j < ar[i].length) {
				ar[i][j] = 0;
				j++;
			}
		}

		return ar;
	}

}
