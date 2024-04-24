package Lec90;

public class Smallest_Product_of_Two_Sorted_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { -4, -2, 0, 3 };
		int[] arr2 = { 2, 4 };
		int k = 6;
		System.out.println(Two_Sorted_Arrays(arr1, arr2, k));

	}

	public static long Two_Sorted_Arrays(int[] arr1, int[] arr2, int k) {
		long lo = -1000_000_0000l;
		long hi = 1000_000_0000l;
		long ans = 0;
		while (lo <= hi) {
			long mid = (lo + hi) / 2;
			if (countproduct(arr1, arr2, mid) >= k) {
				ans = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}

		}
		return ans;

	}

	private static long countproduct(int[] arr1, int[] arr2, long Dot_Prod) {
		// TODO Auto-generated method stub
		long ans = 0;
		for (int e1 : arr1) {
			int c = 0;
			if (e1 >= 0) {
				int lo = 0;
				int hi = arr2.length - 1;
				while (lo <= hi) {
					int mid = (lo + hi) / 2;
					if ((long) e1 * arr2[mid] <= Dot_Prod) {
						c = mid + 1;
						lo = mid + 1;
					} else {
						hi = mid - 1;
					}
				}
				ans += c;
			} else {
				int lo = 0;
				int hi = arr2.length - 1;
				while (lo <= hi) {
					int mid = (lo + hi) / 2;
					if ((long) e1 * arr2[mid] <= Dot_Prod) {
						c = arr2.length - mid;
						hi = mid - 1;
					} else {
						lo = mid + 1;
					}
				}
				ans+=c;
			}
		}
		return ans;
	}

}
