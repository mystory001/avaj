package chapter12;

import java.util.ArrayList;

public class Study01Test1 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add("30"); //String 추가
		
//		Integer integer = (Integer)list.get(2); //컴파일 OK(컴파일러 한계)
		
		System.out.println(list); //형변환 에러(실행시 발생하는 에러)

		//수정
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
//		list1.add("30"); //String 추가. 컴파일 에러
		list1.add(30); //타입 체크가 강화됨
		
		Integer integer1 = list1.get(2); //형변환 생략 가능
		
		System.out.println(list); 

		
		
	}

}
