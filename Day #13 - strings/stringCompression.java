import java.util.*;

public class stringCompression {

    public static String compress(String str) {
        StringBuilder sb = new StringBuilder("");

        for(int i=0; i<str.length(); i++) {
            int cnt = 1;
            sb.append(str.charAt(i));

            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                cnt++;
                i++;
            }
            if(cnt > 1) sb.append(cnt);
        }
        
        return sb.toString();
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            String str = sc.nextLine();
            System.out.print(compress(str));

        } finally {
            sc.close();
        }

    }
}