package chapter04;

public class Study4Ex1 {

	public static void main(String[] args) {

		for(int i = 0; i < 5 ;i++) {
			System.out.println("Hello World");
		}
		
		System.out.println();
		
		for(int i = 0; i < 5 ;i=i+2) {
			System.out.println("Hello World");
		}
		
		System.out.println();

		for(int i = 1; i < 10 ; i=i*2) {
			System.out.println("Hello World");
		}
		
		System.out.println();
		
		for(int i = 10; i >=1; i--) {
			System.out.println(i);
		}
		
		System.out.println();
		
		for(int i = 1, j= 10; i<=10; i++,j--) {
			System.out.println("i = " + i + ", j = " + j);
		}
		
	}
}
