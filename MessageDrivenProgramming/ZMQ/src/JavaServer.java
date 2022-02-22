import org.zeromq.ZContext;
import org.zeromq.*;


public class JavaServer {

    public static void main(String[] args) {
        try {
            ZContext context = new ZContext();
            ZMQ.Socket socket = context.createSocket(SocketType.REP);
            socket.bind("tcp://localhost:5555");

            long count = 0;
            while (!Thread.currentThread().isInterrupted())
            {
                byte[] reply = socket.recv(0);
                System.out.println("Received "+ new String(reply,ZMQ.CHARSET));
                count++;
                String response = "Hello By Me";
                socket.send(response.getBytes(ZMQ.CHARSET),0);
                System.out.println(count);
            }

            System.out.println("1234");


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
