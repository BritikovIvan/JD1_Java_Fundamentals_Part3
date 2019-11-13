package by.htp.les07.main;

public class Main28 {

	/*
	 * Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом
	 * столбце. Определить, какой столбец содержит максимальную сумму.
	 */

	public static void main(String[] args) {
		int[][] ar = { { 1, 1, 20 }, { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[] sum;
		int maxSum;

		sum = sum(ar);
		print(sum);

		maxSum = maxSum(ar);
		System.out.println(maxSum + " column");
	}

	public static void print(int[][] ar) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void print(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println("Ar[" + i + "] = " + ar[i]);
		}
	}

	public static int[] sum(int[][] ar) {
		int[] sum;
		int sum1;

		sum = new int[ar[0].length];
		for (int i = 0; i < ar[0].length; i++) {
			sum1 = 0;
			for (int j = 0; j < ar.length; j++) {
				sum1 += ar[j][i];
			}
			sum[i] = sum1;
		}

		return sum;
	}
	
	public static int maxSum(int[][] ar) {
		int maxSum;
		int[] sum;
		int ind;
		
		sum = sum(ar);
		maxSum = sum[0];
		ind = 0;
		
		for (int i = 0; i < sum.length; i++) {
			if (sum[i] > maxSum) {
				maxSum = sum[i];
				ind = i;
			}
		}
		
		return ind;
	}

}
