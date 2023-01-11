package Lec31;

public class Coin_Toss_No_2Head {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		Print(n, "");
	}

	public static void Print(int n, String ans) {
		// TODO Auto-generated method stub
		if (n == 0) {
			System.out.print(ans + " ");
			return;
		}
		if (ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H') {
			Print(n - 1, ans + "H");
		}
		Print(n - 1, ans + "T");

	}
}
