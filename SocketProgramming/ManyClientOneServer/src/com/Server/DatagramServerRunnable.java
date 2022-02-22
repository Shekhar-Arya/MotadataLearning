package com.Server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class DatagramServerRunnable implements Runnable{

    @Override
    public void run() {
        DatagramSocket socket = null;
        byte[] bytes = new byte[1024];
        try {
            socket = new DatagramSocket(9000);
        } catch (SocketException e) {
            e.printStackTrace();
        }
        try {
                while (true){
                DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
                socket.receive(packet);

                String str = new String(packet.getData(),0, packet.getLength());
                System.out.println(str);
                }

        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            socket.close();
        }
    }

}
