package exercise.chapter03;

public class Ex02 {

	public static void main(String[] args) {
		
		int numOfApples = 147; //����� ����
		int sizeOfBucket = 10; //�ٱ����� ũ��(�ٱ��Ͽ� ���� �� �ִ� ����� ����)
		int numOfBucket = ((numOfApples%sizeOfBucket==0)?numOfApples/sizeOfBucket:numOfApples/sizeOfBucket+1); //��� ����� ��µ� �ʿ��� �ٱ����� ��
		
		//������
		int numOfBucketCor = numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket>0?1:0);
		
		System.out.println("�ʿ��� �ٱ����� �� : " + numOfBucket);
		System.out.println("�ʿ��� �ٱ����� �� : " + numOfBucketCor);
		
		//���� Ǯ�� : ����� ������ �ٱ����� ũ�⸦ ���� ���� 0�̸� ����� ������ �ٱ����� ũ���� ������� �̿��� �� �ڵ尡 �����...
		
	}

}
