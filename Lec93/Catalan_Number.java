package Lec93;

public class Catalan_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		System.out.println(Catalan(n));

	}

	public static int Catalan(int n) {
		if (n == 0) {
			return 1;
		}
		int ans = 0;
		for (int i = 1; i <= n; i++) {
			ans = ans + Catalan(i - 1) * Catalan(n - i);
		}
		return ans;
	}

}
