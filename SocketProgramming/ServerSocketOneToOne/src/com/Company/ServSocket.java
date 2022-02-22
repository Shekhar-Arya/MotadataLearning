package com.Company;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServSocket {
    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);
        ServerSocket server = new ServerSocket(6666);
        Socket socket = server.accept();
        String str = "";
        DataInputStream inputStream = new DataInputStream(socket.getInputStream());
        while (!str.equals("close"))
        {
            str = inputStream.readUTF();
            System.out.println("From Client : "+str);

        }
        //inputStream.close();

        DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
        String outStr = "";
        while (!outStr.equals("close"))
        {
            outStr = s.nextLine();
            outputStream.writeUTF(outStr);
            outputStream.flush();
        }
        outputStream.close();
        inputStream.close();
        socket.close();
        server.close();

    }

}

