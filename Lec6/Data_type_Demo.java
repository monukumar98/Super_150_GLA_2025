package Lec6;

import java.util.Scanner;

public class Data_type_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 14;
		int i = 10;
		long l = 10;
		short s = 10;
		b = (byte) (i);
		System.out.println(b);
		l = s;
		l = (1000_000_0001l);
		System.out.println(l);
		Scanner sc = new Scanner(System.in);
//		b=sc.nextByte();
//		i = sc.nextInt();
//		l=sc.nextLong();
//		System.out.println(b);
//		System.out.println(i);
//		System.out.println(l);
		System.out.println(Integer.MIN_VALUE);//-2^31
		System.out.println(Integer.MAX_VALUE);//2^31-1
		
		
	}

}
