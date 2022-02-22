import java.io.*;
import java.util.*;

public class PingIP2{
public static void main(String[] args) throws Exception
{
ArrayList<String> commandlist = new ArrayList<String>();
commandlist.add("ping");
commandlist.add("172.16.10.43");

ProcessBuilder build = new ProcessBuilder(commandlist);
Process process = build.start();

BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));

BufferedReader Error = new BufferedReader(new InputStreamReader(process.getErrorStream()));

String s = null;
System.out.println("Standard output: ");
while((s = input.readLine()) != null)
{
System.out.println(s);
}

System.out.println("Error (if any): ");
while((s = Error.readLine()) != null)
{
System.out.println(s);
}
}
}
