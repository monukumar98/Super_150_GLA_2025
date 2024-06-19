package SoLID_Principle;

public class Bke_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vechicle v = new Bike();
		System.out.println(((Bike) v).Trun_Off_Engine());
		System.out.println(v.StartEngine());
		System.out.println(v.Engine_type());

	}

}
