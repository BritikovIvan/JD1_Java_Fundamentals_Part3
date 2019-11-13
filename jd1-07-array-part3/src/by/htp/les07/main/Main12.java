package by.htp.les07.main;

public class Main12 {

	/*
	 * Получить квадратную матрицу порядка n:
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
	
	public static int[][] fun(int n){
		int[][] ar = new int[n][n];
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if (i == j) {
					ar[i][j] = i;
				} else {
					ar[i][j] = 0;
				}
			}
		}
		
		return ar;
	}

}
