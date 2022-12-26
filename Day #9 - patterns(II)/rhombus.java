public class rhombus {
    public static void main(String args[]) {
        int n = 5;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=(n-i); j++) System.out.print("\0");
            for(int z=1; z<=n; z++) System.out.print("*");
            System.out.println();
        }
    }
}
