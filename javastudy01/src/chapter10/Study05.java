package chapter10;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Study05 {

	public static void main(String[] args) throws ParseException {

		//SimpleDateFormat
		//날짜 시간을 다양한 형식으로 출력할 수 있게 해줌

		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); //mm은 분을 뜻함
		
		//오늘 날짜를 yyyy-MM-dd형태로 변환하여 반환
		String todayResult = sdf.format(today);
		System.out.println(todayResult);
		
		//패턴의 기호
		//G : 연대(BC,AD)
		//y : 년도
		//M : 월(1~12 또는 1월~12월)
		//w : 년의 몇 번째 주(1~53)
		//W : 월의 몇 번째 주(1~5)
		//D : 년의 몇 번째 일(1~366)
		//d : 월의 몇 번째 일(1~31)
		//F : 월의 몇 번째 요일(1~5)
		//E : 요일
		
		//특정 형식으로 되어 있는 문자열에서 날짜와 시간을 뽑아낼 수 있음
		DateFormat df1 = new SimpleDateFormat("yyyy년 MM월 dd일");
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		Date date = df1.parse("2024년 5월 6일"); //문자열을 Date로 변환. 예외 처리 필요함
		String dateResult = df2.format(date);
		System.out.println(dateResult); //2024/05/06
		
		//a : 오전/오후(AM,PM)
		//H : 시간(0~23), h : 시간(1~12), K(0~11), k(1~24)
		//m : 분(0~59)
		//s : 초(0~59), S : 천분의 일초(0~999)
		//Z : Time zone(RFC822 time zone), z : Time zone(General time zone)
		//' : 이스케이프문자(특수문자를 표현하는데 사용)
		
	}

}
