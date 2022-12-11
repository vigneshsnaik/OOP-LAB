import java.util.Scanner;

public class CharFreq {
    public static void main(String[] args) {
        int count=0;
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            char ch = sc.next().charAt(0);
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch)
                    count++;
            }
            System.out.print(ch + " is present " + count + " time");
        }
        if (count!=1)
            System.out.println("s");

    }
}
