package programmers;

public class �����ѱݾװ���ϱ� {
	
	public static void main(String[] args) {

		int price = 3; // ���̱ⱸ �̿��
		int money = 20; // ó���� ������ �ִ� �ݾ�
		int count = 4; // ���̱ⱸ�� �̿� Ƚ��
		long answer = -1; 
		
		//3 6 9 12 => 30�� ==> answer = �� ��� - money
		
		long totalMoney = 0;

		for (int i = price; i <= price * count; i += price) {
			totalMoney += i;
		}

		if (money > totalMoney) {
			answer = 0;
		} else {
			answer = totalMoney - money;
		}
		
		
	}

}
