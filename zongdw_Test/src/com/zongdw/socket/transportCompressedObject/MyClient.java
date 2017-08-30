package com.zongdw.socket.transportCompressedObject;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/** 
 * Type Name: MyClient <br> 
 * Description: socket传输压缩对象 <br>
 * Date: 2017年2月14日 下午3:54:19 <br> 
 * @author author
 * @since JDK 1.6
 */
public class MyClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			Socket socket = null;
			GZIPInputStream gzipis = null;
			GZIPOutputStream gzipos = null;
			ObjectInputStream ois = null;
			ObjectOutputStream oos = null;
			
			try {
				socket = new Socket();
				SocketAddress socketAddress = new InetSocketAddress("localhost", 12345);
				socket.connect(socketAddress, 10*1000);
				socket.setSoTimeout(10*1000);
				
				gzipos = new GZIPOutputStream(socket.getOutputStream());
				oos = new ObjectOutputStream(gzipos);
				User user = new User("user_"+i,"password_"+i);
				oos.writeObject(user);
				oos.flush();
				gzipos.finish();
				
				gzipis = new GZIPInputStream(socket.getInputStream());
				ois = new ObjectInputStream(gzipis);
				Object obj = ois.readObject();
				if (obj != null) {
					user = (User) obj;
					System.out.println("user:"+user.getName()+"/"+user.getPassword());
				}
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}finally {
				try {
					ois.close();
					oos.close();
					gzipis.close();
					gzipos.close();
					socket.close();
				} catch (IOException e) {}
			}
		}
	}

}
