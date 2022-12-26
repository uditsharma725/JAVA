import java.util.*;

public class qFriendsPair {

    public static int ways(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;

        return (ways(n-1) + (n-1)*ways(n-2));
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int n = sc.nextInt();
            System.out.print(ways(n));     

        } finally {
            sc.close();
        }

    }
}