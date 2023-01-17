package Files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExampleOfAutomation {

    // it is just automation total code of FileWriterUtility, only write to file

    private static void writeToFile(String fileName, String text, boolean append) throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName, append))) {
            bufferedWriter.write(text);
        }
    }

    public static void writeToFile(String fileName, String text) throws IOException {
        writeToFile(fileName,text,false);
    }

    public static void appendToFile(String fileName, String text) throws IOException {
        writeToFile(fileName,text,true);
    }

}
