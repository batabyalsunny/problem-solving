package ds;

public class ArrayReverse {

	public static void main(String[] args) {

		int arr[] = { 1, 4, 3, 6, 5, 2, 9, 4 }, n, temp, mid;

		n = arr.length;
		mid = n / 2;

		for (int i = 0; i < mid; i++) {

			temp = arr[i];
			arr[i] = arr[n - i - 1];
			arr[n - i - 1] = temp;
		}

		for (int i : arr)
			System.out.println(i);
	}

}
