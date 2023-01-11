package Lec31;

public class Coin_Toss_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		System.out.println("\n" + Count(n, ""));

	}

	public static int Count(int n, String ans) {
		// TODO Auto-generated method stub
		if (n == 0) {
			System.out.print(ans + " ");
			return 1;
		}
		int a = Count(n - 1, ans + "H");
		int b = Count(n - 1, ans + "T");
		return a + b;

	}

}
