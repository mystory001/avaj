package chapter04;

import java.util.Scanner;

public class Study1Ex1 {
	
	public static void main(String[] args) {

		int score = 0; //������ �����ϱ� ���� ����
		char grade = ' '; //������ �����ϱ� ���� ����. �������� �ʱ�ȭ
		
		System.out.print("������ �Է� : ");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		if(score >=90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		
		System.out.println("������ " + grade + "�Դϴ�.");
		
		
		/* ==
		
		int score = 0; 
		char grade = 'D'; //������ D�� �ʱ�ȭ
		
		System.out.print("������ �Է� : ");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		if(score >=90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} 
				
		System.out.println("������ " + grade + "�Դϴ�.");
	
		else�� ������ �� ����
		
		*/
	}

}
