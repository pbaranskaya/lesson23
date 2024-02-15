package by.academy.lesson23; //

public class NewThread extends Thread {

	private char c;

	public NewThread(char c) {
		this.c = c;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
			System.out.println(c);
		}
	}

}
