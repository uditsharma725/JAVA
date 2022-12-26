import java.util.*;

public class qAnagrams {

    public static boolean compare(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()) {
            char str1Array[] = str1.toCharArray();
            char str2Array[] = str2.toCharArray();

            Arrays.sort(str1Array);
            Arrays.sort(str2Array);

            boolean isEqual = Arrays.equals(str1Array, str2Array);
            if (isEqual) return true;
        }
        
        return false;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            String str1 = sc.nextLine();
            String str2 = sc.nextLine();

            boolean isEqual = compare(str1, str2);
            if (isEqual)
                System.out.print("Strings are anagrams");
            else
                System.out.print("String are not Anagrams");

        } finally {
            sc.close();
        }

    }
}