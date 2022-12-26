import java.util.*;

public class qShortestPath {

    public static int sPath(String str) {
        int path = 0;
        int x = 0;
        int y = 0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'N') y++;
            else if(str.charAt(i) == 'E') x++;
            else if(str.charAt(i) == 'S') y--;
            else x--;
        }

        path = (int) Math.sqrt((x*x) + (y*y));

        return path;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            String str = sc.nextLine();

            int path = sPath(str);
            System.out.print(path);

        } finally {
            sc.close();
        }

    }
}