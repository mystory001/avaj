package programmers;

public class ���ڿ��ٷ��⺻ {
	
	public static void main(String[] args) {

		String s = "a234";
		boolean answer = true;

//		int length = 0;
//		for(int i = 0; i < s.length(); i++) {
//			if('0'<=s.charAt(i) && s.charAt(i)<='9') {
//				length++;
//			} else {
//				length = 0;
//			}
//		}
//		answer = length == s.length();
//		

		// ���� �ۼ��� �ڵ�� ������ ���� ��Ȯ���� ���������� ��� �׽�Ʈ���� ������ => ���� ������ s�� ���̰� 4 Ȥ�� 6
		
//		if(s.length()==4 || s.length()==6) {
//			for(int i = 0; i < s.length(); i++) {
//				if('0'<=s.charAt(i) && s.charAt(i)<='9') {
//					answer = true;
//				} else {
//					answer = false;
//				}
//			}
//		} else {
//			answer = false;
//		}
		// �� ���� ����
//		System.out.println((int)'0');
//		System.out.println((int)'9');
//		
		// ���� �ۼ��� �ڵ尡 ���� �������� ���� �˻��غôµ�, �ٸ� ����� �־���
		int x;
		try {
			x = Integer.parseInt(s);
			System.out.println(x);
			System.out.println("String s�� ���ڿ��� ���ڷθ� �����Ǿ��ֽ��ϴ�.");
			answer = true;
		} catch (Exception e) {
			answer = false;
		}
		// �� ���� ����� �ȵ�. ã�ٺ��� ���� ǥ�������ε� ������
//		if(s.matches("?\\d+")) {
//			x = Integer.parseInt(s);
//			answer = true;
//		} else {
//			answer = false;
//		}
		
		System.out.println(answer);
		
		// ���� ó���Ѱ��� ������ �ڵ�
		int length = s.length();
		if ((length == 4) || (length == 6)) {
			for (int i = 0; i < length; i++) {
				if (!(Character.isDigit(s.charAt(i)))) {
					answer = false;
				}
			}
		} else {
			answer = false;
		}
		
		// ������ ����� ���� ������ �̻���. ������ ������ ����.
		
	}

}
