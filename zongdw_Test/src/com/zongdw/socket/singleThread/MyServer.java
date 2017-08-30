package com.zongdw.socket.singleThread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/** 
 * Type Name: MyServer <br> 
 * Description: 单线程socket通信 <br>
 * Date: 2017年2月14日 下午3:52:20 <br> 
 * @author author
 * @since JDK 1.6
 */
public class MyServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket server = new ServerSocket(12345);
		Socket socket = server.accept();
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter out = new PrintWriter(socket.getOutputStream());
		
		while(true){
			String msg = in.readLine();
			System.out.println(msg);
			
//			char[] by = new char[22];
//			in.read(by,0,22);
//			String msg = new String(by);
			out.println("Server received:" + msg);
			out.flush();
			if ("bye".equals(msg)) {
				break;
			}
		}
		socket.close();
	}

}
