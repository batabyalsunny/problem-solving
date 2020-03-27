package competitive;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SameString {
	public static void main(String args[]) throws Exception {
		/*
		 * Sample code to perform I/O: Use either of these methods for input
		 * 
		 * //BufferedReader BufferedReader br = new BufferedReader(new
		 * InputStreamReader(System.in)); String name = br.readLine(); // Reading input
		 * from STDIN System.out.println("Hi, " + name + "."); // Writing output to
		 * STDOUT
		 */

		// Scanner
		Scanner s = new Scanner(System.in);
		int N = Integer.parseInt(s.nextLine());
		String[] S = new String[N];
		String[] T = new String[N];
		Map<Character, Integer> m = new HashMap<>();

		for (int i = 0; i < N; i++) {
			S[i] = s.nextLine();
			T[i] = s.nextLine();
		}

		// Write your code here
		for (int i = 0; i < N; i++) {
			if (S[i].length() != T[i].length()) {
				System.out.println("NO");
			} else {
				char[] sArr = S[i].toCharArray();
				char[] tArr = T[i].toCharArray();

				for (int j = 0; j < sArr.length; j++) {
					if (m.containsKey(sArr[j])) {
						m.put(sArr[j], m.get(sArr[j]) + 1);
					} else {
						m.put(sArr[j], 1);
					}

					if (m.containsKey(tArr[j])) {
						m.put(tArr[j], m.get(tArr[j]) + 1);
					} else {
						m.put(tArr[j], 1);
					}
				}

				int flag = 0;

				for (Map.Entry<Character, Integer> entry : m.entrySet()) {
					if ((entry.getValue() % 2) != 0) {
						System.out.println("NO");
						flag = 1;
						break;
					}
				}

				if (flag == 0) {
					System.out.println("YES");
				}
			}
		}
	}
}