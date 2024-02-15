package by.academy.lesson23.Task3; //

import java.util.Arrays;

public class MinThread extends Thread{
	
	public int[] arr;
	

	public MinThread(int[] arr) {
		this.arr = arr;
	}
	
	@Override
	public void run() {
		System.out.println("min = " +Arrays.stream(arr).min().orElse(Integer.MIN_VALUE));
	}
}
