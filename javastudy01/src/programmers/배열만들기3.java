package programmers;

import java.util.ArrayList;

public class �迭�����3 { //������ Ǯ����� ������ ������ ���� ����
	
	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		int[][] intervals = {{1,3},{0,4}}; //�ε���{{a1,a2}{b1,b2}} => a1�ε������� a2�ε����� �����ϸ� ���� ���ڸ�
		
//		int[] answer = {}; //�迭�� ���̸� ���ϴ� ���� ���� ū ������ �� ��?, ���� ���̸� ������ �������� => ArrayList�� ���
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i = 0; i < intervals.length; i++) {
			for(int j = intervals[i][0]; j <= intervals[i][1]; j++) {
				al.add(arr[j]);
			}
		}
		
		int[] answer = new int[al.size()];
		for(int i = 0; i < answer.length; i++) {
			answer[i] = al.get(i);
		}
		for(int a : answer) {
			System.out.println(a);
		}
	}

}
