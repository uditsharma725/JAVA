import java.util.*;

public class creating {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int n = sc.nextInt();
            int m = sc.nextInt();
            int matrix[][] = new int[n][m];

            // input:
            for(int i=0; i<n; i++) {
                for(int j=0; j<m; j++){
                    matrix[i][j] = sc.nextInt();
                }
            }

            //output:
            for(int i=0; i<n; i++) {
                for(int j=0; j<m; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Rows = " + matrix.length);
            System.out.print("Cols = " + matrix[0].length);

        } finally {
            sc.close();
        }

    }
}
