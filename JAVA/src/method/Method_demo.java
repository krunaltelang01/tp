package method;

public class Method_demo {
	int a;
	int b;
		public void multiplication(int a, int b) 
		{
			System.out.println(a*b);
		}
		
		public void add(int a, int b) 
		{
			System.out.println(a+b);
		}	
		
		public void div(int a, int b) 
		{
			System.out.println(a/b);
		}
		
		
	public static void main(String[] args) 
	{
		Method_demo d=new Method_demo();
		d.multiplication(34,76);
		d.div(230, 45);
		d.add(424, 254);

	}

}
