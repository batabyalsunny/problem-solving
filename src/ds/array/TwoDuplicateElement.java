package ds.array;

public class TwoDuplicateElement {

	public static void main(String[] args) {

		int arr[] = { 1, 1, 2, 3, 2 }, n;

		n = arr.length;

		for (int i = 0; i < n; i++) {

			int key = arr[Math.abs(arr[i])];

			if (0 > key)
				System.out.println(Math.abs(arr[i]));
			else
				arr[Math.abs(arr[i])] = -key;
		}

	}

}
