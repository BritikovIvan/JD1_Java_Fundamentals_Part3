package by.htp.les07.main;

public class Main5 {

	/*
	 * Дана матрица. Вывести на экран все четные строки, то есть с четными номерами.
	 */

	public static void main(String[] args) {
		int[][] ar = { { 0, 1, 0 }, { 1, 2, 3 }, { 4, 5, 6 }, {7, 8, 9} };
		print(ar);
		fun(ar);
	}
	
	public static void fun(int[][] ar) {
		for (int i = 1; i < ar.length; i+= 2) {
			System.out.println("\n" + (i + 1) + " string : ");
			
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + "\t");
			}
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
