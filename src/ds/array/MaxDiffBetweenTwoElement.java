package ds.array;

public class MaxDiffBetweenTwoElement {

	public static void main(String[] args) {
		
		int arr[] = {1, 2, 90, 10, 110}, n, min, maxDiff, currentDiff, i;

		n = arr.length;

		min = arr[0];
		maxDiff = arr[1] - arr[0];
		
		for(i = 1; i < n; i++) {
			
			// Calculate diff.
			currentDiff = arr[i] - min;
			
			if (currentDiff > maxDiff) {
				maxDiff = currentDiff;
			}
			
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println(maxDiff);
	}

}
