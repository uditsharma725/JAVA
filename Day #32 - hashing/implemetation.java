import java.util.*;

public class implemetation {
    
    static class HashMap<K, V> {
        public class Node {
            K key; 
            V value;
            
            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n, N;
        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.n = 0;
            this.N = 4;
            this.buckets = new LinkedList[N];
            for(int i=0; i<N; i++) this.buckets[i] = new LinkedList<>();
        }
        
        private int hashFunction(K key) {
            int hash = (int)key.hashCode();
            return Math.abs(hash) % N;
        }

        private int search(K key, int bi) {
            int di = 0;
            LinkedList<Node> ll = buckets[bi];
            
            for(int i=0; i<ll.size(); i++) {
                Node node = ll.get(i);
                if(node.key == key) return di;
                di++;
            }
            
            return -1;
        }

        @SuppressWarnings("unchecked")
        private void reHash() {
            N = N*2;
            LinkedList<Node> oldBuck[] = buckets;
            buckets = new LinkedList[N];
            for(int i=0; i<buckets.length; i++) 
            buckets[i] = new LinkedList<>();

            for(int i=0; i<oldBuck.length; i++) {
                LinkedList<Node> ll = oldBuck[i];
                for(int j=0; j<ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = search(key, bi);

            if(di != -1) {
                Node node = buckets[bi].get(di);
                node.value = value;
            }
            else {
                buckets[bi].add(new Node(key, value));
                n++;
            }

            double lamda = (double)(n/N);
            if(lamda > 2.0) reHash();
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = search(key, bi);

            if(di != -1) return true;
            return false;
        }

        public V get(K key) {
            int bi = hashFunction(key);
            int di = search(key, bi);

            if(di != -1) {
                Node node = buckets[bi].get(di);
                return node.value;
            }

            return null;
        }

        public V remove(K key) {
            int bi = hashFunction(key);
            int di = search(key, bi);

            if(di != -1) {
                Node node = buckets[bi].remove(di);
                return node.value;
            }

            return null;
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            for(int i=0; i<buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for(Node node:ll) keys.add(node.key);
            }

            return keys;
        }

        public boolean isEmpty() {
            return n == 0;
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            HashMap<String, Integer> m = new HashMap<>();
            m.put("India", 100);
            m.put("China", 50);
            m.put("Nepal", 90);

            m.remove("China");

            ArrayList<String> keys = m.keySet();
            for(String key:keys) System.out.println(key);

        } finally {
            sc.close();
        }

    }
}