package coreJava;

public class javaStringR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "hello";
		System.out.println(str);
		
		String str2 = new String("bye");
		System.out.println(str2);
		
		String city  = "pune";
		
		// 0    1    2    3
		// p    u    n    e
		char ch = city.charAt(0);
		System.out.println(ch);
		
		
		// program 2
		String city2 = "chandrapur";
		// 0    1    2   3   4   5   6   7   8    9
		// c    h    a   n   d   r   a   p   u    r
		
		// loops
		for(int i = 0 ; i  < 0 ; i++) {
			//System.out.println(i);
			System.out.println(city2.charAt(i)); // 0
		}
		
		int i3 = 0;
		while(i3 < 10) {
			//System.out.println(i3);
			System.out.println(city2.charAt(i3));
			i3 = i3 + 1;
		}
		
		
		// program 3
		String city4 = "nagpur";
		int q1 = city4.length();
		System.out.println(q1);
		
		for(int i = 0 ; i < city4.length(); i++) {
				//System.out.println(i);
				System.out.println(city4.charAt(i));
		}
		
		
		// program 4
		
		String str4 = "hello";
		String a = str4.toUpperCase();
		System.out.println(a);
		
		
		String str5 = "Pune";
		String b = str5.toLowerCase();
		System.out.println(b);
		
		
		
		// program 5
		
		String str6 = " goa ";
		System.out.println(str6.length());
		String c = str6.trim();
		System.out.println(c);
		
		
		// Program 6
		
		String src8 = "mumbai";
		boolean g = src8.startsWith("mu");
		System.out.println(g);
		
		boolean h = src8.endsWith("i");
		System.out.println(h);
		
		
		// 7:30pm
		
		
		
		
		
		
		
		
		
	}

}
