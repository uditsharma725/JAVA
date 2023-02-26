import java.util.*;

public class permutation {

    public static void permutations(String s, String ans) {
        if(s.length() == 0) {
            System.out.println(ans);
            return;
        }

        for(int i=0; i<s.length(); i++) {
            Character c = s.charAt(i);
            String newStr = s.substring(0,i) + s.substring(i+1);
            permutations(newStr, ans+c);
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            String s = "abc";
            permutations(s, "");

        } finally {
            sc.close();
        }

    }
}