import java.util.*;

public class palindromeNum {
    public static long reverse(long num) {
        long rev = 0;
        while(num != 0){
            long last = num%10;
            rev = rev*10 + last;
            num/=10;
        }

        return rev;
    }
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            long num = sc.nextLong();
            long revNum = reverse(num);
            if(num == revNum) System.out.print("YES");
            else System.out.print("NO");
        }        
    }
}
