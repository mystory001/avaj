package chapter09;

import java.util.ArrayList;

public class Study10Ex2 {

	public static void main(String[] args) {

		//JDK1.5이전에는 기본형과 참조형 간의 연산이 불가능했음.
		//컴파일 전 코드
		int i = 5;
		Integer iObj = new Integer(8);
		int sum = i + iObj;
		//컴파일 후 코드
//		int i = 5;
//		Integer iObj = new Integer(8);
//		int sum = i + iObj.intValue(); //컴파일러가 래퍼클래스를 기본형으로 변환함		
		
		
		//기본형의 값을 객체로 자동변환하는 것을 오토박싱, 그 반대를 언박싱
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10); //오토박싱. 10 -> new Integer(10)
		//list.add(new Integer(10));
		int value = list.get(0); //언박싱. new Integer(10) -> 10
		
		Integer a = list.get(0); //list에 저장된 첫번째 객체를 꺼냄
//		int a1 = list.get(0).intValue(); //intValue()로 Integer를 int로 변환
	}
	
}
