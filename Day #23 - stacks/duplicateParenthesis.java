import java.util.*;

public class duplicateParenthesis {

    public static boolean duplicate(String str) {
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == ')') {
                int cnt = 0;
                while(s.peek() != '(') {
                    s.pop();
                    cnt++;
                }
                s.pop();
                if(cnt == 0) return true;
            }
            else s.push(str.charAt(i));
        }

        return false;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            String s = sc.nextLine();
            if(duplicate(s)) System.out.print("YES");
            else System.out.print("NO");

        } finally {
            sc.close();
        }

    }
}