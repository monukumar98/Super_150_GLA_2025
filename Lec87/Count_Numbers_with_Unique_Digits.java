package Lec87;

public class Count_Numbers_with_Unique_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		System.out.println(Unique_Digits(n));

	}

	public static int Unique_Digits(int n) {
		if (n == 0) {
			return 1;
		}
		int c = 9;
		for (int i = 2; i <= n; i++) {
			c = c * (11 - i);
		}

		return c + Unique_Digits(n - 1);
	}

}
