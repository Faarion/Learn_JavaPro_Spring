package by.prakharenkau.java.learn.collections;

import java.util.Random;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		Runner runner = new Runner();

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				runner.firstThread();
			}
		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				runner.secondThread();
			}
		});

		thread1.start();
		thread2.start();

		thread1.join();
		thread2.join();

		runner.finished();
	}
}

class Runner {
	private Account account1 = new Account();
	private Account account2 = new Account();

	public void firstThread() {
		Random rand = new Random();

		for (int i = 0; i < 10000; i++) {
			synchronized (account1) {
				synchronized (account2) {
					
					Account.transfer(account1, account2, rand.nextInt(100));
				}
			}			
		}

	}

	public void secondThread() {
		Random rand = new Random();

		for (int i = 0; i < 10000; i++) {
			synchronized (account1) {
				synchronized (account2) {

					Account.transfer(account2, account1, rand.nextInt(100));
				}
			}
		}

	}

	public void finished() {
		System.out.println(account1.getBalance());
		System.out.println(account2.getBalance());
		System.out.println("Total balance: " + (account1.getBalance() + account2.getBalance()));

	}
}

class Account {
	private int balance = 10000;

	public void deposit(int amount) {
		balance += amount;
	}

	public void withdrow(int amount) {
		balance -= amount;
	}

	public int getBalance() {
		return balance;
	}

	public static void transfer(Account acc1, Account acc2, int amount) {
		acc1.withdrow(amount);
		acc2.deposit(amount);
	}
}