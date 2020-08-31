package method;

public class MethodwithInMethod {

	public void m1() 
	{
		System.out.print("manachya dhundit ");
	}
	
	public void m2()
	{
		this.m1();
		System.out.println("Laharit yena");
	}
	public static void main(String[] args) {
		
		MethodwithInMethod m= new MethodwithInMethod();
		m.m2();
	}
}
