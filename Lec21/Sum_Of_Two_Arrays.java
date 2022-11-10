package Lec21;

import java.util.ArrayList;

public class Sum_Of_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, 0, 4, 9, 6 };
		int[] arr2 = { 3, 4, 5, 6, 7, 8, 3 };
		TwoArraySum(arr1, arr2);

	}

	public static void TwoArraySum(int[] arr1, int[] arr2) {
		int i = arr1.length - 1;
		int j = arr2.length - 1;
		ArrayList<Integer> list = new ArrayList<>();
		int carry = 0;
		while (i >= 0 && j >= 0) {
			int sum = 0;
			sum = arr1[i] + arr2[j] + carry;
			list.add(sum % 10);
			carry = sum / 10;
			i--;
			j--;

		}
		while (i >= 0) {
			int sum = 0;
			sum = arr1[i] + carry;
			list.add(sum % 10);
			carry = sum / 10;
			i--;
		}
		while (j >= 0) {
			int sum = 0;
			sum = arr2[j] + carry;
			list.add(sum % 10);
			carry = sum / 10;
			j--;
		}
		if (carry != 0) {
			list.add(carry);
		}
		for (int k = list.size() - 1; k >= 0; k--) {
			System.out.print(list.get(k) + ", ");
		}
		System.out.println("END");
	}

}
