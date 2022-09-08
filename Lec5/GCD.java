package Lec5;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int divisor = 36;
		int divident = 60;

		while (divident % divisor != 0) {
			int rem = divident % divisor;
			divident = divisor;
			divisor = rem;
		}
		System.out.println(divisor);
	}

}
