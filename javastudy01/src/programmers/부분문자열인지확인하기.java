package programmers;

public class �κй��ڿ�����Ȯ���ϱ� {
	
	public static void main(String[] args) {

		String my_string = "banana";
		String target = "ana";
		int answer = 0;
		
		/*
		 * ���ڿ��� Ư�� ���� ���� ���� Ȯ��
		 * 1. contains() : �Ķ���ͷ� �Է¹��� ���ڿ��� �����ϰ� �ִ��� ���θ� ����. ��ҹ��� ����
		 * 2. indexOf() : �Ķ���ͷ� �Է¹��� ���ڳ� ���ڿ��� ���� ���ڿ����� ó�� ��Ÿ���� index�� ã�Ƽ� index ��ġ�� ����. ���� ���ڿ����� ã�� ���ڳ� ���ڿ��� ������ 0�� ����
		 * 3. matches() : ���Խ��� �̿��Ͽ�, ���ڿ��� ���Խİ� ��ġ�ϴ� �κ��� �ִ��� üũ�ϴ� �޼ҵ�
		 */
		
		if(my_string.contains(target)) {
			answer = 1;
		} else {
			answer = 0;
		}
		
		
	}

}
