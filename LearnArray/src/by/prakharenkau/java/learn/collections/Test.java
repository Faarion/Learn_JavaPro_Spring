package by.prakharenkau.java.learn.collections;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		MyThread myThread = new MyThread();
		myThread.start();
		System.out.println("Hello main Thread");
		
		Thread.sleep(1000);
		
		MyThread myThread2 = new MyThread();
		myThread2.start();
		
		Thread thread = new Thread(new Runner());
		thread.start();
		
		System.out.println("I am go to sleep");
		
		Thread.sleep(3000);
		System.out.println("I am wake!!!");
	}
}

class Runner implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("!!!!!!Hello my thread: " + i + "!!!!!!");
		}
	}
	
}

class MyThread extends Thread {
	
	public void run() {
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Hello my thread: " + i);
		}
	}
}
