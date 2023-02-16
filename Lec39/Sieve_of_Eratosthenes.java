package Lec39;

public class Sieve_of_Eratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeSieve(100);

	}

	// false -- > prime
	// true --> not prime
	public static void PrimeSieve(int n) {
		boolean[] prime = new boolean[n + 1];
		prime[0] = prime[1] = true;
		for (int i = 2; i * i < prime.length; i++) {
			if (prime[i] == false) {
				for (int k = 2; k * i < prime.length; k++) {
					prime[i * k] = true;

				}
			}

		}
		for (int i = 0; i < prime.length; i++) {
			if (prime[i] == false) {
				System.out.print(i + " ");
			}
		}
	}

}
