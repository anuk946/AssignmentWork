package swap;

public class FourNumWithoutTemp {

	public static void main(String[] args) {
		int a=100;int b=200; int c=300; int d=400;
		System.out.println("Before Swapping");
		System.out.println("a="+a+", b="+b+", c="+c+", d="+d);
		//swapping
		a=a+b+c+d;//100+200+300+400=1000
		b=a-(b+c+d);//1000-(200+300+400)=100
		c=a-(b+c+d);//1000-(100+300+400)=200
		d=a-(b+c+d);//1000-(100+200+400)=300
		a=a-(b+c+d);//1000-(100+200+300)=400
		
		
		System.out.println("After Swapping");
		System.out.println("a="+a+", b="+b+", c="+c+", d="+d);
		

	}

}
