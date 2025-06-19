package collection;
import java.util.HashMap;

public class HasMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		// Table
		
		// CRUD
		// create
		HashMap<Integer,String> mapA = new HashMap();
		
		mapA.put(1,"admin");
		mapA.put(1,"customer");
		mapA.put(2,"manger");
		mapA.put(3,"CA");
		
		mapA.put(3,null);
		mapA.put(4, null);
		mapA.put(5, "supervisior");
		
		
		System.out.println(mapA);
		
		//retrive
		
		mapA.get(3);
		System.out.println(mapA.get(3));
		
		
		//particular key exist 
		
		boolean k = mapA.containsKey(2);
		System.out.println(k);
		
		boolean v = mapA.containsValue("supervisior");
		System.out.println(v);
		
		
		// remove
		
		mapA.remove(1);
		System.out.println(mapA);
		
		// update
		mapA.replace(2, "ceo");
		
		// size()
		System.out.println(mapA.size());
		
		
		for(Integer key:mapA.keySet()) {
			System.out.println(key);
			System.out.println(mapA.get(key));
		}
		
		

		
		
	}

}

