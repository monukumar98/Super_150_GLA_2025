package Lec66;

public class Edit_Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "FOOD";
		String s2 = "MONEY";
		System.out.println(EditDistance(s1, s2, 0, 0));
	}

	// i-->s1, j-->s2
	public static int EditDistance(String s1, String s2, int i, int j) {
		if (i == s1.length()) {
			return s2.length() - j;
		}
		if (j == s2.length()) {
			return s1.length() - i;
		}
		int ans = 0;
		if (s1.charAt(i) == s2.charAt(j)) {
			ans = EditDistance(s1, s2, i + 1, j + 1);
		} else {
			int D = EditDistance(s1, s2, i + 1, j);
			int R = Edit_Distance.EditDistance(s1, s2, i + 1, j + 1);
			int I = EditDistance(s1, s2, i, j + 1);
			ans = Math.min(I, Math.min(R, D)) + 1;
		}
		return ans;

	}

}
