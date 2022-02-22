package com.Client;

import sun.security.acl.AclEntryImpl;

import java.io.IOException;
import java.net.*;

public class DatagramClientRunnable implements Runnable{

    @Override
    public void run() {
        DatagramSocket socket = null;


                //Counter.counter.getAndIncrement();
        System.out.println(Counter.counter.incrementAndGet());
                try {
                    socket = new DatagramSocket();
                    String str = "Client ";
                    str += Counter.counter.get();
                    DatagramPacket packet = new DatagramPacket(str.getBytes(), str.length(), InetAddress.getLocalHost(), 9000);
                    socket.send(packet);
                    socket.close();
                } catch (SocketException e) {
                    e.printStackTrace();
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

    }
}
