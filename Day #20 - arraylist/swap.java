import java.util.*;

public class swap {

    public static void Swap(ArrayList<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            ArrayList<Integer> list = new ArrayList<>();            
            for(int i=0; i<5; i++) {
                int x = sc.nextInt();
                list.add(x);
            }

            System.out.println(list);
            Swap(list, 0, 1);
            System.out.print(list);

        } finally {
            sc.close();
        }

    }
}