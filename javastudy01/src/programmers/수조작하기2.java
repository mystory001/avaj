package programmers;

public class �������ϱ�2 {

	public static void main(String[] args) {
		
		int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
		String answer = "";
		//wsdawsdassw
		//"w" : ���� 1�� ���Ѵ�.
		//"s" : ���� 1�� ����.
		//"d" : ���� 10�� ���Ѵ�.
		//"a" : ���� 10�� ����.
		
		//i = 1 ���� �� i�� i-1�� ���ؼ� �󸶸�ŭ �����Ǿ��°��� �� �ؾ��� ��
		
		for(int i = 1; i < numLog.length; i++) {
			if(numLog[i]==numLog[i-1]+1) {
				answer+="w";
			} else if(numLog[i]==numLog[i-1]-1) {
				answer+="s";
			} else if(numLog[i]==numLog[i-1]+10) {
				answer+="d";
			} else if(numLog[i]==numLog[i-1]-10){
				answer+="a";
			}
		}
		
		System.out.println(answer);
		
		//�� �ٸ� �亯
		for(int i = 1; i < numLog.length; i++) {
			switch(numLog[i]-numLog[i-1]) {
				case 1 : 
					answer +="w";
					break;
				case -1 :
					answer+="s";
					break;
				case 10 : 
					answer+="d";
					break;
				case -10 :
					answer+="a";
					break;
				default :
					break;
			}
		}
		System.out.println(answer);
		
	}

}
