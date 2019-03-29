package ds.array;

public class SegregateZerosAndOnes {

	public static void main(String[] args) {

		int arr[] = { 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0 }, n = arr.length, i, j = 0;

		for (i = 0; i < n; i++)
			if (arr[i] == 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}

		for (int k : arr)
			System.out.println(k);
	}

}
