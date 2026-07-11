package by.prakharenkau.java.learn.collections;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		MyThread myThread = new MyThread();
		myThread.start();
		
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		
		myThread.shutdown();
		
	}
}

class MyThread extends Thread {
	
	private volatile boolean running = true;

	@Override
	public void run() {
		while(running) {
			System.out.println("Hello");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void shutdown() {
		this.running = false;
	}
	
}