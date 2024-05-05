package Array_1;

import java.util.*;

public class ReverseRange {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int i = kb.nextInt();
		int j = kb.nextInt();
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		for (int a = 0; a < arr.length; a++) {
			System.out.print(arr[a] + " ");
		}
		System.out.println();
		ReversesRange(arr, i, j);
		for (int a = 0; a < arr.length; a++) {
			System.out.print(arr[a] + " ");
		}
	}
	public static void ReversesRange(int[] arr, int i, int j) {
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
}
