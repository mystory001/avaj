package programmers;

//�ٽ� Ǯ�������


import java.util.ArrayList;
import java.util.List;

public class �迭�ǿ��һ����ϱ� {
	
	public static void main(String[] args) {

		int[] arr = {293, 1000, 395, 678, 94};
		int[] delete_list = {94, 777, 104, 1000, 1, 12};
		
		List<Integer> answer = new ArrayList<Integer>();
		
		//arr�� ��Ҹ� answer�� ����
		for(int i = 0; i < arr.length; i++) {
			answer.add(arr[i]);
		}
		
		//arr�� ��ҿ� delete_list�� ��Ҹ� �� => ������ answer�� ��ҿ��� ����
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < delete_list.length; j++) {
				if(arr[i]==delete_list[j]) {
					answer.remove(Integer.valueOf(arr[i])); //��ü��ȯ �ʼ�
				}
			}
		}
		
		System.out.println(answer);
		
		
	}

}
