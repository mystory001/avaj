package programmers;

import java.util.ArrayList;

public class ad�����ϱ� {
	
	public static void main(String[] args) {

		String[] strArr = {"and","notad","abcd"};
		ArrayList<String> answer = new ArrayList<String>();
		
		String ad = "ad";
		
		for(int i = 0; i < strArr.length; i++) {
			if(!strArr[i].contains(ad)) {
				answer.add(strArr[i]);
			}
		}
		
		//�ٸ� Ǯ��
//        int size = 0;
//        for(String s : strArr){
//            if(!s.contains("ad")){
//                size++;
//            }
//        }
//
//        int idx = 0;
//        String[] answer = new String[size];
//        for(String s : strArr){
//            if(!s.contains("ad")){
//                answer[idx++] = s;
//            }
//        }
		
	}

}
