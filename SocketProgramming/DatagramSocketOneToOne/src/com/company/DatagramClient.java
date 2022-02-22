package com.company;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class DatagramClient {

    static DatagramSocket datagramSocket = null;
    static byte[] input = new byte[1000];
    public static void getFromServer()
    {
        while (true)
        {
            try {
                DatagramPacket packet = new DatagramPacket(DatagramClient.input, input.length);
                datagramSocket.receive(packet);
                String str = new String(packet.getData(),0, packet.getLength());
                if(str.equals("close")) {
                    datagramSocket.disconnect();
                    datagramSocket.close();
                    break;
                }
                else {
                    System.out.println("From server : "+str);
                }
            } catch (UnknownHostException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws SocketException {
        datagramSocket = new DatagramSocket(3000);
        getFromServer();
    }

}
