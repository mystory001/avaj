package programmers;

import java.util.ArrayList;

public class �������ڴ½Ⱦ� {
	
	public static void main(String[] args) {

		int[] arr = {4,4,4,3,3};
//		ArrayList<Integer> answer = new ArrayList<Integer>();
//		answer.add(arr[0]);
//		
//		for(int i = 1; i < arr.length; i++) {
//			if(arr[i]!=arr[i-1]) {
//				answer.add(arr[i]);
//			}
//		}
//		System.out.println(answer);
//		
		//�� ������ ��� ArrayList�� ��ȯ�� => ����
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(arr[0]);
		for(int i = 1; i <arr.length; i++) {
			if(arr[i]!=arr[i-1]) {
				al.add(arr[i]);
			}
		}
		
		int[] answer = new int[al.size()];
		for(int i = 0; i < al.size(); i++) {
			answer[i] = al.get(i);
		}
	
		
		
	}

}
