package exercise.chapter03;

public class Ex07 {

	public static void main(String[] args) {
		
		//ȭ��(F)���� ����(C) ��ȯ���� = 'C = 5/9 *(F-32)
		//��ȯ ������� �Ҽ��� ��°�ڸ����� �ݿø�, ��, Math.round()�� ������� �ʰ� ó��
		
		int fahrenheit = 100;
//		float celcius = (int)((5/9f*(fahrenheit-32))*1000)/1000f;
		
		//�ݿø��ϴ� ������� ����
		//�ذ��� : 0.5�� �����ָ� �ݿø� ��
		float celcius = (int)((5/9f*(fahrenheit-32))*1000+0.5)/1000f;
		
		System.out.println("Fahrenheit : "+fahrenheit);
		System.out.println("Celcius : " + celcius);

	}

}
