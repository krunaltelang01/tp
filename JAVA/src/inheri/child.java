package inheri;

class parent 
{
	public void m() 
	{
			System.out.println("i m parent ");
	}	
}
class parent_1
{
	public void m() 
	{
			System.out.println("i m parent ");
	}	
}


class child extends parent  {

	public void m1() 
	{
			System.out.println("i m child ");
	}	

	public static void main(String[] args) {

		child c= new child();
		c.m();

		c.m1();

	}

}
