package exercise.chapter03;

public class Ex09 {

	public static void main(String[] args) {
		
		//������ ���� ch�� ������(�빮�� �Ǵ� �ҹ���)�̰ų� 
		//����(0~9)�� ���� ���� b�� ���� true�� �ǵ��� �ϴ� �ڵ�
		char ch = 'z';//122
		boolean b =('a'<=ch&&ch<='z')||('A'<=ch&&ch<='Z')||('0'<=ch&&ch<='9');
//		boolean b =('a'<=ch&&ch<='Z')||('0'<=ch&&ch<='9'); 
		//���� �ڵ尡 �߸��� ����
		//�ƽ�Ű�ڵ� A~Z : 65~90, a~z: 97~122 ������ 
		System.out.println(b);
	}

}
