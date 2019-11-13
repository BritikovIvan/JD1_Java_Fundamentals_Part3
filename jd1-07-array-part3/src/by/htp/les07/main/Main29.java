package by.htp.les07.main;

public class Main29 {

	/*
	 * Найти положительные элементы главной диагонали квадратной матрицы.
	 */

	public static void main(String[] args) {
		int[][] ar = { { 1, 1, 20 }, { 1, -2, 3 }, { 4, 5, 6 } };
		int[] ans;
		
		ans = fun(ar);
		print(ans);
	}
	
	public static void print(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println("Ar[" + i + "] = " + ar[i]);
		}
	}
	
	public static int[] fun(int[][] ar) {
		int[] ans;
		int length;
		int j;
		
		length = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i][i] > 0) {
				length++;
			}
		}
		
		ans = new int[length];
		j = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i][i] > 0) {
				ans[j++] = ar[i][i];
			}
		}
		
		return ans;
	}

}
