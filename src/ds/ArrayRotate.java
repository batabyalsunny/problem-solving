package ds;

public class ArrayRotate {

	public static void main(String[] args) {

		int arr[] = { 1, 4, 3, 6, 5, 2, 9, 4 }, d = 3, temp, n;

		n = arr.length;

		for (int i = 0; i < d; i++) {

			temp = arr[i];
			arr[i] = arr[n - d - i - 1];
			arr[n - d - i - 1] = temp;
		}

		for (int i : arr)
			System.out.println(i);
	}

}
