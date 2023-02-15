package Lec38;

public class Time_Comp_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey");
		System.out.println("hey");
		System.out.println("hey");
		System.out.println("hey");
		System.out.println("hey");
		int n = 1000;
		int i = 0;
		while (i < n) {
			System.out.println("Hey");
			// O(N)
			i++;
		}

		while (i < n) {
			System.out.println("Hey");
			// log(N)
			i *= 2;
		}

		while (n > 0) {
			System.out.println("Hey");
			// log(N)
			n /= 2;
		}

		while (i <= n) {
			System.out.println("Hey");

			i += 2;
			i += 3;
		}

		while (i <= n) {
			System.out.println("Hey");
			// log(N) base 6
			i *= 2;
			i *= 3;
		}

		while (n > 0) {
			System.out.println("Hey");
			// log(N) base 6
			n /= 2;
			n /= 3;
		}
		int k = 12;
		while (i <= n) {
			System.out.println("Hey");
			// (N/k)
			i += k;
		}
		while (i <= n) {
			System.out.println("Hey");
			// log(N) base k
			i *= k;
		}

		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.println("hey");
				// O(n^2)
			}
		}
		for (i = 1; i * i <= n; i++) {
			// sqrt(N)
			System.out.println("hey");
		}
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= i * i; j++) {
				for ( k = 1; k <= n / 2; k++) {
					System.out.println("hey");
				}
			}
		}

		for (i = 1; i <= n; i *= 2) {
			System.out.println("hey");
			// log(N) base 2
		}

		for (i = n / 2; i <= n; i++) {
			for (int j = 1; j <= n / 2; j++) {
				for ( k = 1; k <= n; k = k * 2) {
					System.out.println("hey");
				}
			}
		}

		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j += i) {
				System.out.println("hey");
			}
		}

	}

}
