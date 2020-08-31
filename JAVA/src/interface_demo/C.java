package interface_demo;

public class C implements P1, P2 {

	public static void main(String[] args) {
		C c= new C();
		c.m();
		c.m2();

	}
	public void m()
	{
		System.out.println("my m");
	}
	public void m2() {
	
		System.out.println("my m2");
		
	}

}
