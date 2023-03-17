package Lec41;

public class Person {

	private String name = "ramesh";
	private int age = 78;

//	public Person() {
//
//	}

//	public Person() {
//		this.age = 16;
//		this.name = "ravi";
//	}

	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public int getAge() {
		return age;
	}

//	public void setAge(int age) throws Exception{
//		if (age < 0) {
//			throw new Exception("bklol age -ve nhi hota hai ");
//		}
//
//		this.age = age;
//	}

	public void setAge(int age) {
		try {
			if (age < 0) {
				throw new Exception("bklol age -ve nhi hota hai ");
			}
			System.out.println("In  try Block");
			this.age = age;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("In  catch Block");

		}
		finally {
			System.out.println("I am in finaly blocks");
		}
	}
}
