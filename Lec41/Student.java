package Lec41;

public class Student {

	String name;
	int age;

	public void Intro_yourSelf() {

		System.out.println("My Name is " + this.name + " and age is " + this.age);

	}

	public void SayHey(String name) {
		System.out.println(name + " say hey to " + this.name);
	}

	public static void fun() {
		System.out.println("hey say");
	}

}
