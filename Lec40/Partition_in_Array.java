package Lec40;

public class Partition_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 7, 2, 3, 8, 9, 1, 4 };
		int ans = partition(arr, 0, arr.length - 1);
		System.out.println(ans);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static int partition(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		int item = arr[ei];
		int pi=si;
		for (int i = si; i <ei; i++) {
			if(arr[i]<=item) {
				int temp = arr[i];
				arr[i]=arr[pi];
				arr[pi]=temp;
				pi++;
			}
		}
		int temp = arr[pi];
		arr[pi]=arr[ei];
		arr[ei]=temp;
		return pi;
		
	}

}
