package chapter05;

import java.util.Arrays;

public class Study4 {

	public static void main(String[] args) {

		//�迭�� Ȱ��

		//���հ� ��� : �迭�� ��� ��Ҹ� ���� ���հ� ����� ����
		int sum = 0;
		float avg = 0F;
		
		int[] score = {100, 79, 88, 75, 70};
		
		for(int i = 0; i < score.length ; i++) {
			sum += score[i]; //�ݺ����� �̿��ؼ� �迭�� ����Ǿ� �ִ� ������ ��� ����
		}
		
		avg = (float)sum/score.length; //��� ����� floatŸ������ �������� ����ȯ(�и�, ���� �� �� ���� ����ȯ ���ָ��)
		System.out.println("���� = " + sum);
		System.out.println("��� = " + avg);
		
		System.out.println();
		
		//�ּڰ��� �ִ�
		int[] score1 = {58,30,45,66,79,80,91,44};
		int max = score1[0]; //�迭�� ù��° ������ �ִ��� �ʱ�ȭ
		int min = score1[0]; //�迭�� ù��° ������ �ּڰ��� �ʱ�ȭ

		for(int i = 1; i < score1.length;i++) { //�迭�� �� ��° ��Һ��� �б� ���ؼ� ���� i�� ���� 1�� �ʱ�ȭ
			if(score1[i]>max) {
				max = score1[i];
			} else if(score1[i]<min) {
				min = score1[i];
			}
		}
		System.out.println("�ִ� " + max);
		System.out.println("�ּڰ� " + min);
		
		System.out.println();
		
		//���� : �迭�� ����� ������ �ݺ��ؼ� �ٲ�(���� ����)
		int[] numArr = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr));
		
		System.out.println();
		for(int i = 0; i < numArr.length; i++) {
			int n = (int)(Math.random() * 10); //0~9 �� �� ���� ���Ƿ� ����
			int temp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = temp;
			System.out.print(numArr[i] + ", ");
		}
		System.out.println();
		System.out.println(Arrays.toString(numArr));
		
	}
}
