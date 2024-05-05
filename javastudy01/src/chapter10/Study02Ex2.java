package chapter10;

import java.util.Calendar;

public class Study02Ex2 {

	public static void main(String[] args) {

		final int[] TIME_UNIT = {3600, 60, 1}; //큰 단위를 앞에 놓음
		final String[] TIME_UNIT_NAME = {"시간", "분", "초"};
		
		Calendar t1 = Calendar.getInstance();
		Calendar t2 = Calendar.getInstance();
		
		//t1을 10시 10분 10초로 설정
		t1.set(Calendar.HOUR_OF_DAY, 10);
		t1.set(Calendar.MINUTE, 10);
		t1.set(Calendar.SECOND, 10);
		
		//t2을 20시 20분 20초로 설정
		t2.set(Calendar.HOUR_OF_DAY, 20);
		t2.set(Calendar.MINUTE, 20);
		t2.set(Calendar.SECOND, 20);
		
		System.out.println("t1 : " + t1.get(Calendar.HOUR_OF_DAY) + "시 " + t1.get(Calendar.MINUTE)+ "분 " + t1.get(Calendar.SECOND) + "초");
		System.out.println("t2 : " + t2.get(Calendar.HOUR_OF_DAY) + "시 " + t2.get(Calendar.MINUTE)+ "분 " + t2.get(Calendar.SECOND) + "초");
		
		long diff = Math.abs(t2.getTimeInMillis() - t1.getTimeInMillis())/1000;
		System.out.println("t1과 t2의 차이는 " + diff + "초");
		
		String temp = "";
		for(int i = 0; i<TIME_UNIT.length;i++) {
			temp += diff/TIME_UNIT[i] + TIME_UNIT_NAME[i];
			diff %= TIME_UNIT[i];
		}
		System.out.println("차이를 시분초로 변환하면 " + temp);
		
	}

}
