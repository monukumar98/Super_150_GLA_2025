package Lec18;

public class Playing_With_Good_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "cbaieklae";
		System.out.println(PlayingGoodString(str));

	}

	public static int PlayingGoodString(String str) {

		int ans = 0;
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (isvowels(ch) == true) {
				count++;
			} else {
				ans = Math.max(ans, count);
				count = 0;
			}

		}
		ans = Math.max(ans, count);
		return ans;
	}

	public static boolean isvowels(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		return false;
	}

}
