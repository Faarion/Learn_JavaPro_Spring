package by.prakharenkau.java.learn.collections;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
			
	public static void main(String[] args) throws InterruptedException {
		CountDownLatch countDownLatch = new CountDownLatch(3);
		
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		for (int i = 0; i < 3; i++) {
			executorService.submit(new Processor(countDownLatch, i));
		}
		
		//executorService.shutdown();
		
		for (int i = 0; i < 3; i++) {
			Thread.sleep(1000);
			countDownLatch.countDown(); 
		}
		
	}
}

class Processor implements Runnable {
	private CountDownLatch countDownLatch;
	private int id;
	
	public Processor(CountDownLatch countDownLatch, int id) {
		this.countDownLatch = countDownLatch;
		this.id = id;
	}

	@Override
	public void run() {
		try {
			System.out.println("Start processor id: " + id);
			Thread.sleep(3000);
			System.out.println("Finish processor id: " + id);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		try {
			countDownLatch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}