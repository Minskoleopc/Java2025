package collection;
import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> fruits = new ArrayList<>();
		System.out.println(fruits);
		
		
		fruits.add("apple");
		System.out.println(fruits);
		
		fruits.add(1,"mango");
		System.out.println(fruits);
		
		fruits.add(1,"papaya");
		fruits.add(1,"grapes");
		fruits.add(1,"orange");
		
		fruits.remove(0);
		fruits.remove("orange");
		System.out.println(fruits);
		
		// get the element 
		
		String a1 = fruits.get(1);
		System.out.println(a1);
		
		String y1 = fruits.set(0, "grapes2");
		System.out.println(y1);
		System.out.println(fruits);
		
		System.out.println(fruits.contains("grapes2"));
		
		fruits.clear();
		System.out.println(fruits);
		
		boolean a11 = fruits.isEmpty();
		System.out.println("----"+a11);
		
		
		ArrayList<String> fruitsA = new ArrayList<>();
		fruitsA.add("papaya");
		fruitsA.add("grapes");
		fruitsA.add("orange");
		
		
		ArrayList<String> fruitsB = new ArrayList<>();
		fruitsB.add("papaya3");
		fruitsB.add("grapes3");
		fruitsB.add("orange4");
		
		
		fruitsA.addAll(fruitsB);
		System.out.println(fruitsA);
		
		System.out.println("--------------------------------");
		ArrayList<String> fruitsC = new ArrayList<>();
		fruitsC.add("papaya");
		fruitsC.add("grapes");
		fruitsC.add("orange");
		System.out.println(fruitsC.size());
		
		for(int i = 0 ; i < fruitsC.size();i++) {
			//System.out.println(i);
			System.out.println(fruitsC.get(i));
		}
		
		
		int i2 = 0;
		while(i2 < fruitsC.size()) {
			System.out.println(i2);
			System.out.println(fruitsC.get(i2));
			i2 = i2 + 1;
		}
		
		
		for(String fruit:fruitsC) {
			System.out.println(fruit);
		}
		
		
	}

}
