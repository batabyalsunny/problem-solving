package ds.array;

public class EquilibriumIndex {

	public static void main(String[] args) {
		
		int arr[] = { 2, 3, 4, 1, 4, 5 }, n, i, leftSum = 0, rightSum = 0;

		n = arr.length;

		for (i = 1; i < n; i++) {
			
			rightSum += arr[i];
		}
		
		for (i = 0; i < n - 1; i++) {
			
			if (leftSum == rightSum) {				
				break;
			} else if (leftSum < rightSum) {
				leftSum += arr[i];
				rightSum -= arr[i+1];
			}
		}
		
		System.out.println(arr[i]);
	}

}
