package by.academy.lesson23.Task3; //

import java.util.stream.IntStream;

public class Task3Runner {
	public static void main(String[] args) throws InterruptedException  {
		
		int[] arr = IntStream.range(0, Integer.MAX_VALUE/10).toArray();
		
		Thread t1 = new MinThread(arr);
		Thread t2 = new MaxThread(arr);
		Thread t3 = new AverageThread(arr);
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("«акончили выполнение главного потока");

}
}