import java.util.*;

public class basicsArrayList {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            // declaration:
            ArrayList<Integer> list = new ArrayList<>();

            // input elements:
            for(int i=0; i<5; i++) {
                int x = sc.nextInt();
                list.add(x);
            }

            // output elements:
            for(int i=0; i<list.size(); i++) {
                System.out.print(list.get(i) + " ");
            }

            // print reverse:
            System.out.println();
            for(int i=list.size()-1; i>=0; i--) {
                System.out.print(list.get(i) + " ");
            }

        } finally {
            sc.close();
        }

    }
}