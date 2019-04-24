package ds.array;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		
		int arr[] = {1, 4, 20, 3, 10, 5}, expectedSum = 33, i, length, currentSum = 0, j = 0;
		
		length = arr.length;
		
		for (i = 0; i < length; i++) {
			
			if (currentSum > expectedSum) {
				currentSum -= arr[j];
				j++;
				continue;
			}
			
			currentSum += arr[i];
			
			if (currentSum == expectedSum) {
				break;
			}
		}
		
		System.out.println(j + " to " + i);
	}

}
