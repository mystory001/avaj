package chapter10;

import java.util.Calendar;

public class Study01Ex2 {
	
	public static void main(String[] args) {

		Calendar today = Calendar.getInstance(); //기본적으로 현재 날짜와 시간으로 설정
		System.out.println("올해의 년도(YEAR) : " + today.get(Calendar.YEAR));
		System.out.println("지금 월(MONTH) : " + today.get(Calendar.MONTH)); //(0~11)
		System.out.println("올해의 몇 번째 주(WEEK_OF_YEAR) : " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("지금 월의 몇 째 주(WEEK_OF_MONTH) : " + today.get(Calendar.WEEK_OF_MONTH));
		
		//DATE와 DAY_OF_MONTH는 같음
		System.out.println("이 달의 일(DATE) : " + today.get(Calendar.DATE));
		System.out.println("이 달의 일(DAY_OF_MONTH) : " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("이 해의 몇 일(DAY_OF_YEAR) : " + today.get(today.DAY_OF_YEAR));
		System.out.println("오늘 요일(DAY_OF_WEEK) : " + today.get(Calendar.DAY_OF_WEEK)); //(1~7, 1 일요일)
		System.out.println("이 달의 몇 번째 요일(DAY_OF_WEEK_IN_MONTH) : " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("오전_오후(AM_PM) : " + today.get(Calendar.AM_PM) ); //(0 오전, 1 오후)
		System.out.println("시간(HOUR) : " + today.get(Calendar.HOUR)); //(0~11)
		System.out.println("시간(HOUR_OF_DAY) : " + today.get(Calendar.HOUR_OF_DAY)); //(0~23)
		System.out.println("분(MINUTE) : " + today.get(Calendar.MINUTE));
		System.out.println("초(SECOND) : " + today.get(Calendar.SECOND));
		System.out.println("1/1000(MILLISECOND) : " + today.get(Calendar.MILLISECOND)); //(0~999)
		System.out.println("TimeZone(ZONE_OFFSET) : " + today.get(Calendar.ZONE_OFFSET/3600000)); //-12~+12. 천분의 1초를 시간으로 표시하기 위해 3600000으로 나눔.(1시간 = 60*60초)
		System.out.println("이 달의 마지막 날(getActualMaximum(Calendar.DATE)) : " + today.getActualMaximum(Calendar.DATE));
		
	}

}
