package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Lfunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//(parameter)-> expression/ statement
		//(parameters)-> {
			//statement -1 
	     	//statement - 2
		//}
		
		
		Runnable r = ()-> System.out.println("Hello lambda function");
		r.run();
		
		MathOperation addition = (a,b)-> a + b;
		MathOperation subtraction= (a,b)->a-b;
		
		System.out.println(addition.operation(12, 4));
		System.out.println(subtraction.operation(13, 4));
		
//		addition.operation(12, 4);
//		subtraction.operation(13, 4);
//		
		
		List <String> names = Arrays.asList("chinmay","samay","ram");		
		names.forEach(name -> System.out.println("hello"+name));
		
		
		List <String> fruits = Arrays.asList("banana","apple","chikoo");
		Collections.sort(fruits,(a,b)-> a.compareTo(b));
		System.out.println(fruits);
		
		
		List <Integer> numbers = Arrays.asList(10,12,33,44);
		List <Integer> even = numbers.stream().filter(n-> n %2 == 0).collect(Collectors.toList());
		System.out.println(even);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

interface MathOperation {
	int operation(int a , int b);
}