package Files;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterUtility {

    // first method - file adi eynidise icindeki texti silib yeniliyir
    public static void writeToFile(String fileName, String text) throws IOException {

        // from this
//        FileWriter fileWriter = new FileWriter(fileName);
//        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//        bufferedWriter.write(text);
//        bufferedWriter.close();

        // we get it, and then from this
//        try (FileWriter fileWriter = new FileWriter(fileName); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
//            bufferedWriter.write(text);
//        }

        // we get it
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {
            bufferedWriter.write(text);
        }
        // try() bu try mohterizelerin icinde olanlar mutleq shekilde Closeable olmalidilar, eger Closeable deyilseler onda orda yerleshe bilmezler

    }

    // second method - icindeki metni silmir, ardinca yazir (append)
    public static void writeToFile(String fileName, String text, boolean append) throws IOException {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName,append))) {
            bufferedWriter.write(text);
        }
        
        // append yerine true gonderilmelidi, false gonderilse birinci method kimi ishleyecek

    }

    // write by bytes
    public static void writeBytes(String fileName, byte[] data) throws Exception {

        FileOutputStream fileOutputStream = new FileOutputStream(fileName);

        fileOutputStream.write(data);
        fileOutputStream.flush();
        fileOutputStream.close();

        System.out.println("done");

    }

}
