import java.util.*;

public class qLongestWord {

    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;

        public Node() {
            for(int i=0; i<26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        int idx = 0;
        int level = 0;
        int len = word.length();

        Node curr = root;
        for(; level<len; level++) {
            idx = word.charAt(level)-'a';
            if(curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static String ans = "";

    public static void longestWord(Node root, StringBuilder temp) {
        for(int i=0; i<26; i++) {
            if(root.children[i] != null && root.children[i].eow == true) {
                char ch = (char)(i+'a');
                temp.append(ch);
                if(temp.length()>ans.length()) ans = temp.toString();

                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            String words[] = {"a", "banana", "app", "ap", "appl", "apple", "apply"};
            for(int i=0; i<words.length; i++) insert(words[i]);

            longestWord(root, new StringBuilder(""));
            System.out.print(ans);

        } finally {
            sc.close();
        }

    }
}