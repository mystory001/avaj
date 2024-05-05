package chapter10;

import java.util.Calendar;
import java.util.Date;

public class Study02 {

	public static void main(String[] args) {

		//set()으로 날짜와 시간 지정
		//년월일 또는 년월일시분초까지 설정
		//주의사항 날짜 지정하는 방법에서 월은 0부터 시작
		Calendar c1 = Calendar.getInstance();
		c1.set(2024, 4, 5); //=> 2024년 5월 5일
		c1.set(Calendar.YEAR, 2024);
		c1.set(Calendar.MONTH, 4); //5월
		c1.set(Calendar.DATE, 5);

		//시간 지정
		//시분초를 설정하는 메서드는 없기 때문에 따로 해줘야함
		Calendar t1 = Calendar.getInstance();
		t1.set(Calendar.HOUR_OF_DAY, 16);
		t1.set(Calendar.MINUTE, 50);
		t1.set(Calendar.SECOND, 20);
		
		System.out.println();
		
		//clear()는 Calendar 객체의 모든 필드를 초기화
		Calendar dt = Calendar.getInstance();
		System.out.println(new Date(dt.getTimeInMillis()));
		dt.clear();
		System.out.println(new Date(dt.getTimeInMillis())); //EPOCH Time
		
		//clear(int field)는 Calendar 객체의 특정 필드를 초기화
		
		
	}

}
