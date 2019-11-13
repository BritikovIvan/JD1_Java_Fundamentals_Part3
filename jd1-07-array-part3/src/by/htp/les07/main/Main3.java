package by.htp.les07.main;

public class Main3 {

	/*
	 * Дана матрица. Вывести на экран первый и последний столбцы.
	 */

	public static void main(String[] args) {
		int[][] ar = { {0, 1, 0}, {1, 2, 3}, {4, 5, 6} };
		print(ar);
		fun(ar);
	}
	
	public static void fun(int[][] ar) {
		System.out.println("First column: ");
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i][0] + "\t");
		}
		
		System.out.println("\nLast column: ");
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i][ar[i].length - 1] + "\t");
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
