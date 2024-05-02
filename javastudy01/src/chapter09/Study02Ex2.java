package chapter09;

class Person{
	long id;
	
	public boolean equals(Object obj) {
		if (!(obj instanceof Person))
			return false; 
		
		return id == ((Person)obj).id;//obj가 Object 타입이므로 id값을 참조하기 위해서는 Person 타입으로 형변환이 필요
//		else
//			return false; //타입이 Person이 아니면 값을 비교할 필요 없음
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
			System.out.println("p1과 p2는 같은 사람");
		} else {
			System.out.println("p1과 p2는 다른 사람");
		}
		
	}
	
}
