package Lec82;
//Find a number X such that (X XOR A) is minimum and the count of set bits in X and B are equal

public class Minimum_Xor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 11;
		int b = 125;
	}
	public static int Min_Val(int a, int b) {
		int c = CountSet(b);
		int x = 0;
		for (int i = 31; i >= 0 && c > 0; i--) {
			if ((a & (1 << i)) != 0) {
				x += (1 << i);
				c--;
			}
		}
		for (int i = 0; i <= 31 && c > 0; i++) {
			if ((a & (1 << i)) == 0) {
				x += (1 << i);
				c--;
			}
		}
		return x;
	}

	public static int CountSet(int b) {
		int c = 0;
		while (b > 0) {
			c++;
			b = (b & (b - 1));
		}
		return c;
	}

}
