package chapter09;

public class Study02 {
	
	public static void main(String[] args) {

		//Object Ŭ����
		//��� Ŭ������ �ְ� ����. ���� 11���� �޼��常�� ������ ����
		//protected Object clone() : ��ü �ڽ��� ���纻�� ��ȯ
		//public boolean equals(Object obj) : ��ü �ڽŰ� ��ü obj�� ���� ��ü���� Ȯ��. ���ٸ� true
		//protected void finalize() : ��ü�� �Ҹ�� �� ������ �÷��Ϳ� ���� �ڵ������� ȣ��. �� �� ����Ǿ���ϴ� �ڵ尡 ���� �� �������̵���(���� ��� ��)
		//public Class getClass() : ��ü �ڽ��� Ŭ���� ������ ��� �ִ� Class �ν��Ͻ��� ��ȯ. ���赵 ��ü => ��ü ����, ��ü ����
		//public int hashCode() : ��ü �ڽ��� �ؽ��ڵ带 ��ȯ
		//public String toString() : ��ü �ڽ��� ������ ���ڿ��� ��ȯ
		//public void notify() : ��ü �ڽ��� ����Ϸ��� ��ٸ��� �����带 �ϳ��� ����
		//public void notifyAll() : ��ü �ڽ��� ����Ϸ��� ��ٸ��� ��� �����带 ����
		//public void wait(), public void wait(long timeout), public void wait(long timeout, int nanos) : �ٸ� �����尡 notify()�� notifyAll()�� ȣ���� �� ���� ���� �����带 ������ �Ǵ� ������ �ð����� ��ٸ��� ��. 
		//��protected => �������̵� public���� �����ؾ���
		
		//equals() (Study02Ex1)
		//��ü �ڽ�(this)�� �־��� ��ü(obj)�� �� ������ true, �ٸ��� false
		//ObjectŬ������ equals()�� ��ü�� �ּҸ� ��(���������� ��)
		//public boolean equals(Object obj){
		// return (this==obj); //�ּҰ� ���ƾ� true
		//}
		
		//equals(Object obj)�� �������̵� (Study02Ex2)
		//�ν��Ͻ� ����(iv)�� ���� ���ϵ��� equals()�� �������̵��ؾ���
		
		
	}

}
