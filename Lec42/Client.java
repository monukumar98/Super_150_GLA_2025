package Lec42;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ll = new ArrayList<>();
		// CASE -1
//		P obj = new P();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		obj.fun();
//		obj.fun1();
//		// CASE 2
//		P obj = new C();
//		System.out.println(obj.d);//p
//		System.out.println(obj.d1);//p
//		System.out.println(((C)(obj)).d2);//c
//		System.out.println(((C)(obj)).d);//c
//		obj.fun();
//		obj.fun1();
//		((C)(obj)).fun2();
		// CASE 3
//		C obj = new P();
//		System.out.println(obj.d);
		// Case 4
		C obj = new C();
		System.out.println(obj.d);
		System.out.println(obj.d1);
		System.out.println(obj.d2);
		System.out.println(((P) (obj)).d);


	}

}
