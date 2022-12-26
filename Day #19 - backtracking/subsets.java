import java.util.*;

public class subsets {

    public static void subSets(String s, String ans, int i) {
        if(i == s.length()) {
            if(ans == "") System.out.println("null");
            else System.out.println(ans);
            return;
        }

        // including the character:
        char c = s.charAt(i);
        subSets(s, ans+c, i+1);         // function call 
        
        // excluding the character:
        subSets(s, ans, i+1);           // backtracking step
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            String s = "abc";
            subSets(s, "", 0);
            

        } finally {
            sc.close();
        }

    }
}