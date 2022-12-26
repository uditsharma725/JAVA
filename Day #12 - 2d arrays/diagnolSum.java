import java.util.*;

public class diagnolSum {

    public static void diagnol(int matrix[][]) {        
        // // primary sum:
        // int primary = 0;
        // for(int i=0; i<matrix.length; i++) {
        //     for(int j=0; j<matrix[0].length; j++) {
        //         if(i == j) primary += matrix[i][j];
        //     }
        // }

        // // secondary sum:
        // int secondary = 0;
        // for(int i=matrix.length-1; i>=0; i--){
        //     for(int j=matrix[0].length-1; j>=0; j--){
        //         if(i == j) secondary += matrix[i][j];
        //     }
        // }

        // System.out.print("Sum = " + (primary+secondary));

        int sum = 0;
        for(int i=0; i<matrix.length; i++) {
            sum += matrix[i][i];
            if(i != matrix.length-1-i) sum += matrix[i][matrix[0].length-1-i];
        }

        System.out.println("Sum = " + sum);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int n = sc.nextInt();
            int m = sc.nextInt();
            int matrix[][] = new int[n][m];
            for(int i=0; i<n; i++) {
                for(int j=0; j<m; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            for(int i=0; i<n; i++) {
                for(int j=0; j<m; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

            diagnol(matrix);

        } finally {
            sc.close();
        }

    }
}