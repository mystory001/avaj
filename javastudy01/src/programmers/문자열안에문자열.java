package programmers;

public class ���ڿ��ȿ����ڿ� {

	public static void main(String[] args) {
		
		String str1 = "asdf";
		String str2 = "cc";
		
		//contains() : ���� �ȿ� ���ڿ��� �����ϴ��� ��, �������� ��ȯ
		
		String answer = "0"; 
		
		if(str1.contains(str2)) {
			answer = "���ڿ��� ������";
		} else {
			answer = "���ڿ��� �������� ����";
		}
		
		System.out.println(answer);
		
		

	}

}
