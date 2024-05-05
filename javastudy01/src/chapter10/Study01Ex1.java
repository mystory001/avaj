package chapter10;

import java.util.Calendar;

public class Study01Ex1 {
	
	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();  //현재 날짜와 시간으로 세팅

		//get()으로 날짜와 시간 필드 가져오기 - int get(int field)
		int thisYear = calendar.get(Calendar.YEAR); //올해가 몇 년도인지
		int lastDayOfMonth = calendar.getActualMaximum(Calendar.DATE); //이 달의 마지막 날
		System.out.println(thisYear);
		System.out.println(lastDayOfMonth);
		
		//Calendar에 정의된 필드
		//날짜
		//YEAR : 년
		//MONTH : 월(0부터시작)
		//WEEK_OF_YEAR : 1월 1일부터 지금까지 몇 번째 주
		//WEEK_OF_MONTH : 그 달의 몇 번째 주
		//DATE : 일
		//DAY_OF_MONTH : 그 달의 몇 번째 일 
		//DAY_OF_YEAR : 그 해의 몇 번째일
		//DAY_OF_WEEK : 요일(1 일요일) 
		//DAY_OF_WEEK_IN_MONTH : 그 달의 몇 번째 요일
		
		//시간
		//HOUR : 시간(0~11)
		//HOUR_OF_DAY : 시간(0~23)
		//MINUTE : 분
		//SECOND : 초
		//MULLISECOND : 천 분의 일초
		//ZONE_OFFSET : GMT 기준 시차(천 분의 일초 단위)
		//AM_PM : 오전/오후
		
	}
	
}
