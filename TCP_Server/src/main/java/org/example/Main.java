package org.example;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws Exception{

        ServerSocket server = new ServerSocket(6789);

        while (true) {

            Socket client = server.accept();

            InputStream inputStream = client.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String messageFromClient = bufferedReader.readLine();
            System.out.println("Message from client = " + messageFromClient);

        }

    }

}