package chapter10;

import java.util.Calendar;

public class Study03Ex1 {
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "�� " + (date.get(Calendar.MONTH)+1) + "�� " + date.get(Calendar.DATE) + "��";
	}
	
	public static void main(String[] args) {

		System.out.println("set() �޼���");
		
		Calendar date = Calendar.getInstance();
		date.set(2024, 3, 30); 
		System.out.println(toString(date)); //2024�� 4�� 30��
		date.add(Calendar.DATE, 1);
		System.out.println("1�� �� => " + toString(date)); //2024�� 5�� 1��
		
		date.add(Calendar.MONTH, -5);
		System.out.println("5���� �� => " + toString(date)); //2023�� 12�� 1��
		
		System.out.println();
		
		System.out.println("roll() �޼���");
		date.roll(Calendar.DATE, 31);
		System.out.println("31�� �� => " + toString(date)); //2023�� 12�� 1��
		date.roll(Calendar.MONTH, 3);
		System.out.println("3���� �� => " + toString(date)); //2023�� 3�� 1��
		
		
	}
	
}
