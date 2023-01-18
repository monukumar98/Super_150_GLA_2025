package Lec33;

public class Key_Paid {
	static String[] key = { "", "abc", "def", "ghi", "jkl", "mno", "pqr", "stuv", "wx", "yz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printKeyPaid("129", "");

	}

	public static void printKeyPaid(String ques, String ans) {// 129
		if (ques.length() == 0) {
			System.out.print(ans+" ");
			return;
		}
		char ch = ques.charAt(0);// '1'
		String press = key[ch - '0'];// abc
		for (int i = 0; i < press.length(); i++) {
			printKeyPaid(ques.substring(1), ans + press.charAt(i));

		}

	}

}
