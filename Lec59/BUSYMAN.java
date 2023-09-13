package Lec59;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BUSYMAN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			Pair[] arr = new Pair[n];
			for (int i = 0; i < arr.length; i++) {
				int start = sc.nextInt();
				int end = sc.nextInt();
				arr[i] = new Pair(start, end);
			}
			Arrays.sort(arr, new Comparator<Pair>() {

				@Override
				public int compare(Pair o1, Pair o2) {
					// TODO Auto-generated method stub
					return o1.end - o2.end;
				}
			});
			int activity = 1;
			int end = arr[0].end;
			for (int i = 1; i < arr.length; i++) {
				if (arr[i].start >= end) {
					activity++;
					end = arr[i].end;
				}
			}
			System.out.println(activity);

		}
	}

	static class Pair {
		int start;
		int end;

		public Pair(int start, int end) {
			// TODO Auto-generated constructor stub
			this.start = start;
			this.end = end;
		}
	}

}
