package programmers;

import java.util.HashMap;
import java.util.Map;

public class 수박수박수박수박수박수 {
	
	public static void main(String[] args) {

		int n = 5; //"수박수" => 홀수일때는 수, 짝수일때는 박
		String answer = "";
		
		
//		for(int i = 0; i < n; i++) {
//			if(i%2==0&&n%2==0) {
//				answer.append("수");
//			} 
//		}
//		for(int i = 0; i < n; i++) {
//			if(i%2!=0&&n%2!=0) {
//				answer.append("박");
//			} 
//		}
		
		//Map 가능할듯? => Map의 정확한 사용법을 잘 모름..
//		Map<Integer, String> map = new HashMap<Integer, String>();
//		
//		for(int i = 0; i < n ; i++) {
//			if(i%2==0 || i==0) {
//				map.put(i, "수");
//			} else {
//				map.put(i, "박");
//			}
//		}
//		
//		for(String i : map.values()) {
//			answer += map.values(); //[수, 박, 수, 박, 수][수, 박, 수, 박, 수][수, 박, 수, 박, 수][수, 박, 수, 박, 수][수, 박, 수, 박, 수]
//		}
		
		for(int i = 0; i < n; i++) {
			if(i%2==0) {
				answer+="수";
			} else {
				answer+="박";
			}
		}
		
		System.out.println(answer);
	}

}
