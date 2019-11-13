package by.htp.les07.main;

public class Main31 {

	/*
	 * Сформировать матрицу из чисел от 0 до 999, вывести ее на экран. Посчитать
	 * количество двузначных чисел в ней.
	 */

	public static void main(String[] args) {
		int[][] ar;
		int num;
		
		ar = fun();
		print(ar);
		num = num(ar);
		System.out.println("num = " + num);
	}
	
	public static void print(int[][] ar) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static int[][] fun(){
		int[][] ar = new int[100][10];
		
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 10; j++) {
				ar[i][j] = 10 * i + j;
			}
		}
		
		return ar;
	}
	
	public static int num(int[][] ar) {
		int num;
		
		num = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if (ar[i][j] >= 10 && ar[i][j] < 100) {
					num++;
				}
			}
		}
		
		return num;
	}

}
