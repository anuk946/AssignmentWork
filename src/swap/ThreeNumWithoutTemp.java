package swap;

public class ThreeNumWithoutTemp {

	public static void main(String[] args) {
		int a=100;int b=200; int c=300;
				System.out.println("Before Swapping");
				System.out.println("a="+a+", b="+b+", c="+c);
				//swapping
				a=a+b+c;//100+(200+300)=600
				b=a-(b+c);//600-(200+300)=100
				c=a-(b+c);//600-(100+300)=200
				a=a-(b+c);//600-(100+200)=300
				
				
				System.out.println("After Swapping");
				System.out.println("a="+a+", b="+b+", c="+c);
				

	}

}
