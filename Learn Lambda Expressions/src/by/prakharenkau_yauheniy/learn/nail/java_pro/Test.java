package by.prakharenkau_yauheniy.learn.nail.java_pro;

import java.sql.ResultSet;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
	
	
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		
		Future<Integer> future = executorService.submit(() -> {
			System.out.println("Starting");
			Thread.sleep(500);
			System.out.println("Finished");
			
			Random rand = new Random();
			int randomValue = rand.nextInt(10);
			if (randomValue < 5) {
				throw new Exception("Somthing bad happened");
			}
			return randomValue;
		});
		
		int result = 0;
		executorService.shutdown();
		try {
			result = future.get();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			Throwable ex = e.getCause();
			System.out.println(ex.getMessage());
		}
		
		System.out.println(result);
		
		
	}	
	
	public static int calculate() {
		return 5 + 4;
	}
}
