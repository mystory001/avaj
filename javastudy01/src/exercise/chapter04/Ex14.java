package exercise.chapter04;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		//���ڸ��߱� ���� 1~100������ ���� �ݺ������� �Է��ؼ� ��ǻ�Ͱ� ������ ���� ���߸� ������ ����
		//����ڰ� ���� �Է��ϸ�, ��ǻ�ʹ� �ڽ��� ������ ���� ���ؼ� ����� �˷���
		//����ڰ� ��ǻ�Ͱ� ������ ���ڸ� ���߸� ���α׷��� ������ �� �� ���� ���ڸ� ������� �˷���
		
		int answer = (int)(Math.random()*100)+1;
		int input = 0; //����� �Է��� ������ ����
		int count = 0; //�õ�Ƚ���� �������� ����
		
		Scanner sc = new Scanner(System.in);
		do {
			count++;
			System.out.print("1�� 100������ ���� �Է��ϼ��� : ");
			input = sc.nextInt();
			
			if(answer>input) {
				System.out.println("�� ū ���� �Է��ϼ���.");
			} else if(answer==input) {
				System.out.println("������ϴ�.");
				break;
			} else {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			}
		} while(true);

		System.out.println("�õ� Ƚ���� " + count + "�Դϴ�.");
	}

}
