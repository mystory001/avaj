package chapter03;

public class Study6 {
	
	public static void main(String[] args) {

		//�ݿø� Math.rount()
		//�Ǽ��� �Ҽ� ù°�ڸ����� �ݿø��� ������ ��ȯ
		long result1 = Math.round(3.14);
		System.out.println(result1);
		long result2 = Math.round(3.54);
		System.out.println(result2); //�ݿø� �� ���
		
		System.out.println();
		
		double pi = 3.141592;
		//double shortPi = Math.round(pi*1000)/1000.0;
		//System.out.println(shortPi);
		//������
		System.out.println(pi);
		System.out.println(pi*1000);
		System.out.println(Math.round(pi*1000));
		System.out.println(Math.round(pi*1000)/1000); //int/int => int
		System.out.println(Math.round(pi*1000)/1000.0); //int/double => double
		System.out.println((double)Math.round(pi*1000)/1000); 
		//10^n�� ���� �� 10^n.0���� ������ ���ϴ� �ڸ����� �ݿø�����
		
		//����� 3.141�� ��Ÿ������?
		System.out.println(pi*1000);
		System.out.println((int)(pi*1000)); //�� �ս��� ����
		System.out.println((int)(pi*1000)/1000.0);
		
		System.out.println();
		
		//������ ������ %
		//������ �ǿ����ڴ� 0�� �ƴ� ������ ���Ǹ�, ��ȣ�� ���õ�
		System.out.println(3%2);
		System.out.println(3%-2);
		System.out.println(-3%2);
		System.out.println(-3%-2);
		
	}
}
