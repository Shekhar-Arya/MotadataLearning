package com.Client2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Client2SendRunnable implements Runnable{
    DatagramSocket socket = null;

    Client2SendRunnable(DatagramSocket socket)
    {
        this.socket = socket;
    }
    @Override
    public void run() {

        Scanner s = new Scanner(System.in);
        String str = "";
        while (!str.equals("close"))
        {
            System.out.println("Type something to send");
            str = s.nextLine();
            DatagramPacket packet = null;
            try {
                packet = new DatagramPacket(str.getBytes(), str.length(), InetAddress.getLocalHost(),9000);
                socket.send(packet);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        socket.close();

    }
}
