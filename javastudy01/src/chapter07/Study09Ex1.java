package chapter07;

class ParentS9E1{
	private int privateVariable; 	//���� Ŭ����
	int defaultVariable; 			//���� ��Ű��
	protected int protectedVariable;//���� ��Ű�� + �ڼ�(�ٸ� ��Ű��)
	public int publicVariable;		//���������� ����
	
	public void printMembers() {
		System.out.println(privateVariable);
		System.out.println(defaultVariable);
		System.out.println(protectedVariable);
		System.out.println(publicVariable);
	}

}

public class Study09Ex1 {
	
	public static void main(String[] args) {

		ParentS9E1 parentS9E1 = new ParentS9E1();
//		System.out.println(parentS9E1.privateVariable); //����. ���� ������ �ȸ���
		System.out.println(parentS9E1.defaultVariable);
		System.out.println(parentS9E1.protectedVariable);
		System.out.println(parentS9E1.publicVariable);
		
		
		
	}

}
