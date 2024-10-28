package programmers;

import java.util.ArrayList;
import java.util.List;

//import java.util.HashMap;
//import java.util.Map;

public class 할일목록 {
	
	public static void main(String[] args) {

		String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
		boolean[] finished = {true, false, true, false};
		
		/*
		 HashMap 데이터를 저장할 때 K, V가 짝을 이루어 저장
		 */
		
//		Map<String, Boolean> answerMap = new HashMap<String, Boolean>();
//		
//		for(int i = 0; i < todo_list.length; i++) {
//			answerMap.put(todo_list[i], finished[i]);
//		}
		
		/*
		 * 계속 오류가 나서 뭐가 문제인지 확인 내가 생각한 방법으로 접근한 사람 발견 => https://prod.velog.io/@digeuthi/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%ED%95%A0-%EC%9D%BC-%EB%AA%A9%EB%A1%9D
		 * Map은 배열이 아니기 때문에 인덱스 값을 이용해서 가져올 수 없음
		 * 다른 방법으로 접근해야함
		 */
		
		List<String> answer = new ArrayList<String>();
		for(int i = 0; i < todo_list.length; i++) {
			if(finished[i]==false) {
				answer.add(todo_list[i]);
			}
		}
		System.out.println(answer);
		
		 // 반환값이 String인데 이 경우 List로 바꿔야함. String[] answer = {}; 경우 배열 크기를 어떻게 해야할까?
//		 int size = 0;
//		 for(boolean b : finished) {
//			 if(!b) {
//				 size++;
//			 }
//		 }
//		String[] answer = new String[size];
		
		
	}

}
