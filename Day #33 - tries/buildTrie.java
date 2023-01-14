import java.util.*;

public class buildTrie {

    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;

        Node() {
            for(int i=0; i<26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();
    public static void insert(String word) {
        Node curr = root;
        for(int level = 0; level < word.length(); level++) {
            int idx = (int)(word.charAt(level) - 'a');
            if(curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }

        curr.eow = true;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            String words[] = {"the", "a", "there", "any"};
            for(int i=0; i<words.length; i++) insert(words[i]);

        } finally {
            sc.close();
        }

    }
}