import java.net.DatagramSocket;
import java.net.SocketException;

public class ServerMain {
    public static void main(String[] args) throws SocketException {
        DatagramSocket socket = new DatagramSocket(9001);
        byte[] bytes = new byte[1024];
        new Thread(new ServerGetRunnable(socket,bytes)).start();
    }
}
