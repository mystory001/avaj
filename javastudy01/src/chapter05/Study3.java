package chapter05;

import java.util.Arrays;

public class Study3 {
	
	public static void main(String[] args) {
		
		//�迭�� ���
		int[] iArr = {100,90,80,70,60,50};
		System.out.println(iArr);//�迭�� ����Ű�� ���� ���� iArr���� ���. �ּҰ� ���
		//��, char �迭�� ���� �ּҰ� ��Ÿ���� ����
		char[] chArr = {'a','b','c','d'};
		System.out.println(chArr);
		
		System.out.println();
		
		//�迭 ��Ҹ� ������� �ϳ��� ���
		for(int i = 0; i<iArr.length;i++) {
			System.out.println(iArr[i]);
		}
		
		System.out.println();
		
		//�迭 iArr�� ��� ��Ҹ� ���
		System.out.println(Arrays.toString(iArr));

		System.out.println();
		
		//���� for��
		for(int a : iArr) {
			System.out.println(a);
		}
		
	}
}
