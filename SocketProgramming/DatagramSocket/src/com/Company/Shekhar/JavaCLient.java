package com.Company.Shekhar;

import java.io.IOException;
import java.net.*;

public class JavaCLient {
    public static void main(String[] args) {

        try {
            InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
            DatagramSocket ds = new DatagramSocket();
            ds.connect(inetAddress,3000);
            String str = "Hello from client";
            DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length());
            ds.send(dp);
            ds.disconnect();
            ds.close();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
