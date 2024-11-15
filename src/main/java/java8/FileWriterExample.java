package java8;

import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.stream.Stream;

public class FileWriterExample {
    public static void main(String[] args) {
        String[] phrases = {"Sample", "Text", "For", "File", "Write"};
        String filePath = "D:\\CustomFileReader.txt";
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(Paths.get(filePath)))) {
            Stream.of(phrases).forEach(writer::println);
            System.out.println("Text has been successfully written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
