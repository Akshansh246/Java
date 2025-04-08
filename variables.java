public class variables {
    public static char ch = 'z';        //static variable
    int a, b;               //instance variable
    public variables(int k, int m){     //constructor
        a=k;
        b=m;
    }
    public void show(){
        int A=1000;         //local variable
        System.out.println(a+"-->"+b);
        System.out.println(A);
    }
    public static void main(String[] args) {
        variables v = new variables(10, 20);
        v.show();
        System.out.println(variables.ch);
    }
}
