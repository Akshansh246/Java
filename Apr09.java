import java.io.*;
import java.util.Scanner;
public class Apr09 {
    public static void main(String[] args){
        //q1
        System.out.println("hello World");
        //q2
        byte a = 10;
        short b = 20;
        int c = 40;
        long d = 500000l;
        float e = 55.86767f;
        double g = 7.77;
        char h = 'a';
        boolean i = true;
        System.out.println(a); 
        System.out.println(b); 
        System.out.println(c); 
        System.out.println(d); 
        System.out.println(e); 
        System.out.println(g); 
        System.out.println(h); 
        System.out.println(i); 

        //q3
        int x = 50;
        float v = (float)x;
        System.out.println(v);

        //q4
        double f = 7.77;
        int z = (int)f;
        System.out.println(z);

        //q5 ---> 65

        //q6
        int a1 = 6;
        int a2 = 5;
        int temp = a1;
        a1 = a2;
        a2 = temp;
        System.out.println(a1+" "+a2);

        //q7
        int b1 = 7;
        int b2 = 8;
        b1 = b1+b2;
        b2 = b1-b2;
        b1 = b1-b2;
        System.out.println(b1+" "+b2);

        //q8
        Scanner scanner = new Scanner(System.in);
        char c3 = scanner.next().charAt(0);
        int c4 = (int)c3;
        System.out.println(c4);
        
        //q9 --> 60.0
        int d1=5;
        double y=10;
        System.out.println(x+y);

        //q10
        int e1 = 6, e2 = 8;
        float e3 = 2.44f, e4 = 4.77f;
        System.out.println(e1+e2+e3+e4);

        //q11
        String name = "Raj";
        int age = 20;
        System.out.println("My name is "+name+" I am "+age+" years old");

    }
}
