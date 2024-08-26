package programmers;

//다시 풀어봐야함


import java.util.ArrayList;
import java.util.List;

public class 배열의원소삭제하기 {
	
	public static void main(String[] args) {

		int[] arr = {293, 1000, 395, 678, 94};
		int[] delete_list = {94, 777, 104, 1000, 1, 12};
		
		List<Integer> answer = new ArrayList<Integer>();
		
		//arr의 요소를 answer에 대입
		for(int i = 0; i < arr.length; i++) {
			answer.add(arr[i]);
		}
		
		//arr의 요소와 delete_list의 요소를 비교 => 같으면 answer의 요소에서 제거
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < delete_list.length; j++) {
				if(arr[i]==delete_list[j]) {
					answer.remove(Integer.valueOf(arr[i])); //객체변환 필수
				}
			}
		}
		
		System.out.println(answer);
		
		
	}

}
