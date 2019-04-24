package ds.array;

public class MergeNtoNPlusMArray {

	public static void main(String[] args) {

		int nArr[] = {2, 8, -1, -1, -1, 13, -1, 15, 20}, n;
		int mPlusNArr[] = {5, 7, 9, 25}, m, i, j, k;
		
		n = nArr.length;
		m = mPlusNArr.length;
		
		j = m - 1;
		
		// Push all the elements of m+n array to the extreme right.
		for(i = m - 1; i > 0; i--) {
			
			// If empty.
			if (-1 != mPlusNArr[i]) {
				mPlusNArr[j] = mPlusNArr[i];
				j--;
			}
		}
		
		k = 0;
		j++;
		i = 0;
		
		while(k < m) {
			
			if ((j < m && nArr[i] <= mPlusNArr[j])) {
				mPlusNArr[k] = nArr[i];
				i++;
			} else {
				mPlusNArr[k] = mPlusNArr[j];
				j++;
			}

			k++;
		}
	}

}
