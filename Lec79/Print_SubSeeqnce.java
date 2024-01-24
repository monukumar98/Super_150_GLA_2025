package Lec79;

public class Print_SubSeeqnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		SubSeeqnce(str);

	}
	public static void SubSeeqnce(String str) {
		int n = str.length();
		for (int i = 0; i < (1 << n); i++) {
			Pattern(str, i);

		}

	}
	private static void Pattern(String str, int i) {
		// TODO Auto-generated method stub
		int pos = 0;
		while (i > 0) {
			if ((i & 1) != 0) {
				System.out.print(str.charAt(pos));
			}
			pos++;
			i >>= 1;
		}
		System.out.println();

	}
}
