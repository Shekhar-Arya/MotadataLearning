package com.Company.Shekhar;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.ArrayList;

public class JavaServer {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket(3000);
            byte[] bytes = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bytes,1024);
            ds.receive(dp);
            String str = new String(dp.getData(),0,dp.getLength());
            System.out.println(str);
            ds.close();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
