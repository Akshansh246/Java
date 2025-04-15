public class AlphaRytTriangle {
    public static void main(String[] args) {
        int n = 5;
        int d= 65;
        for (int i = 1; i <= n; i++) {
            int a =1;
            for (int j = 1; j <= i; j++) {
                d = a+64;
                char ch = (char)d;
                System.out.print(ch+" ");
                a++;
            }
            System.out.println();
        }
    }
}
