package Lec93;

public class Wildcard_Matching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aa";
		String p = "?*";

	}

	// i-->p & j-->s
	public static boolean Matching(String s, String p, int i, int j) {
		if (j == s.length()) {
			for (int k = i; k < p.length(); k++) {
				if(p.charAt(k)!='*') {
					return false;
				}
			}
			return true;

		}
		if(i==p.length()) {
			return false;
		}
		boolean ans = false;
		if (s.charAt(j) == p.charAt(i) || p.charAt(i) == '?') {
			ans = Matching(s, p, i + 1, j + 1);
		} else if (p.charAt(i) == '*') {
			boolean match = Matching(s, p, i, j + 1);
			boolean Dont_match = Matching(s, p, i + 1, j);
			ans = match || Dont_match;

		}
		return ans;

	}

}
