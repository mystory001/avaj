package chapter05;

import java.util.Arrays;

public class Study5 {

	public static void main(String[] args) {

		//String �迭�� ����� ����
		String[] name = {"�����","������","���ż�"}; //3���� ���ڿ��� �迭�� �����ϰ� ���� �Ҵ�
		
		System.out.println(Arrays.toString(name));
		
		String[] strings = {"����", "����", "��"};
		for(int i = 0; i < 5;i++) {
			int temp = (int)(Math.random()*3);
			System.out.println(strings[temp]);
		}
		
		
	}
}
