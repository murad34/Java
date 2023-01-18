package Files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioFileUtility {

    public static void writeBytes(byte[] data, String fileName) throws Exception {

        Path filePath = Paths.get(fileName);

        Files.write(filePath, data);
    }

    public static byte[] readBytes(String fileName) throws Exception {

        Path filePath = Paths.get(fileName);

        byte[] byteArray = Files.readAllBytes(filePath);

        return byteArray;
    }

}
