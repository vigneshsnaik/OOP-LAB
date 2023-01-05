import java.util.Scanner;
import java.util.StringTokenizer;

public class Quick_Sort {

    void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int pi = partition(array, start, end);
            quickSort(array, start, pi - 1);
            quickSort(array, pi + 1, end);
        }
    }

    int partition(int[] array, int start, int end) {
        int pivot = array[start], temp;
        int i = start + 1, j = end;
        while (i < j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }

            if (array[i] > array[j]) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        temp = array[start];
        array[j] = array[start];
        array[start] = temp;
        System.out.println((j));
        return j;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        Quick_Sort qs = new Quick_Sort();
        int[] array = new int[30];
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        while (st.hasMoreTokens()) {
            array[i++] = Integer.parseInt(st.nextToken());
        }
        qs.quickSort(array, 0, i);
        int size = i;
        for (i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        sc.close();
    }
}
