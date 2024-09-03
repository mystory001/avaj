package exercise.chapter06;

import java.util.Arrays;

public class Ex23 {

	static int max(int[] arr) {
		if(arr==null||arr.length==0) 
			return -999999;
		
		int max = arr[0]; //�迭�� ù ��°������ �ִ밪�� �ʱ�ȭ
		for(int i =1; i<arr.length;i++) { //i = 1 =>max�� �迭�� ù��° ������ �ʱ�ȭ�����Ƿ� 0�� �ε��� ���� ���� �ʿ� ����
			if(arr[i]>max) { //���ؼ� �ִ밪(0�� �ε���)���� ũ�� �� ���� ���� max�� ����
				max=arr[i];
			}
		}
		return max;
		
	}
	
	
	public static void main(String[] args) {
		
		int[] data = {3,2,9,4,7};
		System.out.println(Arrays.toString(data));
		System.out.println("�ִ밪 : " + max(data));
		System.out.println("�ִ밪 : " + max(null));
		System.out.println("�ִ밪 : " + max(new int[0]));
		System.out.println("�ִ밪 : " + max(new int[] {}));

	}

}
