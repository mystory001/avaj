package programmers;

import java.util.ArrayList;

public class �迭�ǿ��Ҹ�ŭ�߰��ϱ� {

	public static void main(String[] args) {

		int[] arr = {5,1,4,1};
//		int[] answer = new int[100]; //���Ұ� 100������ ���� �� ���Ƿ� �迭 ���� ����
		//�迭�� ���̸� �� �� �� ArrayList
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		for(int i = 0; i<arr.length;i++) {
			for(int j = 0; j<arr[i];j++) {
				answer.add(arr[i]);
			}
		}
		
		System.out.println(answer);
		
//		StringBuffer result = new StringBuffer();
//		for (Integer a : arr) {
//			for (int z = 0; z < a; z++) {
//				result.append(a + "");
//			}
//		}		
//		System.out.println(result);
//		
		
	}
}
