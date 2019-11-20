package by.htp.les06.main;

public class Main4 {

	/*
	 * Сортировка обменами. Дана последовательность чисел.Требуется переставить
	 * числа в порядке возрастания. Для этого сравниваются два соседних числа a(i) и
	 * a(i + 1) . Если a(i) > a(i + 1) , то делается перестановка. Так продолжается
	 * до тех пор, пока все элементы не станут расположены в порядке возрастания.
	 * Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
	 */

	public static void main(String[] args) {
		int[] array = {10, 2, 10, 3, 1, 2, 5};
		int num;

		num = sort(array);
		print(array);
		System.out.println("num = " + num);
	}
	
	public static void print(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println("Ar[" + i + "] = " + ar[i]);
		}
	}
	
	public static int sort(int[] array) {
		boolean needIteration = true;
		int num;
		
		num = 0;
		while (needIteration) {
			needIteration = false;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					int tmp = array[i];
				    array[i] = array[i + 1];
				    array[i + 1] = tmp;
					num++;
					needIteration = true;
				}
			}
		}
		
		return num;
	}

}
