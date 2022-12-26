public class charPattern {
    public static void main(String args[]) {
        char c = 'A';
        int n = 7;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++){
                System.out.print(c + " ");
                c++;
            }
            System.out.println();
        }
    }    
}
