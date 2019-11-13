package by.htp.les07.main;

public class Main22 {

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
			l = i + 1;
			for (j = 0; j < n - i; j++) {
				ar[i][j] = l++;
			}
			while (j < n) {
				ar[i][j] = 0;
				j++;
			}
		}

		return ar;
	}

}
