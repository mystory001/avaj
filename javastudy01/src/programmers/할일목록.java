package programmers;

import java.util.ArrayList;
import java.util.List;

//import java.util.HashMap;
//import java.util.Map;

public class ���ϸ�� {
	
	public static void main(String[] args) {

		String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
		boolean[] finished = {true, false, true, false};
		
		/*
		 HashMap �����͸� ������ �� K, V�� ¦�� �̷�� ����
		 */
		
//		Map<String, Boolean> answerMap = new HashMap<String, Boolean>();
//		
//		for(int i = 0; i < todo_list.length; i++) {
//			answerMap.put(todo_list[i], finished[i]);
//		}
		
		/*
		 * ��� ������ ���� ���� �������� Ȯ�� ���� ������ ������� ������ ��� �߰� => https://prod.velog.io/@digeuthi/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%ED%95%A0-%EC%9D%BC-%EB%AA%A9%EB%A1%9D
		 * Map�� �迭�� �ƴϱ� ������ �ε��� ���� �̿��ؼ� ������ �� ����
		 * �ٸ� ������� �����ؾ���
		 */
		
		List<String> answer = new ArrayList<String>();
		for(int i = 0; i < todo_list.length; i++) {
			if(finished[i]==false) {
				answer.add(todo_list[i]);
			}
		}
		System.out.println(answer);
		
		 // ��ȯ���� String�ε� �� ��� List�� �ٲ����. String[] answer = {}; ��� �迭 ũ�⸦ ��� �ؾ��ұ�?
//		 int size = 0;
//		 for(boolean b : finished) {
//			 if(!b) {
//				 size++;
//			 }
//		 }
//		String[] answer = new String[size];
		
		
	}

}
