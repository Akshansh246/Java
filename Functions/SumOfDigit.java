public class SumOfDigit {
    void sum(int n){
        int sum = 0;
        while (n>0) {
            int ld = n%10;
            sum += ld;
            n = n/10;
        }
        System.out.println("The sum is : "+sum);
    }
    public static void main(String[] args) {
        SumOfDigit obj = new SumOfDigit();
        obj.sum(132);
    }    
}
