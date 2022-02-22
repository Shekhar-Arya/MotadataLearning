package com.Server;

public class DatagramServerSocket {

    public static void main(String[] args) {
        new Thread(new DatagramServerRunnable()).start();
    }
}
