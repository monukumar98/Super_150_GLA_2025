package Lec4;

import java.util.Scanner;

public class Pattrern_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space = n - 1;
		int star = 1;
		while (row <= 2 * n - 1) {
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}

			int j = 1;
			while (j <= star) {
				System.out.print("* ");
				j++;
			}
			// Mirroring
			if (row < n) {
				space--;
				star++;
			} else {
				space++;
				star--;
			}
			row++;
			System.out.println();

		}

	}

}
