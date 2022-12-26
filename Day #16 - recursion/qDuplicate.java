import java.util.*;

public class qDuplicate {

    public static String removeDuplicated(String s, int i, boolean arr[]) {
        if(i == s.length()-1) return "";
        
        if(!arr[s.charAt(i)-'a']) {
            System.out.print(s.charAt(i));
            arr[s.charAt(i)-'a'] = true;
        }

        return removeDuplicated(s, i+1, arr);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            String s = sc.nextLine();
            boolean arr[] = new boolean[26];
            for(int i=0; i<26; i++) arr[i] = false;
            removeDuplicated(s, 0, arr);

        } finally {
            sc.close();
        }

    }
}