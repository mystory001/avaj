package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ���ڿ��߶������ϱ� {
	
	public static void main(String[] args) {

		String myString = "dxccxbbbxaaaa";
//		String[] answer = String.valueOf(myString).trim().split("x");
//		
//		Arrays.sort(answer); //[aaaa, bbb, cc, d]
//		
//		System.out.println(Arrays.toString(answer));
		
		//��� �׽�Ʈ�� ���� answer�� ["aaaa","bbb","cc","d"]?
		
		//Ǯ��
		ArrayList<String> answer = new ArrayList<String>();
		String tmp = "";
		for(int i = 0; i < myString.length(); i++) {
			if(myString.charAt(i)=='x' && !tmp.equals("")) {
				answer.add(tmp);
				tmp = "";
			} else if(myString.charAt(i)!='x') {
				tmp += ""+myString.charAt(i);
			}
		}
		if(!tmp.equals("")) {
			answer.add(tmp);
			tmp = "";
		}
		Collections.sort(answer);
		
		//�ٸ� Ǯ��
		String[] temp = myString.split("x");
		Arrays.sort(temp);
		ArrayList<String> list = new ArrayList<String>();
		for(int i = 0; i < temp.length; i++) {
			if(!temp[i].equals("")) {
				list.add(temp[i]);
			}
		}
		String[] answerStrings = new String[list.size()];
		for(int i = 0; i < answerStrings.length; i++) {
			answerStrings[i] = list.get(i);
		}
		
		
	}

}
