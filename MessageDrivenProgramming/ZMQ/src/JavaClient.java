import org.zeromq.SocketType;
import org.zeromq.ZContext;
import org.zeromq.ZMQ;

public class JavaClient {
    public static void main(String[] args) {

        try {
            ZContext context = new ZContext();
           /* context.setRcvHWM(1);
            context.setSndHWM(1);*/
            
            System.out.println("Connecting to the server...");
            ZMQ.Socket socket = context.createSocket(SocketType.REQ);
            socket.connect("tcp://localhost:5555");

            for (long i = 0; i < 10000; i++) {
                String request = "hello"+i;
                System.out.println("Sending Hello "+i);
                socket.send(request.getBytes(ZMQ.CHARSET));

                byte[] receive = socket.recv(0);
                System.out.println("Received "+ new String(receive,ZMQ.CHARSET)+" "+i);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
