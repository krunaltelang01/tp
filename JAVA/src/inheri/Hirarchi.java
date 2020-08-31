package inheri;
class p
{
	void m1() {System.out.println("me parent");}
}

class c	extends p
{
	void m2() {System.out.println("me child1");}
}

class c1 extends p
{
	
	void m3() {System.out.println("me child2");}
}

class Hirarchi {

	public static void main(String[] args) {

		c1 a= new c1();
		a.m1();
		a.m3();
		c a1= new c();
		a1.m2();
	}

}
