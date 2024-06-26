package Lec98;

public class Table_Client {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Table t = new Table();
		Table_Thread1 th1 = new Table_Thread1(t);
		Table_Thread2 th2 = new Table_Thread2(t);
		th1.start();
		th2.start();
		//th2.start();

	}

}
