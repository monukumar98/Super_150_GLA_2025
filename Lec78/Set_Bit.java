package Lec78;

public class Set_Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 67;
		int pos = 3;
		int mask = (1 << pos);
		if ((n & mask) == 0) {
			System.out.println("Set nhi hai ");
		} else {
			System.out.println("Set hai ");
		}

	}

}
