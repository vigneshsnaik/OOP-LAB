import java.util.Scanner;

public class MatrixMultiply {

        
    public void printMatrix(int[][] m, int p, int q) {
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                System.out.printf("%4d", m[i][j]);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        MatrixMultiply mat = new MatrixMultiply();
        int p1, q1, p2, q2;
        int[][] a = new int[10][10];
        int[][] b = new int[10][10];
        int[][] c = new int[10][10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions of first matrix");
        p1 = sc.nextInt();
        q1 = sc.nextInt(); 
        System.out.println("Enter the dimensions of second matrix");
        p2 = sc.nextInt();
        q2 = sc.nextInt();
        System.out.println("Enter the first matrix");
        for (int i = 0; i < p1; i++) {
            for (int j = 0; j < q1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the second matrix");
        for (int i = 0; i < p2; i++) {
            for (int j = 0; j < q2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        sc.close();
        if(q1!=p2){
            System.out.println("invalid Dimensions");
        }else{
        for (int i = 0; i < p1; i++) {
            for (int j = 0; j < q2; j++) {
                for (int k = 0; k < q1; k++) {
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("the multiplied matrix is:");
        mat.printMatrix(c, p1, q2);
        }
    }
}
