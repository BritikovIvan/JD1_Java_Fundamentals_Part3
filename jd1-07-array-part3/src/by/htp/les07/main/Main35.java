package by.htp.les07.main;

public class Main35 {

	/*
	 * Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
	 */

	public static void main(String[] args) {
		int[][] ar = { { 1, 1, 20 }, { 1, 21, 3 }, { 4, -5, 6 }, { 7, 8, 9 } };
		
		fun(ar);
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
	
	public static void fun(int[][] ar) {
		int max = max(ar);
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if ((i * ar[i].length + j + 1) % 2 == 1) {
					ar[i][j] = max;
				}
			}
		}
	}
	
	public static int max(int[][] ar) {
		int max = ar[0][0];
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if (ar[i][j] > max) {
					max = ar[i][j];
				}
			}
		}
		
		return max;
	}

}
