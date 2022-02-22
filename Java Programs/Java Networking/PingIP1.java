import java.net.*;
import java.io.*;
public class PingIP1{
public static void main(String[] args) throws UnknownHostException, IOException
{
InetAddress ia = InetAddress.getByName("172.16.10.43");
System.out.println("Sending ping Request to 172.16.10.43");
if(ia.isReachable(5000))
{
System.out.println("Host is Reachable");
}
else{
System.out.println("Sorry Cant reach the host");
}

}
}
