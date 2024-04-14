package chapter04;

import java.util.Scanner;

public class Study7 {

	public static void main(String[] args) {

		//break문
		//자신이 포함된 하나의 반복문을 벗어남
		
		int sum = 0;
		int i = 0;
		
		while(true) { //무한 반복문 ==> for(;;){}
			if(sum > 100)
				break; //자신이 속한 하나의 반복문을 벗어남
			i++;
			sum += i;
		}
		System.out.println("i = " + i + ", sum = " + sum);
		
		for(;;) {
			if(sum>100)
				break;
			i++;
			sum += i;
		}
		System.out.println("i = " + i + ", sum = " + sum);
		
		System.out.println();
		
		//contunue문
		//자신이 포함된 반복문의 끝으로 이동 -> 다음 반복으로 넘어감
		//전체 반복 중에서 특정 조건 시 반복을 건너뛸 때 유용
		for(int j = 0; j <=10; j++) {
			if(j%3==0) {
				continue;
			}
			System.out.print(j + " ");
		}
		
		System.out.println();
		
		int menu = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		while (true) {
			System.out.println("1. 자바");
			System.out.println("2. 자바스크립트");
			System.out.println("3. C++");
			System.out.print("사용할 수 있는 언어를 선택(1~3)하세요.(종료는 0) : ");
			
			String temp = scanner.nextLine();
			menu = Integer.parseInt(temp);
			
			
			if(menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if(!(1<=menu && menu <= 3)) {
				System.out.println("보기를 잘못 선택했습니다. (종료는 0)");
				continue;
			}
			System.out.println("선택한 언어는 " + menu);
		}
		
		System.out.println();
		
		//이름붙은 반복문
		//반복문에 이름을 붙여서 하나 이상의 반복문을 벗어날 수 있음
		
		//for문에 Loop1이라는 이름을 붙임
		Loop1 : for(int a=2; a<=9; a++) {
			for(int j=1; j<=9; j++) {
				if(j==5)
					break Loop1;
				
				System.out.println(a + " * " + j + " = " + a*j);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int a=2; a<=9; a++) {
			for(int j=1; j<=9; j++) {
				if(j==5)
					break;
				
				System.out.println(a + " * " + j + " = " + a*j);
			}
			System.out.println();
		}
		
		
		
		
	}
	
}
