package com.zongdw.socket.transferObject;


import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/** 
 * Type Name: MyServer <br> 
 * Description: socket传输对象 <br>
 * Date: 2017年2月14日 下午3:53:28 <br> 
 * @author author
 * @since JDK 1.6
 */
public class MyServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket server = new ServerSocket(12345);
		while(true){
			Socket socket = server.accept();
			invoke(socket);
		}
	}
	
	private static void invoke(final Socket socket){
		new Thread(new Runnable() {
			public void run() {
				ObjectInputStream is = null;
				ObjectOutputStream os = null;
				
				try {
					is = new ObjectInputStream(new BufferedInputStream(socket.getInputStream()));
					os = new ObjectOutputStream(socket.getOutputStream());
					
					Object obj = is.readObject();
					User user = (User) obj;
					System.out.println("User:"+user.getName()+"/"+user.getPassword());
					
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
