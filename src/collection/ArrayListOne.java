package collection;
import java.util.ArrayList;

public class ArrayListOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("grapes");
		fruits.add("banana");
		fruits.add("oranges");
		System.out.println(fruits);
		
		
		// Add the element to the specific index
		fruits.add(1,"papaya");
		System.out.println(fruits);
		
		// does the array list stores the value by index ?
		String f1 = fruits.get(0);
		System.out.println(f1);
		
		// update the element in ArrayList
		String f2 = fruits.set(0, "APPLE");
		System.out.println(fruits);
		
		// remove()
		
		fruits.remove(0);
		System.out.println(fruits);
		
		fruits.remove("oranges");
		System.out.println(fruits);
		
		// check particular element exist in list
		
		System.out.println(fruits.contains("oranges"));
		
		// total number of elements in arrayList
		System.out.println(fruits.size());
		
		
		for(int i = 0 ; i < fruits.size() ; i++) {
			System.out.println(fruits.get(i));
		}
		
		for(String f:fruits) {
			System.out.println(f);
		}
		
		
		fruits.forEach(f -> System.out.println(f.toUpperCase()));
		
		

		ArrayList<String> fruitsA = new ArrayList<>();
		fruitsA.add("apple");
		fruitsA.add("grapes");
		
		ArrayList<String> fruitsB = new ArrayList<>();
		fruitsB.add("appleB");
		fruitsB.add("grapesB");
		
		
		fruitsA.addAll(fruitsB);
		
		System.out.println(fruitsA);
		
		
	}

}
