import java.util.*;

public class sum {
    public static int sumof(int num) {
        int sum = 0;
        while(num != 0){
            int last = num%10;
            sum += last;
            num/=10;
        }

        return sum;
    }
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            System.out.print(sumof(num));
        }
    }    
}
