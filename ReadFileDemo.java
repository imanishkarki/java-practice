import java.io.*;

public class ReadFileDemo {
    public static void main(String[] args) {
        // Specify the file name or path
        String fileName = "demo.txt";

        // Try with resources to ensure file is closed after usage
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Print each line from the file
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
