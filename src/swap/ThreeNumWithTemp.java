package swap;

public class ThreeNumWithTemp {

	public static void main(String[] args) {
		
		int a=100;
		int b=200;
		int c=300;
		
		System.out.println("Before Swapping");
		System.out.println("a="+a+", b="+b+", c="+c);
		
		
		//swapping
		int temp=a;
		a=b;
		b=c;
		c=temp;
		
		System.out.println("After Swapping");
		System.out.println("a="+a+", b="+b+", c="+c);
		

	}

}
