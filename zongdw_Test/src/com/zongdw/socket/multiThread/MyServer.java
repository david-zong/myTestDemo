package com.zongdw.socket.multiThread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/** 
 * Type Name: MyServer <br> 
 * Description: 多线程socket通信 <br>
 * Date: 2017年2月14日 下午3:51:52 <br> 
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
	
	private static void invoke(final Socket client){
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				BufferedReader in = null;
				PrintWriter out = null;
				try {
					in = new BufferedReader(new InputStreamReader(client.getInputStream()));
					out = new PrintWriter(client.getOutputStream());
					
					while(true){
						String msg = in.readLine();
						System.out.println(msg);
						out.println("Server received:"+msg);
						out.flush();
						if ("bye".equals(msg)) {
							break;
						}
					}
				} catch (IOException e) {
					e.printStackTrace();
				}finally {
					try {
						in.close();
						out.close();
						client.close();
					} catch (IOException e) {}
				}
				
			}
		}).start();
	}

}
