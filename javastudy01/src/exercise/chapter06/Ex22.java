package exercise.chapter06;

public class Ex22 {

	public static boolean isNumber(String str) { //�־��� ���ڿ��� ��� ���ڷθ� �̷�����ִ��� Ȯ��
		if(str==null||str.equals("")) { //��ȿ�� �˻�
			return false;
		}
		
		for(int i = 0; i<str.length();i++) {
			if(!('0'<=str.charAt(i)&&str.charAt(i)<='9'))
				return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		
		String str = "123";
		System.out.println(str+"�� �����ϱ�?" + isNumber(str));
		
		str = "1234o";
		System.out.println(str+"�� �����ϱ�?" + isNumber(str));

	}

}
