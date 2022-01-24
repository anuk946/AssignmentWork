package takeoassg;

import java.util.Scanner;

public class AssignmentFive { 
	
	public static void main(String[] args) {
		// even number between 1 to 100
	
		System.out.println("Even Number Between 1 to 100");
		
		for (int i =1 ; i<=100; i++) {
			
			if(i%2 == 0 ) {
				
				System.out.print(i); 
				System.out.print(", ");
				
			}
		}
		
		//prime number
		System.out.println();
		System.out.println();
		primeNumber();
		
		//fiabnoic series
		System.out.println();
		fiabnoicSeries();
	}
	


public static void primeNumber () {
	// prime number between 1 to 100
	
	System.out.println("Prime Number Between 1 to 100");
	
	for (int i = 2; i<=100; i++) {
		
		if ( isPrimeNumber(i) ) {
		
			System.out.print(i);
			System.out.print(", ");
			
		}
	}
}

	public static boolean isPrimeNumber(int i) {
		
		if(i%1 != 0) return false;
		
		for(int j=2; j<=i/2; j++) {
			
			if(i%j == 0) 
				return false;
		}
		return true;
	}
	
	public static void fiabnoicSeries () {
		
		int a=0 , b=1 ;
		
		// fiabonicSeries of n number
		
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a N number to print fiabonic Series");
		int n = sc.nextInt();
		
		System.out.println("fiabonic Series ");
		
        for (int i = 1 ; i<= n; i++) {
	        
	        System.out.print(a) ;
	        System.out.print(", ") ;
	        
	        int sum = a + b ;
	        a = b ;
	        b = sum ;
         
        
        }  
}
}




	



