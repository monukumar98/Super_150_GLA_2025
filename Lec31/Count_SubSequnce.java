package Lec31;

public class Count_SubSequnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abc";
		PrintSubSeq(ques, "");
		// System.out.println("\n" + count);
		System.out.println("\n" + CountSubSeq(ques, ""));

	}

	static int count = 0;

	public static void PrintSubSeq(String ques, String ans) {
		// TODO Auto-generated method stub
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			count++;
			return;
		}

		char ch = ques.charAt(0);
		PrintSubSeq(ques.substring(1), ans);
		PrintSubSeq(ques.substring(1), ans + ch);

	}

	public static int CountSubSeq(String ques, String ans) {
		// TODO Auto-generated method stub
		if (ques.length() == 0) {
			return 1;
		}

		char ch = ques.charAt(0);
		int a = CountSubSeq(ques.substring(1), ans);
		int b = CountSubSeq(ques.substring(1), ans + ch);
		return a + b;

	}

}
