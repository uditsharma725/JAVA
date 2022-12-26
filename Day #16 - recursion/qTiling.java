import java.util.*;

public class qTiling {

    public static int ways(int tiles) {
        if(tiles == 0 || tiles == 1) return 1;
        return (ways(tiles-1) + ways(tiles-2));
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int tiles = sc.nextInt();
            System.out.print(ways(tiles));  

        } finally {
            sc.close();
        }

    }
}