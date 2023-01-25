package org.example;

import java.io.*;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws Exception {

        Socket client = new Socket("127.0.0.1", 6789);

        OutputStream outputStream = client.getOutputStream();

        outputStream.write("salam server".getBytes());

        client.close();

    }

}