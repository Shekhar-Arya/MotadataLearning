package com.company;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

import static java.net.InetAddress.getLocalHost;

public class DatagramServer {
    static DatagramSocket datagramSocket = null;

    public static void sendToClient()
    {

        Scanner s = new Scanner(System.in);
        while (true)
        {
                String str = s.nextLine();
                try {
                    DatagramPacket packet = new DatagramPacket(str.getBytes(), str.length(), getLocalHost(), 3000);
                    datagramSocket.send(packet);
                    if(str.equals("close")) {
                        datagramSocket.disconnect();
                        datagramSocket.close();
                        break;
                    }
                    else {
                        System.out.println(" Sent from server : "+str);
                    }
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

    public static void main(String[] args) throws SocketException {
        datagramSocket = new DatagramSocket(3001);
        sendToClient();
    }

}
