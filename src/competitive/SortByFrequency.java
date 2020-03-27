/**
 * 
 */
package competitive;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sunnyb
 *
 */
public class SortByFrequency {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] arr = { 3, 1, 2, 2, 4, 5, 6, 3, 2, 1, 5, 4 };

		Map<Integer, Integer> map = new HashMap<>();

		for (int i : arr) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}

		map.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()).forEach(e -> {
			int key = e.getKey();
			int val = e.getValue();
			for (int i = 0; i < val; i++) {
				System.out.println(key);
			}
		});
	}

}
