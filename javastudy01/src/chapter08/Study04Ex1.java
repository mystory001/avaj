package chapter08;

public class Study04Ex1 {

	public static void main(String[] args) {

		try {
			Exception exception = new Exception("���� �߻�");
			throw exception; //���ܸ� �߻�
			//throw new Exception("���� �߻�"); //���� �ڵ带 �� �ٷ� �ۼ�
		} catch (Exception e) {
			System.out.println("���� �޽��� : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("���α׷� ���� ����");
	}
	
}
