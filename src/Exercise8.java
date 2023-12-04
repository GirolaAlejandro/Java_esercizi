import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Esercizio: File Management

public class Exercise8 {

    // Task 1: Creating a file
    public static boolean createFile(String fileName) {
        File file = new File(fileName);

        if (file.exists()) {
            System.out.println("File already exists: " + fileName);
            return false;
        }

        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + fileName);
                return true;
            } else {
                System.out.println("Unable to create file: " + fileName);
                return false;
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file: " + fileName);
            e.printStackTrace();
            return false;
        }
    }

    // Task 2: Writing to a file
    public static boolean writeToFile(String fileName, String content) {
        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("File does not exist: " + fileName);
            return false;
        }

        try (FileWriter writer = new FileWriter(file)) {
            writer.write(content);
            System.out.println("Content written to file: " + fileName);
            return true;
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + fileName);
            e.printStackTrace();
            return false;
        }
    }

    // Task 3: Reading from a file
    public static String readFromFile(String fileName) {
        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("File does not exist: " + fileName);
            return "";
        }

        StringBuilder content = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file: " + fileName);
            e.printStackTrace();
        }

        return content.toString();
    }

    public static void main(String[] args) {
        // Test the methods
        String fileName = "testFile.txt";
        createFile(fileName);
        writeToFile(fileName, "Hello, this is a test content!");
        System.out.println("Content read from file: \n" + readFromFile(fileName));
    }
}

