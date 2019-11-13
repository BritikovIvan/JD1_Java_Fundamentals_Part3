package by.htp.les07.main;

import java.util.Scanner;

public class Main27 {

	/*
	 * В числовой матрице поменять местами два столбца любых столбца, т. е. все
	 * элементы одного столбца поставить на соответствующие им позиции другого, а
	 * его элементы второго переместить в первый. Номера столбцов вводит
	 * пользователь с клавиатуры.
	 */

	public static void main(String[] args) {
		int[][] ar = { { 1, 1, 20 }, { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		swap(ar);
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
	
	public static void swap(int[][] ar) {
		int perm;
		int m;
		int n;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of columns: ");
		m = sc.nextInt();
		n = sc.nextInt();
		
		for (int i = 0; i < ar.length; i++) {
			perm = ar[i][m];
			ar[i][m] = ar[i][n];
			ar[i][n] = perm;
		}
	}

}
