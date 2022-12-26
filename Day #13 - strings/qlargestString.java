import java.util.*;

public class qlargestString {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int n = sc.nextInt();
            String fruits[] = new String[n];

            for(int i=0; i<n; i++) fruits[i] = sc.nextLine();

            String largest = fruits[0];
            for(int i=1; i<n; i++) {
                String fruit = fruits[i];
                if(largest.compareToIgnoreCase(fruit) < 0) largest = fruit; 
            }

            System.out.print(largest);

        } finally {
            sc.close();
        }

    }
}