package by.prakharenkau.java.learn.collections;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) throws InterruptedException {
		WaitAndNotify wn = new WaitAndNotify();
		
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					wn.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					wn.consumer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		thread1.start();
		thread2.start();
		
		thread1.join();
		thread2.join();
	}
}

class WaitAndNotify {
	public void produce() throws InterruptedException {
		synchronized (this) {
			System.out.println("Producer thread started...");
			wait();
			System.out.println("Produser thread resumed...");
		}
	}
	
	public void consumer() throws InterruptedException {
		Thread.sleep(2000);
		Scanner scanner = new Scanner(System.in);
		
		synchronized (this) {
			System.out.println("Waiting for return key pressed");
			scanner.nextLine();
			notify();
		}
	}
}