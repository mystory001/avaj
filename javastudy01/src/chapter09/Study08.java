package chapter09;

public class Study08 {
	
	public static void main(String[] args) {

		//StringBuilder(��StringBuffer)
		//StringBuffer�� ����ȭ �Ǿ� ������, StringBuilder�� ����ȭ �Ǿ� ���� ����. ��Ƽ �����忡 ����(thread-safe)
		//�ؾ�����(�۾� ó��) - �̱� ������(�ѹ��� 1�� �۾�), ��Ƽ ������(�ѹ��� ���� �۾�)
		//��Ƽ ������ ���α׷��� �ƴ� ���, ����ȭ�� ���ʿ��� ���� ����, �̷� ��(�̱� ������ ���α׷�) StringBuilder�� ����ϸ� ���� ���
		StringBuffer sb = new StringBuffer();
		sb.append("abc");
		//== ��
		StringBuilder sb1 = new StringBuilder();
		sb1.append("abc");
		
		
		//Math Ŭ����
		//���� ���� static �޼����� ����
		//static double||flolat||int||long abs(double||flolat||int||long a) �־��� ���� ���밪�� ��ȯ
		int i = Math.abs(-10); //10
		double d = Math.abs(-10.3); //10.3
		
		//static double ceil(double a) �־��� ���� �ø��ϸ� ��ȯ. ������ �ø�
		double d1 = Math.ceil(10.1); //11
		double d2 = Math.ceil(-10.1); //-10.0
		double d3 = Math.ceil(10.0001); //11
		
		//static double floor(double a) �־��� ���� �����Ͽ� ��ȯ. ������ ����
		double d4 = Math.floor(10.9); //10
		double d5 = Math.floor(-10.9); //11
		
		//static double||flolat||int||long max(x, y) �־��� �� ���� ���Ͽ� ū ���� ��ȯ
		int i1 = Math.max(10, 9); //10
		
		//static double||flolat||int||long min(x, y) �־��� �� ���� ���Ͽ� ���� ���� ��ȯ
		float f = Math.min(3.14F, 3.141F); //3.14
		
		//static double random() 0.0~1.0 ������ ������ double���� ��ȯ(1.0�� ������ ���Ե��� ����)
		double random = Math.random();
		
		//static double rint(double a) �־��� double���� ���� ����� �������� double������ ��ȯ. ��, �� ������ �� ��� �ִ� ��(0.5 => 0.0, 1.5, 2.5 => 2.0 ��)�� ¦���� ��ȯ
		double d6 = Math.rint(1.2); //1.0
		double d7 = Math.rint(2.6); //3.0
		double d8 = Math.rint(3.5); //4.0
		double d9 = Math.rint(4.5); //4.0
		
		//static long round(double a || float a) �Ҽ��� ù°�ڸ��� �ݿø��� ������(long)�� ��ȯ. �� ������ ����� �ִ� ���� �׻� ū ������ ��ȯ
		long l = Math.round(1.2); //1
		long l2 = Math.round(2.6); //3
		long l3 = Math.round(3.5); //4
		double dd = 90.5678;
		double dd1 = Math.round(dd*100)/100.0; //90.57
	}

}
