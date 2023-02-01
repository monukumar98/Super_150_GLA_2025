package Lec36;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Ques = "nitin";

		List<String> ll = new ArrayList<>();
		List<List<String>> ans = new ArrayList<>();
		Partitioning(Ques, ll, ans);
		System.out.println(ans);

	}

	public static void Partitioning(String Ques, List<String> ll, List<List<String>> ans) {
		if (Ques.length() == 0) {
			// System.out.println(ll);
			ans.add(new ArrayList<>(ll));
			return;
		}
		for (int i = 1; i <= Ques.length(); i++) {
			String part = Ques.substring(0, i);
			if (isPalindrome(part)) {
				ll.add(part);
				Partitioning(Ques.substring(i), ll, ans);
				ll.remove(ll.size() - 1);
			}

		}

	}

	public static boolean isPalindrome(String part) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = part.length() - 1;
		while (i < j) {
			if (part.charAt(i) != part.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
