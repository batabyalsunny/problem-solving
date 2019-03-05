package ds;

public class OddAppearingElement {

	public static int getOddAppearingElementXOR(int[] arr) {

		int element = 0;

		for (int i : arr)
			element = element ^ i;

		return element;
	}

	public static void main(String[] args) {

		int arr[] = { 2, 1, 1, 2, 2, 1, 1, 2, 2, 3, 2, 5, 5 };

		System.out.println(getOddAppearingElementXOR(arr));
	}

}
