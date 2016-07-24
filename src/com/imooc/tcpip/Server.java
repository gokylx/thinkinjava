package com.imooc.tcpip;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		try {
//			1. 创建一个服务器端Socket，即ServerSocket，指定绑定的端口
			@SuppressWarnings("resource")
			ServerSocket serverSocket = new ServerSocket(8888);
//			2.调用accept()监听，等待客户端连接
			System.out.println("***服务器即将启动，等待客户端的连接***");
			Socket socket = null;
			while(true) {
			socket = serverSocket.accept();
				Thread serverThread = new ServerThread(socket);
				serverThread.start();
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
