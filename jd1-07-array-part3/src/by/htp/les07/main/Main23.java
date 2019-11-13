package by.htp.les07.main;

public class Main23 {

	/*
	 * Сформировать квадратную матрицу порядка N по правилу:
	 * и подсчитать количество положительных элементов в ней. 
	 */

	public static void main(String[] args) {
		double[][] ar;
		int num;
		int n = 6;
		ar = fun(n);
		print(ar);
		num = num(ar);
		System.out.println("num = " + num);
	}

	public static void print(double[][] ar) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.printf("%+4.3f ",ar[i][j]);
			}
			System.out.println();
		}
	}

	public static double[][] fun(int n) {
		double[][] ar = new double[n][n];

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = Math.sin((i * i - j * j) / n);
			}
		}

		return ar;
	}
	
	public static int num(double[][] ar) {
		int num = 0;
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if (ar[i][j] > 0) {
					num++;
				}
			}
		}
		
		return num;
	}

}
