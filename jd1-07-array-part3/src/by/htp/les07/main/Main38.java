package by.htp.les07.main;

public class Main38 {

	/*
	 * Найдите сумму двух матриц
	 */

	public static void main(String[] args) {
		int[][] a = { {1, 2}, {3, 4} };
		int[][] b = { {1, 3}, {5, 7} };
		int[][] c;
		
		c = sum(a, b);
		print(c);
	}
	
	public static void print(int[][] ar) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.printf("%d \t", ar[i][j]);
			}
			System.out.println();
		}
	}
	
	public static int[][] sum(int[][] a, int[][] b){
		int[][] rez;
		
		rez = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				rez[i][j] = a[i][j] + b[i][j];
			}
		}
		
		return rez;
	}
			
			
}
