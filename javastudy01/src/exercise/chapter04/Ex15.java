package exercise.chapter04;

public class Ex15 {

	public static void main(String[] args) {

		//ȸ������ ���ϴ� ���α׷�
		
		int number = 12321;
		int tmp = number;
		
		int result = 0; //���� number�� �Ųٷ� ��ȯ�ؼ� ���� ����
		
		while(tmp!=0) {
			result=result*10 + tmp%10; //���� ����� 10�� ���ؼ� ����
			tmp /= 10;
		}
		if(number==result){
			System.out.println(number+"�� ȸ����");
		} else {
			System.out.println(number+"�� ȸ������ �ƴ�");
		}
		
	}

}
