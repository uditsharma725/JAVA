import java.util.*;

public class q3Transpose {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr[][] = new int[n][m];

            for(int i=0; i<n; i++) {
                for(int j=0; j<m; j++){
                    arr[i][j] = sc.nextInt();
                }
            }

            for(int i=0; i<n; i++) {
                for(int j=0; j<m; j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println();

            int arrT[][] = new int[m][n];
            for(int i=0; i<n; i++) {
                for(int j=0; j<m; j++){
                    arrT[j][i] = arr[i][j];
                }
            }

            for(int i=0; i<m; i++) {
                for(int j=0; j<n; j++){
                    System.out.print(arrT[i][j] + " ");
                }
                System.out.println();
            }

        } finally {
            sc.close();
        }

    }
}