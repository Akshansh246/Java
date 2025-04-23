public class PrimeNoFilter {
    public static void main(String[] args) {
        int[] arr = {2,3,7,88,49,66,9};
        for (int d : arr) {
            if (d>1) {
                int count = 0;
                for (int j = 2; j < d; j++) {
                    if (d % j==0) {
                        count++;
                    }
                }
                if (count == 0) {
                    System.out.println(d+" is prime");
                }
                else System.out.println(d+" is not prime");
            }
        }
    }
}
