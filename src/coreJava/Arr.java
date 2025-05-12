package coreJava;

public class Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numbers;
		int numbersB [];
		int numberC[] = new int[5]; // fixed
		
		numberC[0] = 12;
		numberC[1]= 13;
		numberC[2] = 14;
		numberC[3] = 45;
		numberC[4] = 56;
		
		System.out.println(numberC[0]);
		
		// program 2
		// Defining arrays with values 
		//               0  1  2  3  4
		int numberD[] = {11,22,33,44,5};
		String names [] = {"chinmay","shirish","ram","raj"};
		System.out.println(names.length);
		
		// for loop 
		
		for(int i = 0 ; i < names.length ; i++) {
			//System.out.println(i);
			System.out.println(names[i]);
		}
		
		// while loop 
		
		int i2 = 0;
		while(i2 < names.length) {
			System.out.println(i2);
			System.out.println(names[i2]);
			i2 = i2 + 1;
		}
		
		
		// for-each loop
		for(String x:names) {
			System.out.println(x);
		}
		
		
		int abc [] = {11,22,33,44,5};
		for(int x :abc) {
			System.out.println(x);
		}
		
		// program 3
		                         //r  //c
		int [][] matrix  = new int[2][3];
		
		
		matrix[0][0] = 23;
		matrix[0][1]= 44;
		matrix[0][2]= 55;
		

		matrix[1][0] = 23;
		matrix[1][1]= 44;
		matrix[1][2]= 55;
		
	
		System.out.println(matrix[0][1]);
		System.out.println(matrix[1][2]);
		
		
		
		for(int i  = 0 ; i < matrix.length ; i++) {
			int [] arr = matrix[i]; //[22,44,55] // [23,44,55]
			for(int j = 0 ; j < arr.length ; j++) {
				System.out.println(arr[j]);
			}
		}
		
		for(int [] arr:matrix) {
			for(int x:arr) {
				System.out.println(x);
			}
		}
		
		
		
			
		
		
		
 		
		
		
		
		
		
		
		
		
		

	}

}
