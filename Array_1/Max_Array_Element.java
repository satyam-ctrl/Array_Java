package Array_1;

public class Max_Array_Element {

	public static void main(String[] args) {
		int[] arr = { 10, 700, 30, 40, 90 };
		MaxElement(arr);
	}

	public static void MaxElement(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Max element = " + max);
	}
}
