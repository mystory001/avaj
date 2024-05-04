package chapter09;

public class Study10Ex1 {
	
	public static void main(String[] args) {

		System.out.println(Integer.parseInt("100")); //10진수
		System.out.println(Integer.parseInt("100", 10)); //10진수
		System.out.println(Integer.parseInt("100", 2)); //2진수
//		System.out.println(Integer.parseInt("FF", 2)); //NumberFormatException
		System.out.println(Integer.parseInt("FF", 16)); 
		
	}

}
