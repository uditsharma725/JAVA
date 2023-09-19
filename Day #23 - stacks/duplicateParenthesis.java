import java.util.*;

public class duplicateParenthesis {

    public static boolean check(String s) {
        int open = 0, close = 0;

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(') open++;
            if(s.charAt(i) == ')') close++;
        }

        return (open == close ? true : false);
    }

    public static boolean duplicate(String s) {
        Stack<Character> ch = new Stack<>();

        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);

            if(c == ')') {
                int cnt = 0;
                while(ch.peek() != '(') {
                    ch.pop();
                    cnt++;
                }

                if(cnt == 0) return true;
            }
            else ch.push(c);
        }

        return false;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            String s = sc.nextLine();
            if(check(s)) {
                if(duplicate(s)) System.out.print("YES");
                else System.out.print("NO");
            }
            else System.out.print("Invalid String");

        } finally {
            sc.close();
        }

    }
}