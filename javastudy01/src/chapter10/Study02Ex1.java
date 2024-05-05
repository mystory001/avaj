package chapter10;

import java.util.Calendar;

public class Study02Ex1 {
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"년" + (date.get(Calendar.MONTH)+1) + "월" + date.get(Calendar.DATE) + "일";
	}

	public static void main(String[] args) {

		final String[] DAY_OF_WEEK = {"", "일", "일", "화", "수", "목", "금", "토"}; //요일은 1부터 시작하기 때문에 [0]을 비워둠
		
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		
		//월의 경우 0부터 시작하기 때문에 '현재월 - 1'을 해줘야함
		c1.set(2024, 3, 5); //2024년 4월 5일로 날짜 설정
		//== c1.set(2024, Calendar.MAY, 5);
		System.out.println("c1 " + toString(c1) + DAY_OF_WEEK[c1.get(Calendar.DAY_OF_WEEK)] + "요일");
		System.out.println("c2 " + toString(c2) + DAY_OF_WEEK[c2.get(Calendar.DAY_OF_WEEK)] + "요일");
		
		//두 날짜간의 차이를 얻으려면, getTimeInMillis() 천분의 일초 단위로 변환
		long diff = Math.abs(c1.getTimeInMillis() - c2.getTimeInMillis())/1000;
		System.out.println("c1부터 c2까지 " + diff + "초가 지남");
		System.out.println("일(day)로 계산하면 " + diff/(24*60*60) + "일"); //1일 = 24*60*60
	}

}
