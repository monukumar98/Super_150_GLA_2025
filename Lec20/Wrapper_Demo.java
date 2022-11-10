package Lec20;

public class Wrapper_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = 10;
		int a1 = 10;
		System.out.println(a);
		System.out.println(a1);

		a = a1;// pri-->non pri AutoBoxing
		int b = -6;
		Integer b1 = -9009;
		b = b1;// non pri --> pri UnBoxing

		Integer c1 = 10;
		Integer c2 = 10;
		Integer c3 = 178;
		Integer c4 = 178;
		
		System.out.println(c1 == c2);
		System.out.println(c3 == c4);

	}

}
