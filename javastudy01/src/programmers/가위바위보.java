package programmers;

public class ���������� {
	
	public static void main(String[] args) {

		//���� 2 ���� 0 �� 5
		
		String rsp = "2";
		String answer = "";
		
		for(int i = 0; i<rsp.length();i++) {
			if(rsp.charAt(i)=='2') {
				answer += '0';
			} else if(rsp.charAt(i)=='0') {
				answer +='5';
			} else {
				answer += '2';
			}
		}
		
		System.out.println(answer);
		
		
	}

}
