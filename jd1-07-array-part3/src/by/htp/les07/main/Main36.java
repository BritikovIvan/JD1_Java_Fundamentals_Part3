package by.htp.les07.main;

public class Main36 {

	/*
	 * Операция сглаживания матрицы дает новую матрицу того же размера, каждый
	 * элемент которой получается как среднее арифметическое соседей
	 * соответствующего элемента исходной матрицы. Построить результат сглаживания
	 * заданной матрицы
	 */

	public static void main(String[] args) {
		double[][] ar = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		ar = smooth(ar);
		print(ar);
	}

	public static void print(double[][] ar) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.printf("%5.2f \t", ar[i][j]);
			}
			System.out.println();
		}
	}

	public static double[][] smooth(double[][] ar) {
		double[][] ans = new double[ar.length][ar[0].length];

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ans[i][j] = smooth(ar, i, j);
			}
		}

		return ans;
	}

	public static double smooth(double[][] ar, int i, int j) {
		double ans;
		int fromi = Math.max(i - 1, 0);
		int toi = Math.min(i + 1, ar.length - 1);
		int fromj = Math.max(j - 1, 0);
		int toj = Math.min(j + 1, ar[0].length - 1);
		int num;

		ans = 0;
		num = 0;
		for (int k = fromi; k <= toi; k++) {
			for (int m = fromj; m <= toj; m++) {
				ans += ar[k][m];
				num++;
			}
		}

		ans -= ar[i][j];
		num--;
		ans = ans / num;
		return ans;
	}

}
