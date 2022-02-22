import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ServerGetRunnable implements Runnable{
    DatagramSocket socket = null;
    byte[] bytes = null;

    ServerGetRunnable(DatagramSocket socket, byte[] bytes)
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
                if(str.charAt(str.length()-1) == '1')
                {
                    DatagramPacket packet1 = new DatagramPacket(str.getBytes(),str.length(), InetAddress.getLocalHost(),9000);
                    System.out.println("Data from Client 1 : "+str);
                    socket.send(packet1);
                }
                else
                {
                    DatagramPacket packet1 = new DatagramPacket(str.getBytes(),str.length(), InetAddress.getLocalHost(),9002);
                    System.out.println("Data from Client 2 : "+str);
                    socket.send(packet1);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
