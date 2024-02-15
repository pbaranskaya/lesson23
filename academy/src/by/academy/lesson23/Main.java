package by.academy.lesson23;//

public class Main {

	public static void main(String[] args) {

//		NewThread t1 = new NewThread('s');
//		NewThread t2 = new NewThread('r');
//		NewThread t3 = new NewThread('t');
//		NewThread t4 = new NewThread('y');
//		t1.start();
//		t3.start();
//		t2.start();
//		t4.start();
		
		
		Thread t1 = new Thread(new RunnableClass());
		Thread t2 = new Thread(new RunnableClass());
		t1.start();
		t2.start();

	}
}
