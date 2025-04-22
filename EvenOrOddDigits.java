public class EvenOrOddDigits {
    public static void main(String[] args) {
        int n = 1234;
        while (n>0) {
            int ld = n%10;
            if (ld%2==0) {
                System.out.println("Even no : " + ld);
            }
            else System.out.println("Odd nos : "  +ld);
            n = n/10;
        }
    }
}
