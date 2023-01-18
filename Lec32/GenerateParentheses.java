package Lec32;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		List<String> ll = new ArrayList<>();
		Parentheses(n, "", 0, 0,ll);
		System.out.println(ll);

	}

	public static void Parentheses(int n, String ans, int open, int close,List<String> ll) {
		if (open ==n&& close==n) {
			//System.out.print(ans + " ");
			ll.add(ans);
			return;
		}
		if (open < n) {
			Parentheses(n, ans + "(", open + 1, close,ll);
		}
		if (close < open) {
			Parentheses(n, ans + ")", open, close + 1,ll);
		}

	}

}
