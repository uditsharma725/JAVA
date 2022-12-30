import java.util.*;

public class qNonRepeating {

    public static void nonRep(String s) {
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            q.add(c);
            freq[c-'a']++;

            while(!q.isEmpty() && freq[q.peek()-'a']>1) q.remove();
            if(q.isEmpty()) System.out.print("-1 ");
            else System.out.print(q.peek() + " ");
        }

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            String s = sc.nextLine();
            nonRep(s);

        } finally {
            sc.close();
        }

    }
}