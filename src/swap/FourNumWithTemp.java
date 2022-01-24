package swap;

public class FourNumWithTemp {

	public static void main(String[] args) {
		int a=100;
		int b=200;
		int c=300;
		int d=400;
		
		
		System.out.println("Before Swapping");
		System.out.println("a="+a+", b="+b+", c="+c+", d="+d);
		
		
		
		//swapping
		int temp=a;
		a=b;
		b=c;
		c=d;
		d=temp;
		
		System.out.println("After Swapping");
		System.out.println("a="+a+", b="+b+", c="+c+", d="+d);
		
		
		
		

	}

}
