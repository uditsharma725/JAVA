import java.util.*;

public class nextGreatestElement {



    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {
            
            int arr[] = {100, 80, 60, 70, 60, 85, 100};
            Stack<Integer> s = new Stack<>();
            int nextGreater[] = new int[arr.length];

            for(int i=arr.length-1; i>=0; i--) {
                while(!s.empty() && arr[s.peek()]<=arr[i]) s.pop();
                if(s.empty()) nextGreater[i] = -1;
                else nextGreater[i] = arr[s.peek()];
                s.push(i);
            }

            for(int i=0; i<nextGreater.length; i++) {
                System.out.println(arr[i] + " " + nextGreater[i]);
            }

        } finally {
            sc.close();
        }

    }
}