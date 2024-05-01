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
	
	//equals()를 오버라이딩하면 hashCode()도 오버라이딩 해야함
	public int hashCode() {
		return Objects.hash(kind,number);
		//Objects 클래스는 객체와 관련된 유용한 메서드를 제공하는 유틸 클래스
		//int hash(Object... values){...} 매개변수가 가변인자(Obejct...)기 때문에 호출 시 지정하는 값의 개수가 정해져 있지 않음
	}
	
	//Object 클래스의 toString() 오버라이딩
	public String toString() {
		return "kind : " + kind + ", number : " + number;
	}
	
	//Object 클래스의 equals() 오버라이딩
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

//		public String toString() {	//Object클래스의 toString()
//		return getClass().getName()+ "@" +Integer.toHexString(hashCode());
			// 설계도객체. 클래스이름 + at(위치) +         16진수     객체주소
//		}
		
		CardS1E1 c1 = new CardS1E1();
		CardS1E1 c2 = new CardS1E1();
		
		System.out.println(c1.equals(c2));
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		
	}

}
