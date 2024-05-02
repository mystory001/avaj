package chapter09;

class Person{
	long id;
	
	public boolean equals(Object obj) {
		if (!(obj instanceof Person))
			return false; 
		
		return id == ((Person)obj).id;//obj�� Object Ÿ���̹Ƿ� id���� �����ϱ� ���ؼ��� Person Ÿ������ ����ȯ�� �ʿ�
//		else
//			return false; //Ÿ���� Person�� �ƴϸ� ���� ���� �ʿ� ����
	}
	
	Person(long id){
		this.id = id;
	}
	
}


public class Study02Ex2 {

	public static void main(String[] args) {
		
		Person p1 = new Person(0001013000000L);
		Person p2 = new Person(0001013000000L);
		
		if(p1.equals(p2)) {
			System.out.println("p1�� p2�� ���� ���");
		} else {
			System.out.println("p1�� p2�� �ٸ� ���");
		}
		
	}
	
}
