package programmers;

public class �ڵ�����ȣ������ {
	
	public static void main(String[] args) {
		
		
		//��ȭ��ȣ�� ���ڸ� 4�ڸ��� ������ ������ ���ڸ� *���� ������
		String phone_number = "01033334444";
		String answer = "";
		
		for(int i = phone_number.length()-5; i>=0; i--) {
			answer+="*";
		}
		for(int i = phone_number.length()-4; i < phone_number.length(); i++) {
			answer+=phone_number.charAt(i);
		}
		
		System.out.println(answer);
		
		//�ٸ� Ǯ��
		char[] ch = phone_number.toCharArray();
		for(int i = 0; i < ch.length - 4; i++) {
			ch[i] = '*';
		}
		
		//�ٸ� Ǯ��
		phone_number.replaceAll(".(?=.{4})", "*");
		
		
	}

}
