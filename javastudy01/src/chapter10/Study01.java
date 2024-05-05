package chapter10;

import java.util.Calendar;

public class Study01 {

	public static void main(String[] args) {
		
		//날짜와 시간
		//java.util.Date
		//날짜와 시간을 다룰 목적으로 만들어진 클래스
		
		//java.util.Calendar
		//Date 클래스를 개선한 새로운 클래스
		
		//java.time패키지
		//Date와 Calendar의 단점을 개선한 새로운 클래스들을 제공
		//이전 클래스들은 날짜와 시간을 함께 다룬다는 단점이 있었음
		//time 패키지에서는 날짜는 LocalDate, 시간은 LocalTime, 날짜와 시간은 LocalDateTime으로 사용
		
		//Calendar 클래스
		//추상 클래스이므로 getInstance()를 통해 구현된 객체를 얻어야함
//		Calendar calendar = new Calendar(); //에러 발생. 추상 클래스는 인스턴스를 생성할 수 없음
		Calendar calendar = Calendar.getInstance(); //getInstance()메서드는 Calendar클래스를 구현한 클래스의 인스턴스를 반환
		
	}

}
