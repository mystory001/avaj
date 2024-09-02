package exercise.chapter04;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		//숫자맞추기 게임 1~100사이의 값을 반복적으로 입력해서 컴퓨터가 생각한 값을 맞추면 게임이 끝남
		//사용자가 값을 입력하면, 컴퓨터는 자신이 생각한 값과 비교해서 결과를 알려줌
		//사용자가 컴퓨터가 생각한 숫자를 맞추면 프로그램이 끝나고 몇 번 만에 숫자를 맞췄는지 알려줌
		
		int answer = (int)(Math.random()*100)+1;
		int input = 0; //사용자 입력을 저장할 공간
		int count = 0; //시도횟수를 세기위한 변수
		
		Scanner sc = new Scanner(System.in);
		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요 : ");
			input = sc.nextInt();
			
			if(answer>input) {
				System.out.println("더 큰 수를 입력하세요.");
			} else if(answer==input) {
				System.out.println("맞췄습니다.");
				break;
			} else {
				System.out.println("더 작은 수를 입력하세요.");
			}
		} while(true);

		System.out.println("시도 횟수는 " + count + "입니다.");
	}

}
