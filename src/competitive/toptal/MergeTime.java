package competitive.toptal;

import java.util.Arrays;

// package competitive;

public class MergeTime {

	public static void main(String[] args) {
		System.out.println(new MergeTime().solution(new int[] { 100, 250, 1000 }));
	}

	public int solution(int[] A) {

		Arrays.sort(A);
		int result = 0;

		for (int i = 0; i < A.length; i++) {

			if (i > 1) {
				result *= 2;
			}

			result += A[i];
		}

		return result;
	}
}