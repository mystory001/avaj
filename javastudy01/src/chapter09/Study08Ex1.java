package chapter09;

public class Study08Ex1 {
	
	public static void main(String[] args) {

		for(double d = 0.0;d <= 2.0;d+=0.1) {
			double d1 = Math.round(d);
			double d2 = Math.rint(d);
			//round�� ���ϱ�/���� �� �μ��� �������� �������� Ŀ��
			//rint�� round���� �� ��Ȯ
			
			System.out.printf("%4.1f %4.1f %4.1f%n",d,d1,d2);
		}
		
	}

}
