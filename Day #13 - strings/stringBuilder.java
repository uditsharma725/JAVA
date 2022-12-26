import java.util.*;

public class stringBuilder {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            StringBuilder sb = new StringBuilder("");
            for(char ch='a'; ch<='k'; ch++) {
                sb.append(ch);
            }

            System.out.print(sb);
            sb.setLength(0);            //to clear string builder
            System.out.print(sb);

            System.out.println();
            for(char ch='a'; ch<'d'; ch++) sb.append(ch);
            System.out.print(sb);

        } finally {
            sc.close();
        }
    }
}