package ds.array;

public class MaxJIDiff {

	public static void main(String[] args) {
		
		int arr[] = {34, 8, 10, 3, 2, 80, 30, 33, 1}, i = 0, j, length;
		
		length = arr.length;
		j = length - 1;
		
		while (i < j) {
			
			if (arr[j] > arr[i]) {
				break;
			} else {
				if (arr[i+1] < arr[j]) {
					i++;
				} else if (arr[j-1] > arr[i]) {
					j--;
				} else {
					i++;
					j--;
				}
			}
		}
		
		System.out.println(j-i);

	}

}
