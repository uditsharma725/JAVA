import java.util.*;

public class raisedPower {

    public static int pwr(int n, int pow) {
        if(pow == 0) return 1;
        // return (n * pwr(n, pow-1));          //TC - O(n)


        // to optimise the code TC-O(n) to TC-O(log(n)):
        int half = (int)pwr(n, pow/2);
        if(pow%2 == 0) return (half * half);
        return (n * half * half);                   //TC - O(log(n))
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int n = sc.nextInt();
            int pow = sc.nextInt();
            
            System.out.print(pwr(n,pow));

        } finally {
            sc.close();
        }

    }
}