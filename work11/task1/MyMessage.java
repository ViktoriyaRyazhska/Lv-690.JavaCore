package work11.task1;

public class MyMessage extends Thread {
	private int numThread;
	private String name;
	
	public MyMessage(int numThread, String name) {
		this.numThread = numThread;
		this.name = name;
	}
	
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("Hi, I`m "+name+" and my thread is "+numThread);
		}
	}
}
