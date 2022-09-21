package Lec10;

public class Range_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {2,3,3,5,6,1,12,134,4,5,1,3};
		Reverse(arr, 2, 7);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		

	}
	public static void Reverse(int[] arr,int i, int j) {
		// TODO Auto-generated method stub
		
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

	}

}
