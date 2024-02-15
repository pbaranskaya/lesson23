package by.academy.lesson23; 

import java.util.concurrent.TimeUnit;

public class RunnableClass implements Runnable{
	
	@Override
	public void run() {
		for (int i = 0; i < 100 ; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
			if (i % 10 == 0) {
				System.out.println(printInfo(Thread.currentThread()) + " " + i);
			}
		}
	}
	
	public static String printInfo(Thread thread) {
		return thread.getName() + thread.getId();
	}

}
