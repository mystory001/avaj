package exercise.chapter05;

import java.util.Scanner;

public class Ex13 {
	
	public static void main(String[] args) {

		String[] words = {"tv","com","mouse","phone"};
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<words.length;i++) {
			char[] question = words[i].toCharArray(); //String�� char[]�� ��ȯ
			
			//char �迭 question�� ��� ������ ��ġ�� ���Ƿ� �ٲ�
			for(int j=0;j<question.length;j++) {
				int idx = (int)(Math.random()*question.length);
				
				char tmp = question[i];
				question[i] = question[idx];
				question[idx] = tmp;
			}
			
			
			System.out.printf("Q%d. %s�� ������ �Է��ϼ���,>",i+1,new String(question));
			String answer = sc.nextLine();
			
			//trim()���� answer�� �¿� ������ ������ ��, equals�� word[i]�� ��
			if(words[i].equals(answer.trim()))
				System.out.printf("�¾ҽ��ϴ�. %n%n");
			else
				System.out.println("Ʋ�Ƚ��ϴ�. %n%n");
					
		}
		
		
	}

}
