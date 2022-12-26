import java.util.*;

public class qReverseString {

    public static void reverse(String str) {
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == ' ') {
                while(!s.empty()) System.out.print(s.pop());
                System.out.print(" ");
            }
            else s.push(str.charAt(i)); 
        }

        while(!s.empty()) System.out.print(s.pop());
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            String n = sc.nextLine();
            reverse(n);

        } finally {
            sc.close();
        }

    }
}