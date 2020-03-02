/**
 * 
 */
package competitive;

import java.util.Arrays;

/**
 * @author sunnyb
 *
 */
public class ArrayLeftRotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] a = new int[] { 1, 2, 3, 4, 5 };

		int d = 3, size = a.length, rotatedIndex;
		rotatedIndex = d;

		int rotatedArray[] = new int[size];

		for (int i = 0; i < size; i++) {

			if (rotatedIndex == size) {
				rotatedIndex = 0;
			}

			rotatedArray[i] = a[rotatedIndex++];
		}

		Arrays.stream(rotatedArray).forEach((e) -> System.out.println(e));
	}

}
