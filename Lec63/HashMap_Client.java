package Lec63;

public class HashMap_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Raj", 78);
		map.put("Kunal", 88);
		map.put("Ankit", 58);
		map.put("Ankita", 38);
		map.put("Amisha", 58);
		map.put("Anku", 72);
		map.put("Pooja", 48);
		map.put("Shiva", 28);
		map.put("Amisha", 98);
//		System.out.println(map.containsKey("puneet"));
		System.out.println(map.get("Anku"));
		System.out.println(map.get("Amisha"));
		System.out.println(map);

	}

}
