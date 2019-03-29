package ds.array;

public class MajorityElement {

	public static int findCandidateIndex(int[] arr) {

		int count = 1, index = 0;

		int length = arr.length;

		for (int i = 0; i < length; i++) {

			if (arr[i] == arr[index])
				count++;
			else
				count--;

			System.out.println(count + " " + index);

			if (0 == count) {
				index = i;
				count = 1;
			}

		}

		return index;
	}

	public static boolean checkMajority(int[] arr, int index) {

		int occurrence = 0, length = arr.length;

		for (int element : arr)
			if (arr[index] == element)
				occurrence++;

		return (occurrence > (length / 2));
	}

	public static void main(String[] args) {

		int arr[] = { 3, 3, 4, 2, 4, 4, 2, 4, 4 };

		int majorityIndex = findCandidateIndex(arr);

		if (checkMajority(arr, majorityIndex))
			System.out.println("Majority Element : " + arr[majorityIndex]);
		else
			System.out.println("No Majority Element");

	}

}
