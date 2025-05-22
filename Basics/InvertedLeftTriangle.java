public class InvertedLeftTriangle {
    public static void main(String[] args) {
        int n=8;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= n+1-i; k++) {
                System.err.print("* ");
            }
            System.out.println();
        }
    }
}
