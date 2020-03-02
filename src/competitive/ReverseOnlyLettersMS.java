import java.util.Scanner;

public class ReverseOnlyLettersMS {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int len = s.length();
        int i = 0, j = len-1;
        char[] arr = s.toCharArray();

        while (i < j) {

            if (!Character.isLetter(arr[i])) {
                i++;
            } else if (!Character.isLetter(arr[j])) {
                j--;
            } else {
                char t = arr[i];
                arr[i++] = arr[j];
                arr[j--] = t;
            }
        }

        System.out.println(String.valueOf(arr));
    }
}