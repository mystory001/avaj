package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class �������α����ϱ�2 {
	
	public static void main(String[] args) {

		String my_string = "i   love  you";
		
		//���� Ǭ ��� => ���ϴ� ����� ������ ����
//		String a = my_string.replaceAll("\\s+", " ");
		// ���Խ� \s : \t, \n, \x0B, \f, \r ������ ��Ÿ��
		// +�� 1�� �̻��� �ǹ� ��, "\s+"�� 1�� �̻��� ������ �ǹ�
		
//		String[] x =  a.split(" "); //=> [i, love, you]
//		//���ϴ� ����� ["i", "love", "you"]
//		
//		
//		ArrayList<String> answer = new ArrayList<String>();
//		
//		for(int i = 0; i<x.length;i++) {
//			answer.add("\""+x[i]+"\"");
//		}
//		
//		System.out.println(answer);
//		
		//���� Ǭ �ٸ� ���
		String[] answer = my_string.trim().replaceAll("\\s+", " ").split(" ");
	    System.out.println(Arrays.toString(answer));
		
		//�̽������� ���� ��� �� �޼ҵ� ��� => �ʿ��� �޼ҵ� ã�µ� ���� �ð��� �ɸ�
	      
		
	}

}
