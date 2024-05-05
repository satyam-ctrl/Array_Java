package Array_1;

import java.util.*;

public class SwapArray {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int i = kb.nextInt();
		int j = kb.nextInt();
		int arr[] = { 2, 3, 4, 5, 6 };
		System.out.print(arr[i] + " " + arr[j]+ "\n");
		Swap(arr, i, j);
		System.out.print(arr[i] + " " + arr[j]);
	}

	public static void Swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
