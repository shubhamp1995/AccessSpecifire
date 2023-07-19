package publics;

public class p1 {

	public int a;
	public p1()
	{
		a=5;
	}
	
	public void y1() {
		System.out.println(a*a*a);
	}
	public static void main(String[] args) {
		p1 p11=new p1();
		p11.y1();
		System.out.println(p11.a);
	}
}

