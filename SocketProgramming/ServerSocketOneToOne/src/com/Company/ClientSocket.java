package com.Company;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientSocket {

    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);
        Socket clientSocket = new Socket("localhost",6666);
        String str = "";
        DataOutputStream outputStream = new DataOutputStream(clientSocket.getOutputStream());;
        while (!str.equals("close"))
        {
            str = s.nextLine();
            outputStream.writeUTF(str);
            outputStream.flush();
        }
        //outputStream.close();

        DataInputStream inputStream = new DataInputStream(clientSocket.getInputStream());
        String inStr = "";
        while (!inStr.equals("close"))
        {
            inStr = inputStream.readUTF();
            System.out.println(inStr);
        }
        outputStream.close();
        inputStream.close();
        clientSocket.close();

    }
}
