package Lec33;

public class Permutaion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abc";
		PrintAnswer(ques, "");

	}

	public static void PrintAnswer(String ques, String ans) {
		// TODO Auto-generated method stub
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < ques.length(); i++) {
			String s1 = ques.substring(0, i);
			String s2 = ques.substring(i + 1);
			char ch = ques.charAt(i);
			PrintAnswer(s1 + s2, ans + ch);

		}

	}

}
