import java.util.*;

public class qAnagram {

    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> m = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            m.put(ch, m.getOrDefault(ch, 0) + 1);
        }

        for(int i=0; i<t.length(); i++) {
            char ch = t.charAt(i);
            if(m.get(ch) != null) {
                if(m.get(ch) == 1) m.remove(ch);
                else m.put(ch, m.get(ch)-1);
            }
            else return false;
        }

        return m.isEmpty();
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            String s = "race";
            String t = "care";
            
            System.out.print(isAnagram(s, t));

        } finally {
            sc.close();
        }

    }
}