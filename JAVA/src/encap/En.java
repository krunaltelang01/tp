package encap;

public class En {

	private String i;
	
	 void set(String i) 
	{
		this.i=i;
	}
	
	  String  get() 
	{
		return i;
	}
	
	
	
	public static void main(String[] args) {
		En e=new  En();
		System.out.println();
		System.out.println("Geting string "+e.get());
		e.set("Selenium");
		System.out.println("Geting string "+e.get());}

}
