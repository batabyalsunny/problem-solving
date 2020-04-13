package competitive;

public class CommonPrefix {

	public static void main(String[] args) {

		String[] s = { "codingclub", "coding", "coders", "codingmafia" };

		int minLength = Integer.MAX_VALUE;

		for (String string : s) {
			int l = string.length();
			if (minLength > l) {
				minLength = l;
			}
		}

		int i, flag = 0;

		for (i = 0; i < minLength; i++) {

			char first = s[0].charAt(i);

			for (String string : s) {
				if (first != string.charAt(i)) {
					flag = 1;
					break;
				}
			}

			if (flag == 1)
				break;
		}

		System.out.println(s[0].substring(0, i));
	}
}