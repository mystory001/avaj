package exercise.chapter03;

public class Ex07Re {

	public static void main(String[] args) {
		
		//ȭ��(F)���� ����(C) ��ȯ���� = 'C = 5/9 *(F-32)
		//��ȯ ������� �Ҽ��� ��°�ڸ����� �ݿø�, ��, Math.round()�� ������� �ʰ� ó��
		
		int fahrenheit = 100;
		float celcius = (int)(5/9f * (fahrenheit-32)*1000+0.5)/1000f;
		//(5/9f * (fahrenheit-32)); //37.77778
		//(5/9f * (fahrenheit-32)*1000); //37777.777
		//(int)(5/9f * (fahrenheit-32)*1000+0.5); //37778.0
		//(int)(5/9f * (fahrenheit-32)*1000+0.5)/1000f; //37.778
		System.out.println("Fahrenheit : "+fahrenheit);
		System.out.println("Celcius : " + celcius);

	}

}
