import java.io.FileWriter;

public class WritingInFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("example.txt");

            writer.write("Hello, World!\n");
            writer.write("This is a test file.\n");
            writer.write("Writing in Java is fun!");

            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (java.io.IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
