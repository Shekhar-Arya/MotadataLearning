import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Client2GetRunnable implements Runnable{
    DatagramSocket socket = null;
    byte[] bytes = null;

    Client2GetRunnable(DatagramSocket socket, byte[] bytes)
    {

        this.socket = socket;
        this.bytes = bytes;

    }
    @Override
    public void run() {

        while(true)
        {
            DatagramPacket packet = new DatagramPacket(bytes,bytes.length);
            try {
                socket.receive(packet);
                String str = new String(packet.getData(),0, packet.getLength());
                System.out.println("Data from Client 1 : "+str);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
