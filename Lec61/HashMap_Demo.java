package Lec61;

import java.util.*;

public class HashMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		// Add
		map.put("Raj", 68);
		map.put("Manish", 78);
		map.put("Amisha", 67);
		map.put("Puneet", 98);
		map.put("Atul", 78);
		map.put("Pooja", 78);
		map.put("Ankit", 78);
		map.put("Ankita", 78);
		// map.put(null, 78);
		// map.put("Pooja", 58);
		System.out.println(map);
		// get
//		System.out.println(map.get("Ankit"));
//		System.out.println(map.get("Anku"));
//		// remove
//		System.out.println(map.remove("Anku"));
//		System.out.println(map.remove("Ankit"));
//		System.out.println(map);
//		// Conatins
//		System.out.println(map.containsKey("kunal"));
//		System.out.println(map.containsKey("Raj"));
		TreeMap<String, Integer> map1 = new TreeMap<>();
		// Add
		map1.put("Raj", 68);
		map1.put("Manish", 78);
		map1.put("Amisha", 67);
		map1.put("Puneet", 98);
		map1.put("Atul", 78);
		map1.put("Pooja", 78);
		map1.put("Ankit", 78);
		map1.put("Ankita", 78);
		System.out.println(map1);
		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
		map2.put("Raj", 68);
		map2.put("Manish", 78);
		map2.put("Amisha", 67);
		map2.put("Puneet", 98);
		map2.put("Atul", 78);
		map2.put("Pooja", 78);
		map2.put("Ankit", 78);
		map2.put("Ankita", 78);
		// map2.put(null, 77);
		System.out.println(map2);
		Set<String> key = map.keySet();
		for (String k : key) {
			System.out.println(k + " " + map.get(k));
		}

	}

}
