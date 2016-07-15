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
			System.out.println(name + " 卖出一张票");
		}
	}
}
public class TicketsThread {

}
