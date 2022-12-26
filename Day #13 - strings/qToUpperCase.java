import java.util.*;

public class qToUpperCase {

    public static String upper(String str) {
        StringBuilder sb = new StringBuilder("");
        
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++) {
            if(str.charAt(i) == ' ' && i<str.length()-1) {
                sb.append(str.charAt(i));
                char upper = Character.toUpperCase(str.charAt(++i));
                sb.append(upper);
            }
            else sb.append(str.charAt(i));
        }

        return sb.toString();
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            String str = sc.nextLine();
            System.out.print(upper(str));

        } finally {
            sc.close();
        }

    }
}