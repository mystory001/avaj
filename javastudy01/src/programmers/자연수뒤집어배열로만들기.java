package programmers;

public class �ڿ���������迭�θ���� {
	
	public static void main(String[] args) {

//		long n = 12345;
//		long n1 = n;
//		int size = 0;
//		
//		while(n1>0) {
//			n1 =n1/10;
//			size++;
//		}
//		
//		int[] answer = new int[size];
//
//		for(int i = 0; i< size; i++) {
//			answer[i] = (int)(n%10);
//			n = n/10;
//		}
//		
//		for(int a : answer) {
//			System.out.println(a + ",");
//		}
		
		//�׽�Ʈ1, �׽�Ʈ4 ���� ������ �����. �и� ������ ���� �ڵ带 �ۼ��Ѱ� �°�, �׽�Ʈ���̽��� �߰��غ��� ������ ���µ�?
		//�� ������ ���ؼ� �ٸ� Ǯ�̸� Ȯ���غ��Ҵ�. 
		long n = 12345;
		//n�� String���� ��ȯ�ϰ� �� ������ ���� �迭�� ��ȯ
		String str = Long.toString(n); //�� �κп��� ���� �ڵ�� ������
		System.out.println(str);
		
		int[] answer = new int[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			answer[i] = str.charAt(str.length()-1 -i) - '0';
		}
		
		for(int a : answer) {
			System.out.println(a + ",");
		}
		
		//�� ������ long���� ������ ��� ó���Ұ����� ���ؼ� ����� ����
		//���� ó�� ����� ���. ���� �ۼ��� ����� �� �κ��� �����־� �ذ��� ���� �ʾ���
		
	}

}
