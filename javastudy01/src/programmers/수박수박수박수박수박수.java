package programmers;

import java.util.HashMap;
import java.util.Map;

public class ���ڼ��ڼ��ڼ��ڼ��ڼ� {
	
	public static void main(String[] args) {

		int n = 5; //"���ڼ�" => Ȧ���϶��� ��, ¦���϶��� ��
		String answer = "";
		
		
//		for(int i = 0; i < n; i++) {
//			if(i%2==0&&n%2==0) {
//				answer.append("��");
//			} 
//		}
//		for(int i = 0; i < n; i++) {
//			if(i%2!=0&&n%2!=0) {
//				answer.append("��");
//			} 
//		}
		
		//Map �����ҵ�? => Map�� ��Ȯ�� ������ �� ��..
//		Map<Integer, String> map = new HashMap<Integer, String>();
//		
//		for(int i = 0; i < n ; i++) {
//			if(i%2==0 || i==0) {
//				map.put(i, "��");
//			} else {
//				map.put(i, "��");
//			}
//		}
//		
//		for(String i : map.values()) {
//			answer += map.values(); //[��, ��, ��, ��, ��][��, ��, ��, ��, ��][��, ��, ��, ��, ��][��, ��, ��, ��, ��][��, ��, ��, ��, ��]
//		}
		
		for(int i = 0; i < n; i++) {
			if(i%2==0) {
				answer+="��";
			} else {
				answer+="��";
			}
		}
		
		System.out.println(answer);
	}

}
