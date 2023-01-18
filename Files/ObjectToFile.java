package Files;

import java.io.*;

public class ObjectToFile {

    public static void writeObjectToFile(Serializable object, String fileName) throws Exception {

        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

            objectOutputStream.writeObject(object);

        }

    }

    public static Object readFileDeserialize(String fileName) throws Exception {

        Object object = null;

        //FileInputStream fileInputStream = new FileInputStream(fileName);
        //ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))) {

            object = objectInputStream.readObject();

        } finally {
            return object;
        }

    }

}
