public class PrimeNoFilter {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        for (int d : arr) {
            if (d>1) {
                int count = 0;
                for (int j = 2; j < d/2; j++) {
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
