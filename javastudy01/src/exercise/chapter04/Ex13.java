package exercise.chapter04;

public class Ex13 {

	public static void main(String[] args) {
		
		//�־��� ���ڿ�(value)�� �������� �Ǻ��ϴ� ���α׷�
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		
		
		//�ݺ����� charAt(int i)�� �̿��ؼ� ���ڿ��� ���ڸ� �ϳ��� �о� �˻�
		for(int i = 0; i<value.length();i++) {
			ch = value.charAt(i);
			if(!('1'<=ch&&ch<='9')) {
				isNumber = false;
				break;
			}
		}
		
		if(isNumber) {
			System.out.println(value+"�� ����");
		} else {
			System.out.println(value+"�� ���ڰ� �ƴ�");
		}

	}

}
