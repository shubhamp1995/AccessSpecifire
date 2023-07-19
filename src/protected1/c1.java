package protected1;

public class c1 
{
// protected access specifires
	protected int a;
	protected c1()
	{
		a=20;
	}
	protected void m1()
	{
		System.out.println(a*a);
	}
	public static void main(String[] args) {
		c1 c11=new c1();
		c11.m1();
		System.out.println(c11.a);
	}
}
