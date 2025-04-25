public class GreaterOfAdigitSum {
    static int sum(int n){
        int sum = 0;
        while (n>0) {
            int ld = n%10;
            sum += ld;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int a = 1233;
        int b = 7766;
        if (sum(a)<sum(b)) {
            System.out.println(b+" is greater");
        }
        else{
            System.out.println(a+"is greater");
        }
    }
}
