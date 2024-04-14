package chapter04;

import java.util.Scanner;

public class Study6Ex2 {

	public static void main(String[] args) {

		//do while문
		int input = 0, answer = 0;
		
		answer = (int)(Math.random()*100)*1; //1~100사이의 임의의 수를 저장
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("1과 100 사이의 정수를 입력 : ");
			input = scanner.nextInt();
			
			if(input > answer) {
				System.out.println("더 작은 수로 시도해보세요");
			} else if(input < answer) {
				System.out.println("더 큰 수로 다시 시도해보세요");
			} 
		} while (input!=answer);
		System.out.println("정답");
		
	}
}
