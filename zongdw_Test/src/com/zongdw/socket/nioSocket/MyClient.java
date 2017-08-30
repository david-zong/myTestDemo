package com.zongdw.socket.nioSocket;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class MyClient {

	public static void main(String[] args) throws Exception {  
        for (int i = 0; i < 100; i++) {  
            final int idx = i;  
            new Thread(new MyRunnable(idx)).start();  
        }  
    }  
      
    private static final class MyRunnable implements Runnable {  
          
        private final int idx;  
  
        private MyRunnable(int idx) {  
            this.idx = idx;  
        }  
  
        public void run() {  
            SocketChannel socketChannel = null;  
            try {  
                socketChannel = SocketChannel.open();  
                SocketAddress socketAddress = new InetSocketAddress("localhost", 12345);  
                socketChannel.connect(socketAddress);  
  
                MyRequestObject myRequestObject = new MyRequestObject("request_" + idx, "request_" + idx);  
                System.out.println(myRequestObject.toString());
                sendData(socketChannel, myRequestObject);  
                  
                MyResponseObject myResponseObject = receiveData(socketChannel);  
                System.out.println(myResponseObject.toString());
            } catch (Exception ex) {  
                ex.printStackTrace();
            } finally {  
                try {  
                    socketChannel.close();  
                } catch(Exception ex) {}  
            }  
        }  
  
        private void sendData(SocketChannel socketChannel, MyRequestObject myRequestObject) throws IOException {  
            byte[] bytes = SerializableUtil.toBytes(myRequestObject);  
            ByteBuffer buffer = ByteBuffer.wrap(bytes);  
            socketChannel.write(buffer);  
            socketChannel.socket().shutdownOutput();  
        }  
  
        private MyResponseObject receiveData(SocketChannel socketChannel) throws IOException {  
            MyResponseObject myResponseObject = null;  
            ByteArrayOutputStream baos = new ByteArrayOutputStream();  
              
            try {  
                ByteBuffer buffer = ByteBuffer.allocateDirect(1024);  
                byte[] bytes;  
                int count = 0;  
                while ((count = socketChannel.read(buffer)) >= 0) {  
                    buffer.flip();  
                    bytes = new byte[count];  
                    buffer.get(bytes);  
                    baos.write(bytes);  
                    buffer.clear();  
                }  
                bytes = baos.toByteArray();  
                Object obj = SerializableUtil.toObject(bytes);  
                myResponseObject = (MyResponseObject) obj;  
                socketChannel.socket().shutdownInput();  
            } finally {  
                try {  
                    baos.close();  
                } catch(Exception ex) {}  
            }  
            return myResponseObject;  
        }  
    }  
} 
