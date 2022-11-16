package Lec23;

public class String_Vs_StringBulider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringCom();
		//StringBuilderCom();

	}

	public static void StringCom() {
		String s = "";
		for (int i = 0; i < 100000; i++) {
			s = s + i;
		}
		System.out.println(s);
	}

	public static void StringBuilderCom() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100000; i++) {
			sb.append(i);
		}
		System.out.println(sb);
	}

}
