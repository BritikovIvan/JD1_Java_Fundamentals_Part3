package by.htp.les07.main;

public class Main24 {

	/*
	 * Дан линейный массив. Получить действительную
	 * квадратную матрицу порядка n:
	 */

	public static void main(String[] args) {
		int[] ar1 = { 1, 2, 3, 4, 5 };
		int[][] ar2;
		ar2 = fun(ar1);
		print(ar2);
	}
	
	public static void print(int[][] ar) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static int[][] fun(int[] ar1){
		int[][] ar;
		int len = ar1.length;
		
		ar = new int[len][len];
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = (int) Math.pow(ar1[j], i + 1);
			}
		}
		
		return ar;
	}

}
