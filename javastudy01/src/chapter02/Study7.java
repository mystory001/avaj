package chapter02;

import java.util.Date;

public class Study7 {

	public static void main(String[] args) {

		//값의 타입
		//값(data) : 문자(char), 숫자(정수(byte, short, int, long), 실수(float, double)), 논리(boolean) <- 기본형
		
		//변수의 타입 : 기본형(Primitive type), 참조형(Reference type)
		//기본형 : boolean, char, byte, short, int, long, float, double
		//		  실제 값을 저장 
		//참조형 : 기본형을 제외한 나머지(String, System 등)
		//		  메모리 주소를 저장(4 byte 또는 8 byte)
		Date today; //참조형 변수 today를 선억
		today = new Date(); //today에 객체의 주소를 저장
		//참조형 변수는 객체의 주소를 저장한 것
		
	}
}
