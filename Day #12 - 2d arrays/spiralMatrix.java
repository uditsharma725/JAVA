import java.util.*;

public class spiralMatrix {

    public static void spiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol) {
            // top part:
            for(int i=startRow; i<=endCol; i++) {
                System.out.print(matrix[startRow][i] + " ");
            }

            // right part:
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endCol] + " ");
            }

            // bottom part:
            for(int i=endCol-1; i>=startCol; i--) {
                // so the top part does not repeat
                if(startRow == endRow) return;
                System.out.print(matrix[endRow][i] + " ");
            }

            // left part:
            for(int i=endRow-1; i>startRow; i--) {
                // so the right part does not repeat
                if(startCol == endCol) return;
                System.out.print(matrix[i][startCol] + " ");
            }

            startRow++; startCol++;
            endRow--; endCol--;
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int n = sc.nextInt();
            int m = sc.nextInt();
            int matrix[][] = new int[n][m];

            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    matrix[i][j] = sc.nextInt();
                }
            }

            for(int i=0; i<n; i++) {
                for(int j=0; j<m; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();

            spiral(matrix);

        } finally {
            sc.close();
        }

    }
}