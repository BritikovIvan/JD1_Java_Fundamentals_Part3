package by.htp.les06.main;

public class Main10 {

	/*
	 * Сортировка подсчетом. Выходной массив заполняется значениями -1. Затем для
	 * каждого элемента определяется его место в выходном массиве путем подсчета
	 * количества элементов строго меньших данного. Естественно, что все одинаковые
	 * элементы попадают на одну позицию, за которой следует ряд значений -1. После
	 * этого оставшиеся в выходном массиве позиции со значением -1 заполняются
	 * копией предыдущего значения.
	 */

	public static void main(String[] args) {
		int[] ar = { 1, 4, 7, 9, 10, 23, 54, 3, 34, 72, 11, 10, 9 };

		ar = sort(ar);
		print(ar);
	}

	public static void print(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println("Ar[" + i + "] = " + ar[i]);
		}
	}

	public static int[] sort(int[] array) {
		int[] rez = new int[array.length];
		
		for (int i = 0; i < rez.length; i++) {
			rez[i] = -1;
		}
		
		for (int i = 0; i < array.length; i++) {
			int num = 0;
			int j = 0;
			
			while (j < array.length) {
				if (array[j] < array[i]) {
					num++;
				}
				j++;
			}
			
			rez[num] = array[i];
		}
		
		for (int i = 0; i < rez.length - 1; i++) {
			if (rez[i + 1] == -1) {
				rez[i + 1] = rez[i];
			}
		}
		
		return rez;
	}

}
