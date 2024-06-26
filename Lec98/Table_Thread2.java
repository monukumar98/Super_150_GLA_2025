package Lec98;

public class Table_Thread2 extends Thread{
	private Table t;

	public Table_Thread2(Table t) {
		// TODO Auto-generated constructor stub
		this.t = t;
	}

	@Override
	public void run() {
		
		try {
			t.print(12);
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
