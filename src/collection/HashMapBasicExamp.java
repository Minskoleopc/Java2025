package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasicExamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Apple", 100);
		map.put("Banana", 80);
		map.put("Mango", 150);
		System.out.println("Map: "+ map);
		
		
//		// retrive
//		System.out.println(map.get("Apple"));
//		// exists
//		System.out.println(map.containsKey("Apple"));
		System.out.println(map.containsValue("100"));
//		// remove
//		map.remove("Banana");
//		System.out.println(map);
//		//size()
//		System.out.println(map.size());
//		
//		
//		for(Map.Entry<String, Integer> entry:map.entrySet()){
//				System.out.println(entry.getKey());
//				//System.out.println(entry.getValue());
//		}
//		
		
		// Section B
		// update
		map.put("Apple", 150);
		System.out.println(map);
		
		// update  the map if not present (add)
		map.putIfAbsent("Chikoo", 50);
		System.out.println(map);
		
		
		System.out.println(map.isEmpty());
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		
		map.forEach((key,value)-> System.out.println(value));
		
		
		
		

	}

}
