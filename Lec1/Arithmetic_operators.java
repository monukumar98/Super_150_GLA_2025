package Lec1;

public class Arithmetic_operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = -5;
		int b = 6;
		// int c = a + b;
		int c = a % b;

		// System.out.println(c);

		int a1 = 5;
		// a++ = a+1;
		System.out.println(a++);
		System.out.println(a);
		int x = 11;
		b = x--;
		System.out.println(b);

		int p = 5 + a++ - x-- - a + a++;
		System.out.println(p);
		int k = 77;
		System.out.println(--k);// k= k-1;
		a = 5;
		x = 4;
		int n = a++ + ++a - --x + --x + ++x;
		System.out.println(n);

	}

}
