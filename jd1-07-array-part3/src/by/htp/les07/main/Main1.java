package by.htp.les07.main;

public class Main1 {

	/*
	 * Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке
	 * была ровно одна единица, и вывести на экран.
	 */

	public static void main(String[] args) {
		int[][] ar = new int[3][4];
		fun(ar);
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
	
	public static void fun(int[][] ar) {
		for (int i = 0; i < ar.length; i++) {
			ar[i][0] = 1;
			
			for (int j = 1; j < ar[i].length; j++) {
				ar[i][j] = 0;
			}
		}
	}

}
