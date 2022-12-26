import java.util.*;

public class nQueens {

    public static void print(char arr[][]) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean isSafe(char board[][], int row, int col) {
        
        // vertically upwards:
        for(int i=row-1; i>=0; i--) {
            if(board[i][col] == 'Q') return false;
        }

        // left diagnol:
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--) {
            if(board[i][j] == 'Q') return false;
        }

        //  right dialnol:
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++) {
            if(board[i][j] == 'Q') return false;
        }
        
        return true;
    }

    static int cnt = 0;
    public static void Queens(char board[][], int row) {
        if(row == board.length) {
            cnt++;
            print(board);
            return;
        }
        
        for(int j=0; j<board.length; j++) {
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                Queens(board, row+1);
                board[row][j] = 'x';
            }
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int n = sc.nextInt();
            char board[][] = new char[n][n];
            
            for(int i=0; i<n; i++) {
                for(int j=0; j<n; j++) {
                    board[i][j] = 'x';
                }
            }

            if(n < 4) System.out.println("No Solution");
            else Queens(board, 0); 
            System.out.print("Total ways = " + cnt);        

        } finally {
            sc.close();
        }

    }
}