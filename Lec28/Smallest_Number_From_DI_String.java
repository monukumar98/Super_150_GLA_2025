package Lec28;

public class Smallest_Number_From_DI_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "DDIIIDD";
		System.out.println(Smallest_Number(str));

	}

	public static String Smallest_Number(String str) {
		int[] ans = new int[str.length() + 1];
		int count = 1;
		for (int i = 0; i <= str.length(); i++) {

			if (i == str.length() || str.charAt(i) == 'I') {
				ans[i] = count;
				count++;
				for (int j = i - 1; j >= 0 && str.charAt(j) != 'I'; j--) {
					ans[j] = count;
					count++;

				}
			}

		}

		String s = "";
		for (int val : ans) {
			s += val;
		}
		return s;

	}

}
