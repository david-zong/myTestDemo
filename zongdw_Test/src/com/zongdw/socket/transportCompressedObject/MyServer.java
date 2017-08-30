package com.zongdw.socket.transportCompressedObject;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/** 
 * Type Name: MyServer <br> 
 * Description: socket传输压缩对象 <br>
 * Date: 2017年2月14日 下午3:54:03 <br> 
 * @author author
 * @since JDK 1.6
 */
public class MyServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket server = new ServerSocket(12345);
		
		while(true){
			Socket socket = server.accept();
			socket.setSoTimeout(10*1000);
			invoke(socket);
		}
	}
	
	private static void invoke(final Socket socket){
		new Thread(new Runnable() {
			public void run() {
				GZIPInputStream gzipis = null;
				GZIPOutputStream gzipos = null;
				ObjectInputStream ois = null;
				ObjectOutputStream oos = null;
				
				try {
					gzipis = new GZIPInputStream(socket.getInputStream());
					gzipos = new GZIPOutputStream(socket.getOutputStream());
					ois = new ObjectInputStream(gzipis);
					oos = new ObjectOutputStream(gzipos);
					
					Object obj = ois.readObject();
					User user = (User) obj;
					System.out.println("user:"+user.getName()+"/"+user.getPassword());
					
					user.setName(user.getName()+"_new");
					user.setPassword(user.getPassword()+"_new");
					
					oos.writeObject(user);
					oos.flush();
					gzipos.finish();
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
		}).start();
	}

}
