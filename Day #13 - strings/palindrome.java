import java.util.*;

public class palindrome {

    public static boolean checkPalindrome(String str) {
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)) return false;
        }
        return true;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            String str = sc.nextLine();
            
            boolean check = checkPalindrome(str);
            if(check) System.out.print("YES");
            else System.out.print("NO");

        } finally {
            sc.close();
        }

    }
}