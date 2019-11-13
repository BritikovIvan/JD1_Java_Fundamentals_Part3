package by.htp.les07.main;

import java.util.Scanner;

public class Main26 {

	/*
	 * С клавиатуры вводится двумерный массив чисел размерностью nxm. Выполнить с
	 * массивом следующие действия: а) вычислить сумму отрицательных элементов в
	 * каждой строке; б) определить максимальный элемент в каждой строке; в)
	 * переставить местами максимальный и минимальный элементы матрицы.
	 */

	public static void main(String[] args) {
		int[][] ar;
		int[] sum;
		int[] max;
		
		ar = read();
		print(ar);
		System.out.println();
		
		sum = sumNeg(ar);
		print(sum);
		System.out.println();
		
		max = max(ar);
		print(max);
		System.out.println();
		
		rearrange(ar);
		print(ar);
	}
	
	public static void print(int[][] ar) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.printf("%+d \t", ar[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void print(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println("Ar[" + i + "] = " + ar[i]);
		}
	}
	
	public static int[][] read(){
		int m;
		int n;
		int[][] ar;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array m x n: ");
		System.out.print("m = ");
		m = sc.nextInt();
		System.out.print("n = ");
		n = sc.nextInt();
		ar = new int[m][n];
		
		for (int i = 0; i < m; i++) {
			System.out.println((i + 1) + " string:");
			for (int j = 0; j < n; j++) {
				ar[i][j] = sc.nextInt();
			}
		}
		
		return ar;
	}
	
	public static int[] sumNeg(int[][] ar) {
		int[] sum;
		int sum1;
		
		sum = new int[ar.length];
		for (int i = 0; i < ar.length; i++) {
			sum1 = 0;
			for (int j = 0; j < ar[i].length; j++) {
				if (ar[i][j] < 0) {
					sum1 += ar[i][j];
				}
			}
			sum[i] = sum1;
		}
		
		return sum;
	}
	
	public static int[] max(int[][] ar) {
		int[] max;
		int max1;
		
		max = new int[ar.length];
		for (int i = 0; i < ar.length; i++) {
			max1 = ar[i][0];
			for (int j = 1; j < ar[i].length; j++) {
				if (ar[i][j] > max1) {
					max1 = ar[i][j];
				}
			}
			max[i] = max1;
		}
		
		return max;
	}
	
	public static void rearrange(int[][] ar) {
		int max;
		int min;
		int[] maxind = new int[2];
		int[] minind = new int[2];
		
		max = ar[0][0];
		min = ar[0][0];
		
		maxind[0] = 0;
		maxind[1] = 0;
		
		minind[0] = 0;
		minind[1] = 0;
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if (ar[i][j] > max) {
					max = ar[i][j];
					maxind[0] = i;
					maxind[1] = j;
				}
				
				if (ar[i][j] < min) {
					min = ar[i][j];
					minind[0] = i;
					minind[1] = j;
				}
			}
		}
		
		ar[maxind[0]][maxind[1]] = min;
		ar[minind[0]][minind[1]] = max;
	}

}
