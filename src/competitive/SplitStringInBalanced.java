import java.util.Scanner;

public class SplitStringInBalanced {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(balancedStringSplit(s));
    }

    public static int balancedStringSplit(String s) {
        int count = 0, splitCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (currentChar == 'R') {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                splitCount++;
            }
        }
        
        return splitCount;
    }
}