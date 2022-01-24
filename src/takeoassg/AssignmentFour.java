package takeoassg;

import java.util.Scanner;

public class AssignmentFour {

	public static void main(String[] args) {
		
		//even number
		IsEvenNumber();
		
		//odd number
		IsOddNumber();
		
		//leap year
		IsLeapYear();
		
		
		
	}

	public static void IsEvenNumber() {
		
		Scanner sc = new Scanner(System.in);  // Create a Scanner object
		
		//even number check 
		System.out.println("Enter a number to check if it is even or not: ");
		int number = sc.nextInt();
		if(number%2 == 0) {
			System.out.println(number+" is even number");
		}
		else {
			System.out.println(number+" is not a even number");
		}
		}
	
	public static void IsOddNumber() {
		
		Scanner sc = new Scanner(System.in) ; // create a scanner object
		
		//odd number check 
		System.out.println(" Enter a number to check if it is odd or not ");
		int number = sc.nextInt();
		if(number%2 != 0) {
		
			System.out.println(number+" is odd number");
			
		}
		else {
			System.out.println(number+" is not a odd number");
		}
		
	}
	public static void IsLeapYear () {
		
	
		Scanner sc = new Scanner (System.in);  // create a scanner object
		 //leap year check
		System.out.println("Enter the year");
				int year = sc.nextInt();
		if(year%4==0)
		
			System.out.println("Given number is Leap Year");
	
	
	
			else {
				System.out.println("Not a leap year");
			}
				
		
		
		
	}
}
