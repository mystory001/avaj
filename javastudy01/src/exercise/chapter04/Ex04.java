package exercise.chapter04;

public class Ex04 {

	public static void main(String[] args) {
		
		//1+(-2)+3+(-4)+...�� ���� ������ ��� ���ذ��� ��, 
		//����� ���ؾ� ������ 100�̻� �Ǵ���?
		
		int sum = 0; //������ ������ ����
		int buho = 1; //���� ��ȣ�� �ٲ��ִµ� ����� ����
		int num = 0; //���ϰ����ϴ� ����(����� ���ؾ�?)
		
		for(int i = 1; sum<100;i++,buho=-buho) { //�� �ݺ����� buho�� 1,-1,1,-1 �ݺ�
			num = buho*i;
			sum += num;
		}
		
		System.out.println(num);

	}

}
