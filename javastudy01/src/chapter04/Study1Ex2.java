package chapter04;

import java.util.Scanner;

public class Study1Ex2 {
	
	public static void main(String[] args) {

		int score = 0; 
		char grade = ' ', opt = ' '; 
		
		System.out.print("������ �Է� : ");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		if(score >=90) {
			grade = 'A';
			if(score >= 97) {
				opt = '+';
			} else if (score>=94) {
				opt = '-';
			} else {
				opt = '0';
			}
		} else if (score >= 80) {
			grade = 'B';
			if(score >= 87) {
				opt = '+';
			} else if (score>=84) {
				opt = '-';
			} else {
				opt = '0';
			}
		} else if (score >= 70) {
			grade = 'C';
			if(score >= 77) {
				opt = '+';
			} else if (score>=74) {
				opt = '-';
			} else {
				opt = '0';
			}
		} else {
			grade = 'D';
		}
		System.out.println("������ " + score + "�̰�, ������ " + grade + opt + "�Դϴ�.");
		
		
		/* ==
		
		int score = 0; 
		char grade = 'D', opt = '0'; 
		
		System.out.print("������ �Է� : ");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		if(score >=90) {
			grade = 'A';
			if(score >= 97) {
				opt = '+';
			} else if (score>=94) {
				opt = '-';
			} 
		} else if (score >= 80) {
			grade = 'B';
			if(score >= 87) {
				opt = '+';
			} else if (score>=84) {
				opt = '-';
			}
		} else if (score >= 70) {
			grade = 'C';
			if(score >= 77) {
				opt = '+';
			} else if (score>=74) {
				opt = '-';
			} 
		} 
		System.out.println("������ " + score + "�̰�, ������ " + grade + opt + "�Դϴ�.");
		
		*/
	}

}
