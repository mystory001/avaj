package chapter04;

public class Study5 {
	
	public static void main(String[] args) {

		//중첩 for문
		
		for(int i = 2; i<= 9; i++) {
			System.out.println(i + "단");
			for(int j = 1; j <=9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
		
		//안쪽 for문이 먼저 실행된 후 바깥for문이 1번 실행
		
		System.out.println();
		//별찍기
		//**********
		//**********
		//**********
		//**********
		//**********
		
		//1.
		System.out.println("**********");
		System.out.println("**********");
		System.out.println("**********");
		System.out.println("**********");
		System.out.println("**********");
		
		System.out.println();
		
		//2.
		for(int i = 1; i <=5 ; i++) {
			System.out.println("**********");
		}
		
		System.out.println();
		
		//3. 내가 작성한 것
		for(int i = 1; i<=5; i++) {
			System.out.print("*");
			for(int j = 1; j<=9; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//4.
		for(int i = 1; i <=5 ; i++) {
			for(int j = 1; j <=10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 1; i <=10 ; i++) {
			for(int j = i; j <=10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 1; i <=10 ; i++) {
			for(int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
