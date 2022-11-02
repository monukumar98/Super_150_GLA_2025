package Lec18;

public class String_fun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "HelloHey";
		System.out.println(s.charAt(3));
		System.out.println(s.length());
		System.out.println(s.substring(2, 5));
		System.out.println(s.substring(1, 1));
		String s1 = "kunal";
		String s2 = "komal";
		System.out.println(s1.compareTo(s2));

	}

	public static int compareTo(String s1, String s2) {

		int i = 0; // s1
		int j = 0;// s2
		while (i < s1.length() && j < s2.length()) {
			if (s1.charAt(i) != s2.charAt(j)) {
				return s1.charAt(i) - s2.charAt(j);
			}
			i++;
			j++;
		}
		return s1.length()-s2.length();

	}
}
