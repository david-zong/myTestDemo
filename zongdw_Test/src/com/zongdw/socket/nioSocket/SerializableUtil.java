package com.zongdw.socket.nioSocket;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.management.RuntimeErrorException;

/** 
 * Type Name: SerializableUtil <br> 
 * Description: 用来把java对象序列化成字节数组，或者把字节数组反序列化成java对象 <br>
 * Date: 2017年2月14日 下午4:37:22 <br> 
 * @author author
 * @since JDK 1.6
 */
public class SerializableUtil {
	public static byte[] toBytes(Object object) {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(baos);
			oos.writeObject(object);
			byte[] bytes = baos.toByteArray();
			return bytes;
		} catch (IOException e) {
			throw new RuntimeException(e.getMessage(),e);
		}finally {
			try {
				oos.close();
			} catch (IOException e) {}
		}
	}
	
	public static Object toObject(byte[] bytes) {
		ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(bais);
			Object object = ois.readObject();
			return object;
		} catch (IOException e) {
			throw new RuntimeException(e.getMessage(), e); 
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e.getMessage(), e); 
		}finally {
			try {
				ois.close();
			} catch (IOException e) {}
		}
	}
}
