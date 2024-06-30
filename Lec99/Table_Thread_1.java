package Lec99;

public class Table_Thread_1 implements Runnable {
	private Table t;

	public Table_Thread_1(Table t) {
		// TODO Auto-generated constructor stub
		this.t = t;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		try {
			t.print(8);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
