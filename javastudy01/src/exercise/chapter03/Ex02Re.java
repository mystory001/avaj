package exercise.chapter03;

public class Ex02Re {

	public static void main(String[] args) {
		
		int numOfApples = 147; //����� ����
		int sizeOfBucket = 10; //�ٱ����� ũ��(�ٱ��Ͽ� ���� �� �ִ� ����� ����)
		int numOfBucket = numOfApples/sizeOfBucket + (numOfApples/sizeOfBucket>0?1:0);
		System.out.println("�ʿ��� �ٱ����� �� : " + numOfBucket);

	}

}
