package chapter14;

/**
 * *�Լ��� �������̽�
 * -�� �ϳ��� �߻� �޼ҵ常 ����� �������̽�
 * @FunctionalInterface
 * interface MyFunction{
 * 	public abstract int max(int a, int b);
 * }
 * MyFunction f = new MyFunction(){ //�͸�Ŭ����. Ŭ������ ����, ��ü ������ ���ÿ�
 * 					public int max(int a, int b){
 *                 		return a>b?a:b;
 *                  }
 *                };
 * int value = f.max(3,5); //MyFunction�� max()�� �����ϹǷ� ����
 * -�Լ��� �������̽� Ÿ���� ���������� ���ٽ��� ������ �� ����
 *  ��, �Լ��� �������̽��� �޼ҵ�� ���ٽ��� �Ű����� ������ ��ȯŸ���� ��ġ�ؾ���.
 *  MyFunction f = (a,b) -> a>b?a:b;
 *  int value = f.max(3,5); //������ ���ٽ�(�͸� �Լ�)�� ȣ���
 */

@FunctionalInterface //�Լ��� �������̽��� �� �ϳ��� �߻� �޼ҵ常 ��������
interface MyFunction2_1{
	public abstract int max(int a, int b);
}

public class Study2_1 {
	
	public static void main(String[] args) {

//		MyFunction14_2 f = new MyFunction14_2() {
//			@Override
//			public int max(int a, int b) { //�������̵� ��Ģ - ���������ڴ� ���� �� �� ����
//				return a>b?a:b;
//			}
//		};
		
		//���ٽ�(�͸�ü)�� �ٷ�� ���� ���������� Ÿ���� �Լ��� �������̽��� ��
		MyFunction2_1 f = (a,b) -> a>b? a:b; //���ٽ�. �͸� ��ü
		
		int value = f.max(3, 5);
		System.out.println("value = " + value);
		
	}

}
