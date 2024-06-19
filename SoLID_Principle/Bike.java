package SoLID_Principle;

public class Bike implements Vechicle {
	boolean Trun_On;
	int accl;

	@Override
	public boolean StartEngine() {
		// TODO Auto-generated method stub
		Trun_On = true;
		return Trun_On;
	}

	@Override
	public int Accelerate() {
		// TODO Auto-generated method stub
		return accl * 10;
	}

	@Override
	public Vechicle Engine_type() {
		// TODO Auto-generated method stub
		return new Bike();
	}

	public boolean Trun_Off_Engine() {
		Trun_On = false;
		return Trun_On;
	}

	public String toString() {
		return "KTM Bike ka Enegin Hai";
	}

}
