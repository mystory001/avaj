package chapter09;

class Value{
	int value;
	
	public Value() {}
	
	public Value(int value) {
		this.value = value;
	}

	//Object�� equals()�� �������̵��ؼ� �ּҰ� �ƴ� value�� ��
	public boolean equals(Object obj) {
    	//return this == obj; //�ּ� ��. ���� �ٸ� ��ü�� �׻� ����
        //���������� ����ȯ ������ �ݵ�� instanceof�� Ȯ��
		if(obj instanceof Value)
			return false;
		Value v = (Value)obj; //obj�� value�� �� ��ȯ
		return this.value == v.value;
		
	}
	
}

public class Study02Ex1 {

	public static void main(String[] args) {

		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		//���� �ٸ� �� ��ü�� �׻� �ּҰ� �ٸ�
		System.out.println(v1.equals(v2));
		
	}
	
}