package competitive.toptal;

import java.util.HashMap;
import java.util.Map;

public class IncludePoints {

	public static void main(String[] args) {
		System.out.println(
				new IncludePoints().solution("ABCDA", new int[] { 2, -1, -4, -3, 3 }, new int[] { 2, -2, 4, 1, 3 }));
	}

	public int solution(String s, int[] x, int[] y) {

		Map<Character, Double> map = new HashMap<>();
		Map<Character, Double> visit = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			double d = Math.sqrt((x[i] * x[i]) + (y[i] * y[i]));

			if (visit.containsKey(c)) {

				if (visit.get(c) > d) {
					visit.put(c, d);
				}

				if (map.containsKey(i)) {
					if (map.get(i) > d) {
						continue;
					}
				}

				map.put(c, d);
			} else {
				visit.put(c, d);
			}

		}

		double min = Integer.MAX_VALUE;

		for (Map.Entry<Character, Double> entry : map.entrySet()) {
			if (entry.getValue() < min) {
				min = entry.getValue();
			}
		}

		int result = 0;

		for (Map.Entry<Character, Double> entry : visit.entrySet()) {
			if (entry.getValue() < min) {
				result++;
			}
		}

		return result;
	}
}