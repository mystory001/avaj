package programmers;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class �ߺ��ȹ������� {
	
	public static void main(String[] args) {

		String my_string = "people";
		String answer = "";
		
		//�ߺ��� ���ڸ� ã�� �ű⼭ �����ϴ� ������ �Ϸ��� ������ �ڵ尡 �����ϰ�, �Ʒ��� for�� �ڵ带 �ۼ����� ���ϰ���
//		String dup = ""; //�ߺ��� ����
//		
//		for(int i = 0; i < my_string.length(); i++) {
//			for(int j = i+1; j < my_string.length(); j++) {
//				if(my_string.charAt(i)==my_string.charAt(j)) {
//					dup+=my_string.charAt(i);
//				}
//			}
//		}
//		System.out.println(dup);
		
		for(int i = 0; i < my_string.length(); i++) {
			if(!answer.contains(String.valueOf(my_string.charAt(i)))) {
				answer+=my_string.charAt(i);
			}
		}
		System.out.println(answer);

		
		//�ٸ� Ǯ��
		String[] answerString = my_string.split("");
		Set<String> set = new LinkedHashSet<String>(Arrays.asList(answerString));
		String.join("", set);
		
	}

}
