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
				
		String str9 = "pune"; 
		// 0  1  2  3
		// p  u  n  e
		
		System.out.println(str9.indexOf("u"));	
		System.out.println(str9.indexOf("pune"));
		System.out.println(str9.indexOf("P"));
		
		
		// program 7
		
		String str10 = " ";
		boolean n = str10.isEmpty();
		System.out.println(n);
		
		boolean m = str10.isBlank();
		System.out.println(m);
		
		// program 8
		
		// String + String ====> String
		// number + String ====> String 
		// String + number ====> String 
		// number + number ====> number
		
		int i  = 10;
		int i1 = 5;
		String i2 = "hello";
		
		System.out.println(i+i1);
		System.out.println(i+i2);  // 10 + "hello"  ====> "10hello"
		System.out.println(i2 + i);//  "hello10"
		System.out.println(i+i1+i2);  // "15hello"
		System.out.println(i2+i1+i); // "hello510"
		// string + number + number
			 // string + number 
					// string
		
		// number + number + string
				//number + string 
					// string
		
		
		// program 8 
		
		String str11 = "Hello";
		String str12 = "Bye";
		System.out.println(str11.concat(str12));
		
		
		// program 9
		// Repeat 
		
		String srt12 = "Hello ";
		String str14 = srt12.repeat(3);
		System.out.println(str14);
		
		
		String h1 = "hello";
		String h2 = "Bye";
		boolean h33 = h1.equals(h2);
		System.out.println(h33);
		
		
		// program 10
		
		String city16 = "pune";
		String rev = "";
		
		// 0     1      2     3
		// p     u      n     e
		// e     n      u     p
		
		
		for(int i11 = 0 ;i11 < city16.length() ; i11++) {
			//System.out.println(i11);
			//System.out.println(city16.charAt(i11));
			
			rev = city16.charAt(i11) + rev;
					//	"p"  +  ""  ----> p
					//   u   +   o  ----> up
			        //   n   +   up  -----> nup
			        //   e   +   nup  -----> enup
			
			
		}
		System.out.println(rev);
		
		// Arrays
		
		
		
		
		
		
		
		
		
		
		
	
		
	}

}
