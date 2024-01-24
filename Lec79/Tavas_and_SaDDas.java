package Lec79;

import java.util.Scanner;

public class Tavas_and_SaDDas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(Index(str));
	}
	public static int Index(String str) {
		int n = str.length();
		int x = (1 << n) - 2;// n-1 tk ke saare lucky mumber ke count
		int y = 0, pos = 0;
		for (int i = n - 1; i >= 0; i--) {
			if (str.charAt(i) == '7') {
				y = y + (1 << pos);
			}
			pos++;
		}
		return x + y + 1;
	}

}
