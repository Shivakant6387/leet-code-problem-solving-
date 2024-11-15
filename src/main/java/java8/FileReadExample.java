package java8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReadExample {
    private static List<String> filterAndConvertToUpper(List<String> lines, int length) {
        List<String> filteredStrings = new ArrayList<>();
        for (String line : lines) {
            if (line.length() == length) {
                filteredStrings.add(line.toUpperCase());
            }
        }
        return filteredStrings;
    }

    public static void main(String[] args) {
        String fileName = "D:\\CustomFileReader.txt";
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
                System.out.println("Read line: " + line);
            }
            List<String> filteredStrings = filterAndConvertToUpper(lines, 5);
            System.out.println("Filtered strings with length 5 (converted to uppercase): " + filteredStrings);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
