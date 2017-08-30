package com.zongdw.socket.multiThread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/** 
 * Type Name: MyClient <br> 
 * Description: 多线程socket通信 <br>
 * Date: 2017年2月14日 下午3:53:07 <br> 
 * @author author
 * @since JDK 1.6
 */
public class MyClient {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Socket socket = new Socket("localhost", 12345);
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter out = new PrintWriter(socket.getOutputStream());
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String msg = reader.readLine();
			out.println(msg);
			out.flush();
			if ("bye".equals(msg)) {
				break;
			}
			System.err.println(in.readLine());
		}
		socket.close();
	}

}
