package exercise.chapter06;

//Ex1���� ������ SutdaCardŬ������ �� ���� �����ڿ� info()�� �߰�

class SutdaCard2{
	int num;
	boolean isKwang;
	
	public SutdaCard2() {
//		num = 1;
//		isKwang = true;
		this(1,true);
	}
	
	public SutdaCard2(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	String info() { //���ڸ� ���ڿ��� ��ȯ��. ���� ��� K�� ����
		return num + (isKwang?"K":"");
	}
	
	
}

public class Ex02 {

	public static void main(String[] args) {
		
		SutdaCard2 s1 = new SutdaCard2(3, false);
		SutdaCard2 s2 = new SutdaCard2();
		
		System.out.println(s1.info());
		System.out.println(s2.info());

	}

}
