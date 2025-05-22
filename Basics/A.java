public class A {
    String str;
    A(String str){
        this.str = str;
        System.out.println("constructing");
    }
    void show(){
        System.out.println("This string was passed : "+ str);
    }
    public static void main(String[] args) {
        A a = new A("helooo");
        a.show();
    }
}
