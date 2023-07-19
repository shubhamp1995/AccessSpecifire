package default1;

public class exa1 {
// default access specifires
	  int b;
	  exa1()
		{
			b=30;
		}
	
	   void cube() {                 // default access specifires
		System.out.println(b*b*b);
	}
	 public static void main(String[] args) {
		exa1 e2 =new exa1();
		System.out.println(e2.b);
		e2.cube();
		
	}
}
