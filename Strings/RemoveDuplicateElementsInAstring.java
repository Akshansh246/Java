import java.util.Scanner;

public class RemoveDuplicateElementsInAstring {
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
        }
        System.out.println("String after removing duplicates: " + new_str);
    }
}
