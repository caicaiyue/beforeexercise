package exercise;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class TestFQ {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      String str = "1:100:Administrator:DESKTOP-TSUM5TD:32:╪ссм";
      byte[] array=str.getBytes();
      DatagramSocket ds= new DatagramSocket();
      DatagramPacket dp = new DatagramPacket(array,array.length,InetAddress.getByName("192.168.9.7"),2425);
      int i = 5;
      while(i>0){
    	  ds.send(dp);
    	  i--;
      }
      
	}

}
