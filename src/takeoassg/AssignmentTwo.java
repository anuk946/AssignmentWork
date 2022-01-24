package takeoassg;

public class AssignmentTwo {

	public static void main(String[] args) {
		
		//question 7
		System.out.println("question Num 7");
		
		
		calculatePlanCost(); 
		
		//question 8
		System.out.println("question Num 8");

		calculateFinalPizzaAmount();
		
		//question 9
		System.out.println("question Num 9");

		calculateTaxAmount();
		
		
		//question 10
		System.out.println("question Num 10");

		calculateTotalDeposit();
		

	}
	
	public static void calculatePlanCost() {
		
		double initialCost = 699;
		int gst = 18;
		
		double finalCost = initialCost + (initialCost*gst/100 );
		
		
		System.out.println("Total cost with gst = "+finalCost);
	}
	
	public static void calculateFinalPizzaAmount() {
		double pizzaCost = 399;
		int numOfPizza = 2;
		int discountP = 20;
		
		double totalPizzaCost = pizzaCost * numOfPizza;
		double totalDiscount = totalPizzaCost*discountP/100;
		
		double finalPizzaCost = totalPizzaCost - totalDiscount;
		
		System.out.println("Final Pizza Cost = "+finalPizzaCost);
		
				
		
	}
	public static void calculateTotalDeposit() {
		
		int p = 500000;
		int t = 5;
		double r = 6.8;
		
		double interestAmount = (p*t*r)/100;
		double totalAmount = interestAmount + p;
		
		System.out.println("Sarath Interest Amount ="+interestAmount);
		System.out.println("Total Amount = "+totalAmount);
		
		
		
				
				
	}
	public static void calculateTaxAmount () {
		int salary = 85000;
		int taxRate = 20;
		
		int taxAmount = salary * taxRate/100;
				
				System.out.println("Tax Amount = "+taxAmount);
				
				
	}

}
