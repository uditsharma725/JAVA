import java.util.*;

public class updateBit {

    public static int update(int num, int bit, int newBit) {
        if(newBit == 0) return (num & (~(1 << bit)));
        return (num | (1 << bit));
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int num = sc.nextInt();
            int bit = sc.nextInt();
            int newBit = sc.nextInt();
            
            
            System.out.print(update(num, bit, newBit));

        } finally {
            sc.close();
        }

    }
}