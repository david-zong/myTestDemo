package com.zongdw.socket.SSLSocket;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLServerSocketFactory;

/** 
 * Type Name: MyServer <br> 
 * Description: socket使用加密协议传输对象 <br>
 * Date: 2017年2月14日 下午3:54:40 <br> 
 * @author author
 * @since JDK 1.6
 */
public class MyServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocketFactory factory = SSLServerSocketFactory.getDefault();
			ServerSocket server = factory.createServerSocket(12345);
			
			while(true){
				Socket socket = server.accept();
				invoke(socket);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void invoke(final Socket socket) {
		new Thread(new Runnable() {
			public void run() {
				ObjectInputStream is = null;
				ObjectOutputStream os = null;
				
				try {
					is = new ObjectInputStream(new BufferedInputStream(socket.getInputStream()));
					os = new ObjectOutputStream(socket.getOutputStream());
					
					Object object = is.readObject();
					User user = (User) object;
					System.out.println("user:"+user.getName()+"/"+user.getPassword());
					
					user.setName(user.getName()+"_new");
					user.setPassword(user.getPassword()+"_new");
					os.writeObject(user);
					os.flush();
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
		}).start();
	}

}
