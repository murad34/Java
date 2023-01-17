package Files;

import java.io.IOException;
import java.util.Scanner;

public class ConsolProgram {

    public static void console() throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("File name");
        String fileName = scanner.nextLine();

        System.out.println("Text :");
        String text = scanner.nextLine();

        FileWriterUtility.writeToFile(fileName+".txt",text);

    }

}
