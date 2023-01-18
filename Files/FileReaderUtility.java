package Files;

import java.io.*;

public class FileReaderUtility {

    public static String read(String fileName) throws Exception {

        try (
                InputStream inputStream = new FileInputStream(fileName);
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        ) {

            String line = null;
            String result = "";

            while ((line = bufferedReader.readLine()) != null) {
                result += line + "\n";
            }

            return result;

        }

    }

    public static byte[] readBytes(String fileName) throws Exception {

        File file = new File(fileName);

        try (FileInputStream fileInputStream =  new FileInputStream(file)) {

            byte[] bytesArray = new byte[(int) file.length()];

            //read file into bytes
            fileInputStream.read(bytesArray);

            return bytesArray;
        }
    }

}
