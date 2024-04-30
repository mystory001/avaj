package chapter08;

public class Study02Ex4 {
	
	public static void main(String[] args) {

		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(args[0]);
			System.out.println(4);
		} catch (ArithmeticException e) {
			if(e instanceof ArithmeticException)
				System.out.println("true");
			System.out.println("ArithmeticException");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		System.out.println(5);
	}

}
