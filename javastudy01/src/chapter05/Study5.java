package chapter05;

import java.util.Arrays;

public class Study5 {

	public static void main(String[] args) {

		//String 배열의 선언과 생성
		String[] name = {"동명왕","온조왕","혁거세"}; //3개의 문자열을 배열을 생성하고 값을 할당
		
		System.out.println(Arrays.toString(name));
		
		String[] strings = {"가위", "바위", "보"};
		for(int i = 0; i < 5;i++) {
			int temp = (int)(Math.random()*3);
			System.out.println(strings[temp]);
		}
		
		
	}
}
