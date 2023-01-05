import java.util.Scanner;
import java.util.StringTokenizer;

class Binary_Search {

}

public class Binary_Search_Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int[] array = new int[20];
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        while (st.hasMoreTokens()) {
            array[++i] = Integer.parseInt(st.nextToken());
        }
        int size = i;
        System.out.println(size);
        Quick_Sort qs = new Quick_Sort(array, size);
        for (i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        sc.close();
    }
}
