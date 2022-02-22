import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client1Main {

    public static void main(String[] args) throws IOException {

        DatagramSocket socket = new DatagramSocket(9000);
        byte[] bytes = new byte[1024];

        new Thread(new ClientGetRunnable(socket,bytes)).start();
        new Thread(new Client1SendRunnable(socket)).start();
    }
}
