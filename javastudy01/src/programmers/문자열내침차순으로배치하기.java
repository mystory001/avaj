package programmers;

import java.util.Arrays;

public class ���ڿ���ħ�������ι�ġ�ϱ� {
	
	public static void main(String[] args) {

		String s = "Zbcdefg";
		String answer = "";
		//�빮�ڴ� �ҹ��ں��� ���� ������ ����
		String[] sArr = s.split("");
		Arrays.sort(sArr); // [Z, b, c, d, e, f, g]

		for(int i = sArr.length - 1; i>=0; i--) {
			answer += sArr[i];
		}
		
		System.out.println(answer);
	}

}
