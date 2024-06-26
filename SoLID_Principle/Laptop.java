package SoLID_Principle;

public class Laptop {
	
	
	private Key_Board keybord;
	private Mouse mouse;

	public Laptop(Key_Board key, Mouse mouse) {
		// TODO Auto-generated constructor stub
		this.keybord = key;
		this.mouse = mouse;
	}

//	private Wire_Key_Bord keybord;
//	private Wire_Mouse mouse;
//
//	public Laptop(Wire_Key_Bord key, Wire_Mouse mouse) {
//		// TODO Auto-generated constructor stub
//		this.keybord = key;
//		this.mouse = mouse;
//	}

	public static void main(String[] args) {
		Laptop ll = new Laptop(new Wire_Key_Bord(), new BlueTooth_Mouse());
	}
}
