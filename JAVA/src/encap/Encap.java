package encap;

public class Encap {

	private int i;
	
public void se(int i) 
{
	this.i=i;
	
}

public int ge() 
{
return i;
}

	public static void main(String[] args) {
Encap e= new Encap();

e.se(2344);
System.out.println("   value is   "+ e.ge());
e.se(23445);
System.out.println("   value is   "+ e.ge());
	}
	}

	