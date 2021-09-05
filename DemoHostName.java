import java.net.*;
import java.io.*;
public class DemoHostName 
{
	public static void main(String args[])
	{
	     try
	     {
		InetAddress inet;
		inet=InetAddress.getByName("DESKTOP-TN0QLN7");

		String name,addr;

		name=inet.getHostName();	
		addr=inet.getHostAddress();
		
		System.out.println("Host Name "+name);
		System.out.println("Host Address "+addr);
	      }
	      catch(Exception UnknownHostException){}
	}
}