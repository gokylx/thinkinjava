package com.imooc.tcpip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerThread extends Thread {
	Socket socket = null;
	public ServerThread(Socket socket) {
		this.socket = socket;
	}
	@Override
	public void run() {
		
//			3.获取输入流，并读取客户端信息
			
				BufferedReader bufferedReader = null;
			try {
				 bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
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
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
}
