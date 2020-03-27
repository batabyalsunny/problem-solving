/**
 * 
 */
package competitive;

/**
 * @author sunnyb
 *
 */
public class LargestSumContiguousSubarray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] arr = new int[] { -1, -3, 4, -1, -2, 1, 5, -3 };

		int currentMax = 0, maxTillNow = 0, s = 0, e = 0;

		for (int i = 0; i < arr.length; i++) {

			currentMax += arr[i];

			if (currentMax > maxTillNow) {
				e = i;
				maxTillNow = currentMax;
			}

			if (currentMax < 0) {
				currentMax = 0;
				s = i + 1;
			}
		}

		System.out.println("Start => " + s + " End => " + e);
	}

}
