import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            str = str.toLowerCase();
            for (int i = 0; i < str.length() / 2;) {
                if (str.charAt(i) != str.charAt(str.length() - i - 1))
                    System.out.print("Not ");
                break;
            }
            System.out.println("Palindrome");
        }
    }
}
