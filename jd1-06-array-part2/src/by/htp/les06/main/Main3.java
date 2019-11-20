package by.htp.les06.main;

public class Main3 {

	/*
	 * Сортировка выбором. Дана последовательность чисел.Требуется
	 * переставить элементы так, чтобы они были расположены по убыванию. Для этого в
	 * массиве, начиная с первого, выбирается наибольший элемент и ставится на
	 * первое место, а первый - на место наибольшего. Затем, начиная со второго, эта
	 * процедура повторяется. Написать алгоритм сортировки выбором.
	 */

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 10, 20, 50};
		
		sort(array);
		print(array);
	}
	
	public static void print(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println("Ar[" + i + "] = " + ar[i]);
		}
	}
	
	public static void sort(int[] array) {
		for (int left = 0; left < array.length; left++) {
			int maxInd = left;
			for (int i = left; i < array.length; i++) {
				if (array[i] > array[maxInd]) {
					maxInd = i;
				}
			}
			
			int tmp = array[left];
		    array[left] = array[maxInd];
		    array[maxInd] = tmp;
		}
	}

}
