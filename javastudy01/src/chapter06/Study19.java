package chapter06;

public class Study19 {

	public static void main(String[] args) {
		
		//변수의 초기화
		//지역변수(lv)는 사용 전 수동 초기화 해야함
		//멤버변수(iv, cv)는 자동 초기화 됨
		//ex) class Test{
		//		int x; //인스턴스 변수
		//		int y = x; //인스턴스 변수
		// void method(){
		//		int i; //지역 변수
		//		int j = i; //지역변수를 초기화하지 않고 사용. 에러
		//	}
		//}
		
		//멤버변수(iv, cv)의 초기화
		//1. 명시적 초기화(=) 선언 시 대입연사자를 이용
		//class Car{
		// int door = 4; //기본형 변수의 초기화
		// Engine e = new Engine(); //참조형 변수의 초기화
		//}
		//※참조형 변수를 초기화 하는 방법은 null(기본값) 또는 객체 주소
		//2. 초기화 블럭(복잡한 초기화)
		//인스턴스 초기화 블럭 : { } 여러 문장 넣기
		//클래스 초기화 블럭 : static { }
		//3. 생성자(iv 초기화, 복잡한 초기화)
		//Car(String color, String type, int door){ //매개변수가 있는 생성자
		// this.color = color; this.type = type; this.door = door;}
		
		//정리
		//멤버변수의 초기화 - static{}
		//1. 명시적 초기화(=)
		//2. 초기화 블럭 -> {}, static{}
		//3. 생성자(iv 초기화)
		//static{} ex)
		//class StaticBlockTest{
		// static int[] arr = new int[10]; //명시적 초기화
		// static{ //클래스 초기화 블럭 - 배열 arr을 난수로 채움
		//		for(int i = 0; i < arr.length; i++){
		//			arr[i] = (int)(Math.random()*10)+1;
		//		}
		//	}
		
		//클래스 변수 초기화 시점 : 클래스가 처음(메모리에 올라갈때) 로딩될 때 딱 한 번
		//인스턴스 변수 초기화 시점 : 인스턴스가 생성될 때 마다
		
		//초기화 순서
		//cv - > iv
		//자동 -> 간단 -> 복잡
		
	}

}
