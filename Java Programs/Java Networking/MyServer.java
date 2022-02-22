import java.net.*;  
import java.io.*;  
class MyServer{  
public static void main(String args[])throws Exception{  
ServerSocket ss=new ServerSocket(3333);  
Socket s=ss.accept();  
DataInputStream din=new DataInputStream(s.getInputStream());  
DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
ServerSocket aa=new ServerSocket(3334);  
Socket a=aa.accept();  
DataInputStream dina=new DataInputStream(s.getInputStream());  
DataOutputStream douta=new DataOutputStream(s.getOutputStream());  
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
  
String str="",str2="", str3="",str4="";  
while(!str.equals("stop")){  
str=din.readUTF();  
str3=dina.readUTF();
System.out.println("client says: "+str);  
str2=str;
str4=str3;
dout.writeUTF(str4);  
dout.flush();    
douta.writeUTF(str2);  
douta.flush();  
}  
din.close();  
s.close();  
ss.close();  
}}  
