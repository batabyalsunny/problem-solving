package ds.array;

public class ArrayRotate {

	public int gcd(int a, int b) {

		if (0 == b)
			return a;
		else
			return gcd(b, a % b);
	}

	public static void main(String[] args) {

		int arr[] = { 1, 4, 3, 6, 5, 2, 9, 4 }, d = 3, temp, n, j, k;

		n = arr.length;

		ArrayRotate ar = new ArrayRotate();
		int gcd = ar.gcd(n, d);

		for (int i = 0; i < gcd; i++) {

			temp = arr[i];
			j = i;
			while (true) {

				k = j + d;
				if (k >= n)
					k = k - n;

				if (k == i)
					break;

				arr[j] = arr[k];
				j = k;
			}
			arr[j] = temp;
		}

		for (int i : arr)
			System.out.println(i);
	}

}
