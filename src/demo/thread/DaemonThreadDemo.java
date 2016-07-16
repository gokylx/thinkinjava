package demo.thread;

import java.io.File;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class DaemonThread implements Runnable {

	@Override
	public void run() {
		System.out.println("进入守护线程"+ Thread.currentThread().getName());
		try {
			writeToFile();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("退出守护线程" +Thread.currentThread().getName());
		
	}

	private void writeToFile() throws Exception {
		File filename = new File("d:" + File.separator + "daemon.txt");
		OutputStream os = new FileOutputStream(filename, true);
		int count = 0;
		while(count < 999) {
			os.write(("\r\nword" + count).getBytes());
			System.out.println("守护线程" + Thread.currentThread().getName() + "向文件中写入了word" + count++);
			TimeUnit.SECONDS.sleep(1);
		}
		os.close();
		
	}
	
}

public class DaemonThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("进入主线程" + Thread.currentThread().getName());
		Thread thread = new Thread(new DaemonThread());
		thread.setDaemon(true);
		thread.start();
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		scanner.close();
		System.out.println("退出主线程" + Thread.currentThread().getName());
	}

}
