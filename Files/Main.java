package Files;

public class Main {

    public static void main(String[] args) throws Exception {

        // write to file - first method (FileWriterUtility)
//        FileWriterUtility.writeToFile("test.txt","Test writer");

        // write to file - first method (FileWriterUtility)
//        FileWriterUtility.writeToFile("test2.txt","Test writer append",true);

        // write to file - console program (ConsolProgram)
//        ConsolProgram.console();

        // read from file (FileReaderUtility)
//        String str = FileReaderUtility.read("test.txt");
//        System.out.println(str);

        // read by bytes
//        byte[] arr = FileReaderUtility.readBytes("test.txt");
//        System.out.println(new String(arr));

        // read by bytes photo
        byte[] arr = FileReaderUtility.readBytes("photoTest.jpg");
        FileWriterUtility.writeBytes("photoo.png",arr);


    }

}
