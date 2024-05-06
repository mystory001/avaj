package chapter10;

import java.util.Calendar;

public class Study03Ex2 {

	public static void main(String[] args) {
		//Run - Run configuration으로 실행해야함
		if(args.length != 2) {
			System.out.println();
			return;
		}
		
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int START_DAY_OF_WEEK = 0; //1일의 요일
		int END_DAY = 0;
		
		Calendar startDay = Calendar.getInstance(); //시작일
		Calendar endDay = Calendar.getInstance(); //끝일
		
		startDay.set(year, month-1, 1); //월의 경우 0부터 11의 값을 가지므로 1을 빼줘야함
		endDay.set(year, month, 1);
		
		endDay.add(Calendar.DATE, -1); //다음날 1일에서 하루를 빼면 현재 달(month)의 마지막 날
		
		START_DAY_OF_WEEK = startDay.get(Calendar.DAY_OF_WEEK); //첫 번째 요일이 무슨 요일인지 알아냄
		END_DAY = endDay.get(Calendar.DATE);
		
		System.out.println(year + "년 " + month + "월");
		System.out.println(" 일 월 화 수 목 금 토");
		
		//해당 월의 1일이 어느 요일인지에 따라서 공백을 출력
		//만일 1일이 수요일이라면 공백을 3번 찍는다.
		for(int i=1;i < START_DAY_OF_WEEK ;i++) {
			System.out.print(" ");
		}
		
		for(int i = 1, n = START_DAY_OF_WEEK; i <= END_DAY; i++, n++) {
			System.out.print((i<10)? " " + i : " "+i);
			if(n%7==0)
				System.out.println();
		}
		
		
		//1. 마지막 날 구하기 다음날 1일 - 1일
		//2. 1일의 요일 구하기
		
	}
	
}
