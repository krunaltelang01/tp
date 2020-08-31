package string;

public class Camparison {

	public static void main(String[] args) {
	
		String s="hello";
		String s1="hello";
		
		String s2= new String("hello");
		
		System.out.println(s==s2);
		System.out.println(s==s1);

		System.out.println(s.equals(s1));

		System.out.println(s.equals(s2));
	}

}
