//package coreJava;
//
//public class dayR {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		int a = 10;
//		int b = 20;
//		
//		System.out.println(a+b);
//		System.out.println(a-b);
//		System.out.println(a*b);
//		System.out.println(a/b);
//		System.out.println(a%b);
//		
//		int a1 = 10;
//		int a2 = 15;
//		
//		System.out.println(a1+a2);
//		System.out.println(a1-a2);
//		System.out.println(a1*a2);
//		System.out.println(a1/a2);
//		System.out.println(a1%a2);
//		
//		Calculator(2,4);
//		
//		
//		// comparison 
//		
//		// <, >, <= ,>= ,!= ,==
//		
//		
//		System.out.println(4>2);
//		System.out.println(4<2);
//		System.out.println(4==2);
//		System.out.println(4!=2);
//		System.out.println(4==2);
//		System.out.println(4!=4);
//		System.out.println(4>=2);
//		System.out.println(4<=2);
//		System.out.println(4>=4);
//		System.out.println(4<=4);
//
//		
//		
//		// logical 
//		
//		
//		//&&
//		
//		// true  && true   ---> true
//		// true  && false   ---> false
//		// false  && true   ---> false
//		// false  && false   ---> false
//		
//		
//		System.out.println(2== 2 && 3 == 3);
//		System.out.println(2== 2 && 3 != 3);
//		System.out.println(2!= 2 && 3 == 3);
//		System.out.println(2!= 2 && 3 != 3);
//		
//		//||
//		
//
//		// true || true   ---> true
//		// true  || false   ---> true
//		// false  || true   ---> true
//		// false  || false   ---> false
//		
//		
//		System.out.println(2== 2 || 3 == 3);
//		System.out.println(2== 2 || 3 != 3);
//		System.out.println(2!= 2 && 3 == 3);
//		System.out.println(2!= 2 || 3 != 3);
//		
//		
//		
//		
//		// !
//		// !true  - false
//		// !false - true
//		
//		System.out.println(!(2== 2 || 3 == 3));
//		System.out.println(!(2!= 2 && 3 == 3));
//		
//		
//		// conditional statements 
//		
//		
////		if(condition) {
////			// statements
////		}
//		
//		int numt = 5;
//		
//		if(numt > 0 && numt <=5) {
//			System.out.println("5 % discount");
//		}
//		if(numt > 5 && numt <=10) {
//			System.out.println("10 % discount");
//		}
//		if(numt > 10) {
//			System.out.println("20 % discount");
//		}
//		
//		
//		if(numt > 0 && numt <=5) {
//			System.out.println("5 % discount");
//		}
//		else if(numt > 5 && numt <=10) {
//			System.out.println("10 % discount");
//		}
//		else if(numt > 10) {
//			System.out.println("20 % discount");
//		}
//		else {
//			System.out.println("30 % discount");
//		}
//		
//		int marks = 92;
//		
//		if(marks > 90) {
//			System.out.println("Grade A");
//		}
//		if(marks >= 75) {
//			System.out.println("Grade B");
//		}
//		if(marks >= 65) {
//			System.out.println("Grade C");
//		}
//		
//		if(marks > 90) {
//			System.out.println("Grade A");
//		}
//		else if(marks >= 75) {
//			System.out.println("Grade B");
//		}
//		else if(marks >= 65) {
//			System.out.println("Grade C");
//		}
//		else {
//			System.out.println("please try again");
//		}
//		
//		
//		int aaa = 10;
//		int bbb = 5;
//		
//		if(aaa > bbb) {
//			System.out.println("aaa is greater");
//		}
//		else {
//			System.out.println("bbb is greater");
//		}
//		
//		
//		String ccc = aaa > bbb ?"aaa is greater":"b is greater";
//		System.out.println(ccc);
//		
//		int x1 = 5;
//		int x2 = 4;
//		int x3 = 6;
//		
//		if(x1 > x2 && x1 > x3) {
//			System.out.println("x1 is greater");
//		}
//		else if(x2 > x1 && x2 > x3) {
//			System.out.println("x2 is greater");
//		}
//				
//		else {
//			System.out.println("x3 is greater");
//		}
//				
//		
//		// switch case
//		
//		String city = "pune";
//		switch(city) {
//		case "pune":
//			System.out.println("MH");
//		case "bhopal":
//			System.out.println("MP");
//		default:
//			System.out.println("incorrect city name ..");
//		
//		}
//		
//		
//		String city2 = "pune";
//		switch(city2) {
//		case "pune":
//			System.out.println("MH");
//			break;
//		case "bhopal":
//			System.out.println("MP");
//			break;
//		default:
//			System.out.println("incorrect city name ..");
//		
//		}
//		
//		String city3 = "pune";
//		switch(city3) {
//		case "pune":
//		case "nagpur":
//			System.out.println("MH");
//			break;
//		case "bhopal":
//		case "indore":
//			System.out.println("MP");
//			break;
//		default:
//			System.out.println("incorrect city name ..");
//		
//		}
//		
//		// loops 
//		
//		
//		for(int i = 1 ; i <= 3 ; i++) {
//			System.out.println(i);
//		}
//		
//		
//		int i1 = 1;
//		while(i1 <= 3) {
//			System.out.println(i1);
//			i1 = i1 + 1;
//		}
//		
//		for(int i = 5 ; i >= 1 ; i--) {
//			System.out.println(i);
//		}
//		
//		int i2 = 5 ;
//		while(i2 >= 1) {
//			System.out.println(i2);
//			i2 = i2 - 1;
//		}
//		
//		
//		for(int i = 2 ; i <= 20 ; i = i+ 2) {
//			System.out.println(i);
//		}
//		
//		int i3 = 2;
//		while(i3 <= 20) {
//			System.out.println(i3);
//			i3 = i3 + 2 ;
//		}
//		
//		
//		for(int i = 1; i <= 3 ;i++) {
//			System.out.println("hello");
//		}
//		
//		int i4 = 1;
//		while(i4 <= 3) {
//			System.out.println("hello");
//			i4 = i4 + 1;
//		}
//		
//		
//		for(int i = 1 ; i <= 5 ; i++) {
//			if(i == 3) {
//				break;
//			}
//			System.out.println(i);
//		}
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//				
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//
//	}
//
//	public static void Calculator(int x, int y) {
//		System.out.println(x + y);
//		System.out.println(x - y);
//		System.out.println(x * y);
//		System.out.println(x / y);
//		System.out.println(x % y);
//	}
//
//}
