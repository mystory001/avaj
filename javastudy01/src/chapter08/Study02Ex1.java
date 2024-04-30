package chapter08;

public class Study02Ex1 {
	
	public static void main(String[] args) {

		System.out.println(1);
		try {
			System.out.println(0/0);
			System.out.println(2);
		} catch (Exception e) {
			System.out.println(3);
		} //try-catch¹® ³¡
		
		System.out.println(4);
		
		
	}

}
