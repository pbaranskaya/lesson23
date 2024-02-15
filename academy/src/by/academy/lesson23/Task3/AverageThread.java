package by.academy.lesson23.Task3; 

import java.util.Arrays;

public class AverageThread extends Thread {

	public int[] arr;

	public AverageThread(int[] arr) {
		this.arr = arr;
	}

	@Override
	public void run() {
		System.out.println("average = " + Arrays.stream(arr).average().orElse(Integer.MIN_VALUE));
	}
}
