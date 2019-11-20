package by.htp.les06.main;

public class Main9 {

	/*
	 * Алгоритм фон Неймана. Упорядочить массив a1, a2, ... , an по неубыванию с
	 * помощью алгоритма сортировки слияниями:
	 * 
	 * 
	 * 1) каждая пара соседних элементов сливается в одну группу из двух элементов
	 * (последняя группа может состоять из одного элемента); 2) каждая пара соседних
	 * двухэлементных групп сливается в одну четырехэлементную группу и т. д. При
	 * каждом слиянии новая укрупненная группа упорядочивается.
	 */

	public static void main(String[] args) {
		int[] ar = { 1, 4, 7, 9, 10, 23, 54, 3, 34, 72, 11, 10, 9 };
		
		mergeSort(ar, 0, ar.length - 1);
		print(ar);
	}
	
	public static void print(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println("Ar[" + i + "] = " + ar[i]);
		}
	}

	public static void mergeSort(int[] source, int left, int right) {
		int delimiter = left + ((right - left) / 2) + 1;
		
		if (delimiter > 0 && right > (left + 1)) {
            mergeSort(source, left, delimiter - 1);
            mergeSort(source, delimiter, right);
        }
		
		int[] buffer = new int[right - left + 1];
		
		int cursor = left;
		int d = delimiter;
        for (int i = 0; i < buffer.length; i++) {
           
            if (delimiter > right || source[cursor] < source[delimiter] && cursor < d) {
                buffer[i] = source[cursor];
                cursor++;
            } else {
                buffer[i] = source[delimiter];
                delimiter++;
            }
        }
        System.arraycopy(buffer, 0, source, left, buffer.length);
	}

}
