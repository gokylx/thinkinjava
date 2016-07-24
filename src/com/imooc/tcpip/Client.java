package com.imooc.tcpip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		try {
//			1. 创建客户端Socket， 指定服务器地址和端口
			Socket socket = new Socket("localhost", 8888);
//			2. 获取输出流，向服务器端发送信息
			OutputStream outputStream = socket.getOutputStream();
//			将字节输出流打印包装成打印流
			PrintWriter printWriter = new PrintWriter(outputStream);
			printWriter.write("用户名： admin; 密码：123");
			printWriter.flush();
			socket.shutdownOutput();
//			3. 获取输入流
			InputStream inputStream = socket.getInputStream();
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			String info = null;
			while((info = bufferedReader.readLine())!= null) {
				System.out.println("I'm client, Server said " + info);
			}
			socket.shutdownInput();
//			4. 关闭资源
			bufferedReader.close();
			printWriter.close();
			outputStream.close();
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
