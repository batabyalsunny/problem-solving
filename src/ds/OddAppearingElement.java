package ds;

public class OddAppearingElement {

	public static int getOddAppearingElementXOR(int[] arr) {

		int element = 0;

		for (int i : arr)
			element = element ^ i;

		return element;
	}

	public static void main(String[] args) {

		int arr[] = { 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2 };

		System.out.println(getOddAppearingElementXOR(arr));
	}

}
