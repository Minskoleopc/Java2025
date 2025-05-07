package coreJava;

public class StringClass {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hello");
		
		String src = "Java";
		String src2 = "Java";
		System.out.println(src == src2);
		
		String src3 = new String("Java");
		System.out.println(src3 == src);
		
		System.out.println(src.equals(src3));
		
		
		String src4 = "chinmay";
		char ch = src4.charAt(0);
		System.out.println(ch);
		
		int a = src4.length();		
		System.out.println(a);
		
		// program 2
		String src5 = "chandrapur";
		String b = src5.substring(1);
		System.out.println(b);
		String c = src5.substring(1,5);
		System.out.println(c);
		
		
		// program 3
		
		String src6 = "hello";
		String src7 = "Bye";
		
		String d = src6.toUpperCase();
		System.out.println(d);
		
		String e = src7.toLowerCase();
		System.out.println(e);
		
		
		// program 4
		
		src = "Java";
		src2 = "java";
		
		boolean f = src.equals(src2);
		System.out.println(f);
		
		boolean g = src.equalsIgnoreCase(src2);
		System.out.println(g);
		
		
		String src8 =  "apple  mango banana orange grapes apple";
		boolean j = src8.contains("Apple");
		System.out.println(j);
		
		
		String k = src8.replace("apple", "papaya");
		System.out.println(k);
		
		String src9 = " pune ";
		System.out.println(src9.length());
		
		String l = src9.trim();
		System.out.println(l.length());
		
		String src10 = "rampur";
		boolean m = src10.startsWith("ram");
		boolean n = src10.startsWith("r");
		
		System.out.println(m);
		System.out.println(n);
		

		boolean o = src10.endsWith("r");
		boolean p = src10.endsWith("pur");
		
		System.out.println(o);
		System.out.println(p);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
