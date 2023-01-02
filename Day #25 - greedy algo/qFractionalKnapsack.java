import java.util.*;

public class qFractionalKnapsack {

    public static int knapsack(int w[], int v[], int W) {
        double arr[][] = new double[w.length][2];
        for(int i=0; i<w.length; i++) {
            arr[i][0] = i;
            arr[i][1] = v[i]/(double)w[i];
        }

        Arrays.sort(arr, Comparator.comparingDouble(o -> o[1]));

        int price = 0;
        int i = arr.length-1;
        while(i>=0 && W>0) {
            int weight = w[(int)arr[i][0]];
            int value = v[(int)arr[i][0]];
            
            if(weight > W) price += (int)arr[i][1]*W;
            else price += value;
            
            W-=weight;
            i--;
        }

        return price;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int n = sc.nextInt();
            int v[] = new int[n];
            for(int i=0; i<n; i++) {
                int x = sc.nextInt();
                v[i] = x;
            }
            
            int w[] = new int[n];
            for(int i=0; i<n; i++) {
                int x = sc.nextInt();
                w[i] = x;
            }

            int W = sc.nextInt();
            
            System.out.print(knapsack(w, v, W));

        } finally {
            sc.close();
        }

    }
}