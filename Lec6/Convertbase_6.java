package Lec6;

public class Convertbase_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 137;
		int sum = 0;
		int mul = 1;
		while (n > 0) {
			int rem = n % 6;
			sum = sum + rem * mul;
			n = n / 6;
			mul = mul * 10;
		}
		System.out.println(sum);

	}

}
