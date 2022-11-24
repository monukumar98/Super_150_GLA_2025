package Lec26;

public class Kartik_bhaiya_and_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abababbabbbbbaaaa";
		int k = 3;
		int aflip = perfectness_maximum_length(str, k, 'a');
		int bflip = perfectness_maximum_length(str, k, 'b');
		System.out.println(Math.max(aflip, bflip));

	}

	public static int perfectness_maximum_length(String str, int k, char ch) {

		int si = 0;
		int ei = 0;
		int flip = 0;
		int ans = 0;
		while (ei < str.length()) {
			// window Grow kiya hu
			if (str.charAt(ei) == ch) {
				flip++;
			}
			// window Shrink krna hai
			while (flip > k) {
				if (str.charAt(si) == ch) {
					flip--;
				}
				si++;
			}
			// cal window size
			ans = Math.max(ans, ei - si + 1);
			ei++;
		}

		return ans;

	}

}
