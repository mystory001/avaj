package programmers;

public class ���ڿ��ٲ㼭ã�� {
	
	public static void main(String[] args) {

		String myString = "ABAB"; 
		String pat ="ABAB";
		
		int answer = 0;
		//myString�� A�� B��, B�� A�� �ٲ� ���ڿ��� �����ϴ� �κ� ���ڿ� �� pat�� ������ 1 �ƴϸ� 0
		
		/*
		StringBuffer, StringBuilder ���ڿ��� �߰��ϰų� ������ �� �ַ� ����ϴ� �ڷ���
		StringBuffer => ��Ƽ ������ ȯ��(����ȭ), StringBuilder => StringBuffer���� ������ ���
		*/
		
		StringBuilder sb = new StringBuilder(myString);
		//A�� B��, B�� A�� ���� 
		for(int i =0; i <myString.length();i++) {
			if(myString.charAt(i)=='A') {
				sb.setCharAt(i, 'B');
			} else {
				sb.setCharAt(i, 'A');
			}
		}
		
//		if(sb.indexOf(pat)) { ������ �������� ������ -1�� ��ȯ
		if(sb.indexOf(pat)!=-1) {
			answer = 1;
		} else {
			answer = 0;
		}
		
		
		System.out.println(answer);
		
		
	}

}
