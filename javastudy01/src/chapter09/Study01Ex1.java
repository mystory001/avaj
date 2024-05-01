package chapter09;

import java.util.Objects;

class CardS1E1{
	String kind;
	int number;
	
	CardS1E1(){
		this("SPADE", 1);
	}
	
	CardS1E1(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	//equals()�� �������̵��ϸ� hashCode()�� �������̵� �ؾ���
	public int hashCode() {
		return Objects.hash(kind,number);
		//Objects Ŭ������ ��ü�� ���õ� ������ �޼��带 �����ϴ� ��ƿ Ŭ����
		//int hash(Object... values){...} �Ű������� ��������(Obejct...)�� ������ ȣ�� �� �����ϴ� ���� ������ ������ ���� ����
	}
	
	//Object Ŭ������ toString() �������̵�
	public String toString() {
		return "kind : " + kind + ", number : " + number;
	}
	
	//Object Ŭ������ equals() �������̵�
	public boolean equals(Object obj) {
		if(!(obj instanceof CardS1E1)) { 
			return false;
		}
			CardS1E1 c = (CardS1E1)obj;
			return this.kind.equals(c.kind) && this.number == c.number;
	}
}


public class Study01Ex1 {
	
	public static void main(String[] args) {

//		public String toString() {	//ObjectŬ������ toString()
//		return getClass().getName()+ "@" +Integer.toHexString(hashCode());
			// ���赵��ü. Ŭ�����̸� + at(��ġ) +         16����     ��ü�ּ�
//		}
		
		CardS1E1 c1 = new CardS1E1();
		CardS1E1 c2 = new CardS1E1();
		
		System.out.println(c1.equals(c2));
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		
	}

}
