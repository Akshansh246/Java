public class Calculator {
    static int sum(int a, int b){
        return a+b;
    }
    static int sub(int a,int b){
        return a-b;
    }
    static int mul(int a,int b){
        return a*b;
    }
    static float div(int a,int b){
        return (float)a/b;
    }

    public static void main(String[] args) {
        int s= sum(4, 4);
        int sb = sub(5, 3);
        int m = mul(4, 7);
        float div = div(10, 8);
        System.out.println(s+" "+sb+" "+m+" "+div );
    }
}
