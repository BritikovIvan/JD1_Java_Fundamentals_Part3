package by.htp.les07.main;

public class Main39 {

	/*
	 * Найдите произведение двух матриц.
	 */

	public static void main(String[] args) {
		int[][] a = { {2, 0, -1}, {0, -2, 2} };
		int[][] b = { {4, 1, 0}, {3, 2, 1}, {0, 1, 0} };
		int[][] c;
		
		c = op(a, b);
		print(c);
	}
	
	public static void print(int[][] ar) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.printf("%+d \t", ar[i][j]);
			}
			System.out.println();
		}
	}	
	
	public static int[][] op(int[][] a, int[][] b){
		int[][] rez;
		
		rez = new int[a.length][b[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				rez[i][j] = 0;
				for (int k = 0; k < b.length; k++) {
					rez[i][j] += a[i][k] * b [k][j];
				}
			}
		}
		
		return rez;
	}
	
}
