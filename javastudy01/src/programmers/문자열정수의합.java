package programmers;

public class ���ڿ��������� {
	
	public static void main(String[] args) {

		String num_str = "123456789";
		int answer = 0;
		
		//0 => 48 / 1 => 49 / ... / 9 => 57
		
		for(int i = 0; i<num_str.length();i++) {
			if('0'<=num_str.charAt(i)&&num_str.charAt(i)<='9') {
				answer += num_str.charAt(i)-48;
			}
		}
		//���� if���� �ʿ䰡 ����
		
		
		for(int i = 0; i<num_str.length();i++) {
				answer += num_str.charAt(i)-48;
		}
		
		
		System.out.println(answer);
		
		
		
	}
	
}
