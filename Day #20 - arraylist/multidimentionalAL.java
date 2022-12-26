import java.util.*;

public class multidimentionalAL {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int n = sc.nextInt();
            ArrayList< ArrayList<Integer> > mainList = new ArrayList<>();

            for(int i=0; i<n; i++) {
                int size = sc.nextInt();
                ArrayList<Integer> list = new ArrayList<>();
                for(int j=0; j<size; j++) {
                    int value = sc.nextInt();
                    list.add(value);
                }
                mainList.add(list);
            }

            for(int i=0; i<mainList.size(); i++) {
                ArrayList<Integer> list = mainList.get(i);
                for(int j=0; j<list.size(); j++) {
                    System.out.print(list.get(j) + " ");
                }
                System.out.println();
            }

        } finally {
            sc.close();
        }

    }
}