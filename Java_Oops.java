package mypackage;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class File_Open {

    public static void main(String[] args) {
        String filename = "java_oops.txt";

        // --- Write to the file ---
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write("Java is High Level, And Programming Language\n");
            writer.close();  // close() after writing
            System.out.println("Write operation successful.");
        } catch (IOException e) {
            System.out.println("Error while writing to the file.");
            e.printStackTrace();
        }

        
        // --- Read or open from the file ---
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            System.out.println("\nReading from file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();  // close() after reading
        } catch (IOException e) {
            System.out.println("Error while reading the file.");
            e.printStackTrace();
        }
    }
}
