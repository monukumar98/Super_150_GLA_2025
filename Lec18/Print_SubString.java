package Lec18;

public class Print_SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		System.out.println(str.substring(3));//lo
		printSubString(str);

	}

	public static void printSubString(String str) {

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				System.out.println(str.substring(i, j));
			}
		}
	}

}
