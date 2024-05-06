package chapter10;

import java.util.Calendar;

public class Study03Ex1 {
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH)+1) + "월 " + date.get(Calendar.DATE) + "일";
	}
	
	public static void main(String[] args) {

		System.out.println("set() 메서드");
		
		Calendar date = Calendar.getInstance();
		date.set(2024, 3, 30); 
		System.out.println(toString(date)); //2024년 4월 30일
		date.add(Calendar.DATE, 1);
		System.out.println("1일 후 => " + toString(date)); //2024년 5월 1일
		
		date.add(Calendar.MONTH, -5);
		System.out.println("5개월 전 => " + toString(date)); //2023년 12월 1일
		
		System.out.println();
		
		System.out.println("roll() 메서드");
		date.roll(Calendar.DATE, 31);
		System.out.println("31일 후 => " + toString(date)); //2023년 12월 1일
		date.roll(Calendar.MONTH, 3);
		System.out.println("3개월 후 => " + toString(date)); //2023년 3월 1일
		
		
	}
	
}
