import java.util.Scanner;

public class FirstCharRepeatedInAstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        String new_str = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (new_str.indexOf(c) == -1) {
                new_str += c;
            }
            else{
                System.out.println("The first repeated character is "+c);
                break;
            }
        }
    }
}
