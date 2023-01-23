import java.util.*;

public class qFloodFill {

    public static void helper(int image[][], int sr, int sc, boolean vis[][], int color, int orgColor) {
        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || vis[sr][sc] || image[sr][sc] != orgColor) return;

        image[sr][sc] = color;

        helper(image, sr+1, sc, vis, color, orgColor);
        helper(image, sr-1, sc, vis, color, orgColor);
        helper(image, sr, sc+1, vis, color, orgColor);
        helper(image, sr, sc-1, vis, color, orgColor);
    }

    public static int[][] floodFill(int image[][], int sr, int sc, int color) {
        
        boolean vis[][] = new boolean[image.length][image[0].length];
        helper(image, sr, sc, vis, color, image[sr][sc]);

        return image;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int image[][] = { {1,1,1},
                              {1,1,0},
                              {1,0,1} };

            image = floodFill(image, 1, 1, 2);
            for(int i=0; i<image.length; i++) {
                for(int j=0; j<image[i].length; j++) {
                    System.out.print(image[i][j] + " ");
                } System.out.println();
            }

        } finally {
            sc.close();
        }

    }
}