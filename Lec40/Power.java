package Lec40;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 7;
		int b = 5;
		System.out.println(pow(a, b));
	}

	public static int pow(int a, int b) {
		if (b == 0) {
			return 1;
		}

		int ans = pow(a, b / 2);
		ans = ans * ans;
		if (b % 2 != 0) {
			ans *= a;
		}
		return ans;
	}

}
