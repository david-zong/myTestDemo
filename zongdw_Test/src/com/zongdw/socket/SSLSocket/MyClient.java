package com.zongdw.socket.SSLSocket;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

/** 
 * Type Name: MyClient <br> 
 * Description: socket使用加密协议传输对象 <br>
 * Date: 2017年2月14日 下午4:27:54 <br> 
 * @author author
 * @since JDK 1.6
 */
public class MyClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			Socket socket = null;
			ObjectInputStream is = null;
			ObjectOutputStream os = null;
			
			try {
				SocketFactory factory = SSLSocketFactory.getDefault();
				socket = factory.createSocket("localhost", 12345);
				
				os = new ObjectOutputStream(socket.getOutputStream());
				User user = new User("user_"+i, "password_"+i);
				os.writeObject(user);
				os.flush();
				
				is = new ObjectInputStream(new BufferedInputStream(socket.getInputStream()));
				Object object = is.readObject();
				if (object != null) {
					user = (User) object;
					System.out.println("user:"+user.getName()+"/"+user.getPassword());
				}
				
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}finally {
				try {
					is.close();
					os.close();
					socket.close();
				} catch (IOException e) {}
			}
		}
	}

}
