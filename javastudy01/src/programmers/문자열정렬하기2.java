package programmers;

import java.util.Arrays;

public class ���ڿ������ϱ�2 {
	
	public static void main(String[] args) {

		String my_string = "Bcad";
		String answer = "";

		//���ڿ��� ���ڹ迭�� => char[] ������ = ���ڿ�.toCharArray();
		char[] charArr = my_string.toLowerCase().toCharArray();
		Arrays.sort(charArr);
		
		//���ڹ迭�� ���ڿ��� ��ȯ
		//1. String ������ �̿� : new String(���ڹ迭)
		//2. String.valueOf() : String.valueOf(���ڹ迭)
		//3. String.copyValueOf() : String.copyValueOf(���ڹ迭)
		answer = new String(charArr);
		
		System.out.println(answer);
		
	}

}
