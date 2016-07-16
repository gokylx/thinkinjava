package demo.thread;

class MyThread extends Thread{
	private int ticktsCont = 5;
	private String name;
	
	public MyThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		while(ticktsCont > 0){
			ticktsCont--;
			System.out.println(name + " 卖了1张票,剩余票数为："+ ticktsCont);
		}
	}
}
public class TicketsThread {
	public static void main(String[] args) {
		MyThread mt1 = new MyThread("窗口1");
		MyThread mt2 = new MyThread("窗口2");
		MyThread mt3 = new MyThread("窗口3");
		
		mt1.start();
		mt2.start();
		mt3.start();
	}
}
