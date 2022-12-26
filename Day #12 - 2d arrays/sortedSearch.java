import java.util.*;

public class sortedSearch {

    public static boolean search(int matrix[][], int key) {
        
        int row = 0;
        int col = matrix[0].length - 1;
        
        while(row < matrix.length && col >= 0) {
            if(matrix[row][col] == key) return true;
            else if(matrix[row][col] < key) row++;
            else col--;
        }

        return false;
    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int n = sc.nextInt();
            int m = sc.nextInt();
            int matrix[][] = new int[n][m];

            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            
            int key = sc.nextInt();
            boolean found = search(matrix, key);
            if(found) System.out.print("YES");
            else System.out.print("NO");

        } finally {
            sc.close();
        }

    }
}