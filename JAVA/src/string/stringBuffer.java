package string;

public class stringBuffer {

	public static void main(String[] args) {

		StringBuffer s= new StringBuffer("A kya bolti tu  ???    ");
		System.out.println(s.capacity());
		System.out.println(s.length());
		System.out.println(s);
		
		s.append("Kya mai Bolu");
		System.out.println(s);
		System.out.println(s.capacity());
		System.out.println(s.length());
	}

}
