import java.util.*;

public class qActiveSelection {

    public static int maxActivites(ArrayList<Integer> s, ArrayList<Integer> e) {
        int cnt = 1;
        int last = e.get(0);
        for(int i=1; i<s.size(); i++) {
            if(s.get(i) >= last) {
                cnt++;
                last = e.get(i);
            }
        }

        return cnt;
    }

    public static void main(String args[]) {

        ArrayList<Integer> start = new ArrayList<>();
        ArrayList<Integer> end = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        try {

            int n = sc.nextInt();
            for(int i=0; i<n; i++) {
                int x = sc.nextInt();
                start.add(x);
            }
            for(int i=0; i<n; i++) {
                int x = sc.nextInt();
                end.add(x);
            }

            System.out.print(maxActivites(start, end));

        } finally {
            sc.close();
        }

    }
}