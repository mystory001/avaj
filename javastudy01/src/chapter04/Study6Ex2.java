package chapter04;

import java.util.Scanner;

public class Study6Ex2 {

	public static void main(String[] args) {

		//do while��
		int input = 0, answer = 0;
		
		answer = (int)(Math.random()*100)*1; //1~100������ ������ ���� ����
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("1�� 100 ������ ������ �Է� : ");
			input = scanner.nextInt();
			
			if(input > answer) {
				System.out.println("�� ���� ���� �õ��غ�����");
			} else if(input < answer) {
				System.out.println("�� ū ���� �ٽ� �õ��غ�����");
			} 
		} while (input!=answer);
		System.out.println("����");
		
	}
}
