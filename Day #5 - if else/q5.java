import java.util.*;

public class q5 {

    static boolean leapYear(long year) {
        if(year%4 == 0){
            if(year%100 == 0){
                if(year%400 == 0) return true;
                else return false;
            }
            else return true;
        }
        else return false;
    }
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            long year = sc.nextLong();
            
            boolean isLeapYear = leapYear(year);
            if(isLeapYear) System.out.print("YES");
            else System.out.print("NO");
        }
    }
}
