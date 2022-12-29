import java.util.*;

public class balancedParenthesis {

    public static boolean balanced(String str) {
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if(c=='(' || c=='[' || c=='{') s.push(c);
            else {
                if(s.empty()) return false;
                if(s.peek()=='(' && c==')'
                || s.peek()=='[' && c==']'
                || s.peek()=='{' && c=='}') s.pop();
                else return false; 
            }
        }

        return true;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            String s = sc.nextLine();
            if(balanced(s)) System.out.print("YES");
            else System.out.print("NO");

        } finally {
            sc.close();
        }

    }
}