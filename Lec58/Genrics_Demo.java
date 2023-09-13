package Lec58;

public class Genrics_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = { 10, 203, 45, 89, 18 };
		Display(arr);
		System.out.println();
		String[] arr1 = { "Ram", "Anku", "Ankita", "Raj" };
		Display(arr1);

	}

	public static<T> void Display(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
