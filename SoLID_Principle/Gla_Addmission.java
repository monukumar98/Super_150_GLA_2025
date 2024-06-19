package SoLID_Principle;

public class Gla_Addmission {

	private Student s;
	private int count_Subject;

	public Gla_Addmission(Student s) {
		// TODO Auto-generated constructor stub
		this.s = s;
	}

	public int Addmission_Fee(Student s, int c) {
		return c * 1000 + s.age * 7;

	}

//	public void Print_Addmission_Recipt() {
//		// printing fun ka kaam hoga
//	}
//	public void Save_date_Base(){
//		// data save krega 
//	}

}




