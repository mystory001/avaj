package programmers;

import java.util.Arrays;

public class ĥ�ǰ��� {
	
	public static void main(String[] args) {

		int[] array = {7,77,17};
		int answer = 0;
		
		//int[] array�� ���ڿ��� �����Ͽ� 7�� ������ ����
		//�迭�� ���ڿ��� �����Ϸ���?
		//���ڿ��� �迭��
		//String.split() : �Է¹��� ����ǥ���� �Ǵ� Ư�� ���ڸ� �������� ���ڿ��� ������ �迭�� �����Ͽ� ����
		//ex) String s = "1234";
		//String[] list = s.split("");
		//System.out.println(Arrays.toString(list)); //[1, 2, 3, 4]
		
		//�迭�� ���ڿ���
		//String.join() : �� ��� ���̿� ������ ���� ��ȣ�� ����Ͽ� ���ڿ� �迭�� ��� ��Ҹ� ����
		//ex)String[] list = ["a", "b", "c"];
		//String s = String.join("", list); //abc
		
		//���� ��� int �迭�� ���ڿ��� ���ľ��� => ���� https://priming.tistory.com/178
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < array.length; i++) {
			sb.append(array[i]);
		}
		System.out.println(sb.toString()); //77717
		
		for(int i = 0; i < sb.length(); i++) {
			if(sb.charAt(i)=='7') {
				answer++;
			}
		}
		System.out.println(answer);

		
		
	}

}
