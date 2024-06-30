package Lec99;

public class Clinet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table t = new Table();
		Table_Thread_1 th = new Table_Thread_1(t);
		Thread thread = new Thread(th);
		thread.start();
		for (int i = 0; i <= 1000000; i++) {
			System.out.println("Hello");
		}

	}

}
