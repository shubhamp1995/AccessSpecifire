package private1;

public class demo1 
{
// private access specifires
	   int a;
	private demo1()
	{
		a=10;
	}
	private void square()
	{
		System.out.println(a*a);
	}
	public static void main(String[] args) {
		demo1 d1=new demo1();
		d1.square();
	}
}
