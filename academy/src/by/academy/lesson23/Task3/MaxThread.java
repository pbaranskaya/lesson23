package by.academy.lesson23.Task3;

import java.util.Arrays;

public class MaxThread extends Thread{
	
	public int[] arr;
	

	public MaxThread(int[] arr) {
		this.arr = arr;
	}
	
	@Override
	public void run() {
		System.out.println("max = " + Arrays.stream(arr).max().orElse(Integer.MIN_VALUE));
	}
}

