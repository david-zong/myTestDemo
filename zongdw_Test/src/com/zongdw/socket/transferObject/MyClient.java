package com.zongdw.socket.transferObject;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/** 
 * Type Name: MyClient <br> 
 * Description: socket传输对象 <br>
 * Date: 2017年2月14日 下午3:53:47 <br> 
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
				socket = new Socket("localhost", 12345);
				os = new ObjectOutputStream(socket.getOutputStream());
				User user = new User("user_"+i,"password_"+i);
				os.writeObject(user);
				os.flush();
				
				is = new ObjectInputStream(new BufferedInputStream(socket.getInputStream()));
				Object obj = is.readObject();
				if (obj != null) {
					user = (User) obj;
					System.out.println("User:"+user.getName()+"/"+user.getPassword());
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
