package ds;

import java.util.HashMap;
import java.util.Map;

public class SumOfPair {

	public static void main(String[] args) throws java.lang.Exception {
		int arr[] = { 3, 4, 2, 7, 6, 8, 1, 9 };

		int x = 8;

		String pair = "Unable to find";

		Map<Integer, Integer> map = new HashMap<>();

		for (int i : arr) {

			int complement = x - i;

			if (map.containsKey(i)) {
				pair = complement + ", " + i;
				break;
			} else
				map.put(complement, i);
		}

		System.out.println("Pair : " + pair);
	}

}
