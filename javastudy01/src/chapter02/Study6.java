package chapter02;

public class Study6 {
	
	public static void main(String[] args) {

		//두 변수 값 교환
		int x = 10;
		int y = 20;
		
		x = y; 
		y = x;
		
		System.out.println(x);
		System.out.println(y);
		
		int a = 10;
		int b = 20;
		int temp;
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
	}
}
