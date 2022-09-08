package Lec5;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int a = 0;
		int b = 1;
		for (int i = 1; i <= n; i++) {
			int c = a + b;
			a = b;
			b = c;

		}
		System.out.println(a);

	}

}
