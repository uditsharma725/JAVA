public class butterfly {
    public static void main(String args[]) {
        int n = 5;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++){
                if(j <= i) System.out.print("*");
                else System.out.print("\0");
            }
            for(int z=1; z<=n; z++){
                if(z > (n-i)) System.out.print("*");
                else System.out.print("\0");
            }
            System.out.println();
        }
        for(int i=n-1; i>0; i--) {
            for(int j=1; j<=n; j++){
                if(j <= i) System.out.print("*");
                else System.out.print("\0");
            }
            for(int z=1; z<=n; z++){
                if(z > (n-i)) System.out.print("*");
                else System.out.print("\0");
            }
            System.out.println();
        }
    }
}
