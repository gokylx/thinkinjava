package com.imooc.tcpip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		try {
//			1. 创建一个服务器端Socket，即ServerSocket，指定绑定的端口
			ServerSocket serverSocket = new ServerSocket(8888);
//			2.调用accept()监听，等待客户端连接
			System.out.println("***服务器即将启动，等待客户端的连接***");
			Socket socket = serverSocket.accept();
//			3.获取输入流，并读取客户端信息
			InputStream inputStream = socket.getInputStream();
//			字节流输入包装成字符流
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
//			位输入流添加缓冲
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
			String info = null;
			while((info = bufferedReader.readLine()) != null) {
				System.out.println("我是服务器，客服端说" + info);
			}
			socket.shutdownInput();
//			4. 获取输出流，相应客户端
			OutputStream outputStream = socket.getOutputStream();
			PrintWriter printWriter = new PrintWriter(outputStream);
			printWriter.println("欢迎登陆");
			printWriter.flush();
			socket.shutdownOutput();
			printWriter.close();
//			5. 关闭资源
//			关闭输入流
			bufferedReader.close();
			inputStreamReader.close();
			inputStream.close();
			socket.close();
			serverSocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
