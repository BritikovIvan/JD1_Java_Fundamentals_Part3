package by.htp.les07.main;

public class Main40 {

	/*
	 * Магическим квадратом порядка n называется квадратная матрица размера nxn,
	 * составленная из чисел 1, 2, 3, ..., 2 n так, что суммы по каждому столбцу,
	 * каждой строке и каждой из двух больших диагоналей равны между собой.
	 * Построить такой квадрат.
	 */

	public static void main(String[] args) {
		int[][] ar;
		int n = 3;

		ar = array(n);
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

	public static int[][] array(int n) {
		int[][] ar = new int[n][n];
		int[][] ar2 = { { 6, 1, 8 }, { 7, 5, 3 }, { 2, 9, 4 } };
		int t;
		int count = fuctorial(n * n);
		int max;
		int shift;

		n = 1;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				ar[i][j] = n++;
			}
		}

		max = ar.length * ar.length - 1;
		shift = max;

		while (count > 0) {
			t = ar[shift / ar.length][shift % ar.length];
			ar[shift / ar.length][shift % ar.length] = ar[(shift - 1) / ar.length][(shift - 1) % ar.length];
			ar[(shift - 1) / ar.length][(shift - 1) % ar.length] = t;

			print(ar);
			System.out.println();

			if (isMagic(ar)) {
				break;
			}

			count--;
			if (shift < 2) {
				shift = max;
			} else {
				shift--;
			}
		}

		return ar;
	}

	public static boolean isMagic(int[][] ar) {
		int sum;
		int sum2;
		int j;

		sum = 0;
		for (int i = 0; i < ar.length; i++) {
			sum += ar[i][0];
		}

		j = 1;
		while (j < ar.length) {
			sum2 = 0;
			for (int i = 0; i < ar.length; i++) {
				sum2 += ar[i][j];
			}
			if (sum != sum2) {
				return false;
			}
			j++;
		}

		j = 0;
		while (j < ar.length) {
			sum2 = 0;
			for (int i = 0; i < ar.length; i++) {
				sum2 += ar[j][i];
			}
			if (sum != sum2) {
				return false;
			}
			j++;
		}

		sum2 = 0;
		for (int i = 0; i < ar.length; i++) {
			sum2 += ar[i][i];
		}
		if (sum != sum2) {
			return false;
		}

		sum2 = 0;
		for (int i = 0; i < ar.length; i++) {
			sum2 += ar[i][ar.length - i - 1];
		}
		if (sum != sum2) {
			return false;
		}

		return true;
	}

	public static int fuctorial(int n) {
		return (n > 0) ? n * fuctorial(n - 1) : 1;
	}

}
