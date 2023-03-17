package Lec41;

public class Student_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		System.out.println(s.name);
		System.out.println(s.age);
		s.name = "kaju";
		s.age = 16;
		s.Intro_yourSelf();
		Student s1 = new Student();
		s1.name = "Kamlesh";
		s1.age = 18;
		s1.Intro_yourSelf();
		s1.SayHey("raju");
		Student.fun();

	}

}
