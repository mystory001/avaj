package programmers;

public class ���ڿ������� {
	
	public static void main(String[] args) {

		//���ڿ��� �Ųٷ� ������
		String string = "abc";
		String answer = "";
		
		for(int i = string.length()-1; i>=0;i--) {
			answer += string.charAt(i);
		}
		
		System.out.println(answer);
		
		//�ٸ� Ǯ��
		StringBuilder sb = new StringBuilder();
		sb.append(string);
		sb.reverse();
		
		}

}
