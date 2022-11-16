package Lec22;

public class ReverseWordsinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "  the sky   is blue  ";
		System.out.println(reverseWords1(str));

	}

	public static String reverseWords1(String s) {
		s = s.trim();
		String[] arr = s.split("\s+");
		String ans = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			ans = ans + arr[i] + " ";
		}
		return ans.trim();
	}

}
