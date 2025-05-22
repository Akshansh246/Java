import java.io.*;
import java.util.Scanner;

import org.xml.sax.SAXException;
public class INput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        System.out.println(n);
    }
}
