package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
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
		
//		List <String> names = Arrays.asList("chinmay","samay","ram");		
//		names.forEach(name -> System.out.println("hello"+name));
//		
//		
//		List <String> fruits = Arrays.asList("banana","apple","chikoo");
//		Collections.sort(fruits,(a,b)-> a.compareTo(b));
//		System.out.println(fruits);
//		
//		
//		List <Integer> numbers = Arrays.asList(10,12,33,44);
//		List <Integer> even = numbers.stream().filter(n-> n %2 == 0).collect(Collectors.toList());
//		System.out.println(even);
		
		Map <String , Integer> scores = Map.of("A",50,"B",70,"C",90,"D",89,"E",67);
		
		
		
		// Program 2
		// Map , Filter ,Every ,Some, Reduce
//		Map <String , Integer> filteredValues  = scores.entrySet().stream().filter(e -> e.getValue() >= 70)
//		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
//		System.out.println(filteredValues);
//		
//		
//		
		
		// program 1
//		System.out.println(scores);
//		System.out.println(scores.entrySet());
//		
//	
//		Map<String,Integer> updatedScore = scores.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, e->e.getValue()+ 10))	;	
//		System.out.println(updatedScore);
//		
	
//		Map<String,Integer> scores2 = Map.of("A",50,"B",70);
//		for(Map.Entry<String, Integer> entry:scores2.entrySet()) {
//			entry.getKey();
//			entry.getValue();
//			
//		}
		
		
	
		
		

		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

interface MathOperation {
	int operation(int a , int b);
}