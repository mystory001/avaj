package chapter04;

import java.util.Scanner;

public class Study7 {

	public static void main(String[] args) {

		//break��
		//�ڽ��� ���Ե� �ϳ��� �ݺ����� ���
		
		int sum = 0;
		int i = 0;
		
		while(true) { //���� �ݺ��� ==> for(;;){}
			if(sum > 100)
				break; //�ڽ��� ���� �ϳ��� �ݺ����� ���
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
		
		//contunue��
		//�ڽ��� ���Ե� �ݺ����� ������ �̵� -> ���� �ݺ����� �Ѿ
		//��ü �ݺ� �߿��� Ư�� ���� �� �ݺ��� �ǳʶ� �� ����
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
			System.out.println("1. �ڹ�");
			System.out.println("2. �ڹٽ�ũ��Ʈ");
			System.out.println("3. C++");
			System.out.print("����� �� �ִ� �� ����(1~3)�ϼ���.(����� 0) : ");
			
			String temp = scanner.nextLine();
			menu = Integer.parseInt(temp);
			
			
			if(menu == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else if(!(1<=menu && menu <= 3)) {
				System.out.println("���⸦ �߸� �����߽��ϴ�. (����� 0)");
				continue;
			}
			System.out.println("������ ���� " + menu);
		}
		
		System.out.println();
		
		//�̸����� �ݺ���
		//�ݺ����� �̸��� �ٿ��� �ϳ� �̻��� �ݺ����� ��� �� ����
		
		//for���� Loop1�̶�� �̸��� ����
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
