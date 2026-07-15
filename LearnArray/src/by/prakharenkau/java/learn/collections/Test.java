package by.prakharenkau.java.learn.collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Test {
			
	public static void main(String[] args) throws InterruptedException {
		ProduserConsumer ps = new ProduserConsumer();
		
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					ps.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					ps.consumer();
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

class ProduserConsumer {
	private Queue<Integer> queue = new LinkedList<Integer>();
	private final int LIMIT = 10;
	private final Object lock = new Object();
	
	public void produce() throws InterruptedException {
		int value = 0;
		while (true) {
			synchronized (lock) {
				while(queue.size() == LIMIT) {
					lock.wait();
				}
				
				queue.add(value++);
				lock.notify();
			}
		}
	}
	
	public void consumer() throws InterruptedException {
		while(true) {
			synchronized (lock) {
				while(queue.size() == 0) {
					lock.wait();
				}
				
				int value = queue.poll();
				System.out.println(value);
				System.out.println("Size: " + queue.size());
				lock.notify();
			}
			Thread.sleep(1000);
		}
	}
}