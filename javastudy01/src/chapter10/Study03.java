package chapter10;

import java.util.Calendar;
import java.util.Date;

public class Study03 {

	public static void main(String[] args) {
		
		//※필드 읽기 get() 필드 변경 set() 필드초기화 clear()
		//add() 특정 필드의 값을 증가 또는 감수(일로 하여금 월이 변경됨)
		Calendar dateAdd = Calendar.getInstance();
		dateAdd.clear(); //모든 필드 초기화
		dateAdd.set(2024, 4, 6); //2024년 5월 6일로 설정
		
		dateAdd.add(Calendar.DATE,1); //날짜(DATE)에 1을 더함
		dateAdd.add(Calendar.MONTH, -4); //월(MONTH)에서 4을 뺌
		
		//roll() 특정 필드의 값을 증가 또는 감소(일로 하여금 월이 변경되지 않음)
		Calendar dateRoll = Calendar.getInstance();
		dateRoll.clear(); //모든 필드 초기화
		dateRoll.set(2024, 4, 6); //2024년 5월 6일로 설정
		
		dateRoll.roll(Calendar.DATE,-7); //날짜(DATE)에 1을 더함
		dateRoll.roll(Calendar.MONTH, -4); //월(MONTH)에서 4을 뺌
		
		//Date와 Calendar간의 변환
		//Date의 메서드는 대부분 deprecated되었지만 여전히 사용
		//1. Calendar -> Date로 변환
		Calendar cal1 = Calendar.getInstance();
		Date d1 = new Date(cal1.getTimeInMillis());
		
		//2. Date를 Calendar로 변환
		Date d2 = new Date();
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(d2);

	}

}
