import java.net.DatagramSocket;
import java.net.SocketException;

public class Client2Main {
    public static void main(String[] args) throws SocketException {
        DatagramSocket socket = new DatagramSocket(9002);
        byte[] bytes = new byte[1024];

        new Thread(new Client2GetRunnable(socket,bytes)).start();
        new Thread(new Client2SendRunnable(socket)).start();

    }
}
