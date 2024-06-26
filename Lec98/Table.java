package Lec98;

public class Table {

	synchronized public void print(int n) throws InterruptedException {
		for (int i = 1; i <= 6; i++) {
			System.out.println(n * i);
			Thread.sleep(4000);
		}

	}
}
