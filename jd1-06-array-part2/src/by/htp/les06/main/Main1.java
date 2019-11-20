package by.htp.les06.main;

public class Main1 {

	/*
	 * Заданы два одномерных массива с различным количеством элементов и натуральное
	 * число k. Объединить их в один массив, включив второй массив между k-м и (k+1)
	 * - м элементами первого, при этом не используя дополнительный массив.
	 */

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6};
		int[] b = {7, 8, 9};
		int[]c;
		int k = 4;
		
		c = fun(a, b, k);
		print(c);
	}
	
	public static int[] fun(int[]a, int[] b, int k) {
		int[] rez;
		int i;
		
		rez = new int[a.length + b.length];
		for (i = 0; i < k; i++) {
			rez[i] = a[i];
		}
		
		for (int j = 0; j < b.length; j++) {
			rez[i] = b[j];
			i++;
		}
		
		for (int j = k; j < a.length; j++) {
			rez[i] = a[j];
			i++;
		}
		
		return rez;
	}
	
	public static void print(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println("Ar[" + i +"] = " + ar[i]);
		}
	}

}
