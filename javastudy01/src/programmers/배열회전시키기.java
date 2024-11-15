package programmers;

import java.util.Arrays;

public class 배열회전시키기 {
	
	public static void main(String[] args) {

		int[] numbers = {4, 455, 6, 4, -1, 45, 6};
		String direction = "left"; 
		
		int[] answer = new int[numbers.length];
		
		
//		if(direction== "left") {
		if(direction.equals("left")) { //문자열 비교할 때 equals 메소드를 이용하자
			for(int i = 0; i < numbers.length; i++) {
				answer[i] = numbers[(i+1)%numbers.length];
				System.out.println(answer[i]);
			}
		} else {
			for(int i = 0; i < numbers.length; i++) {
				answer[(i+1)%numbers.length] = numbers[i]; 
				System.out.println(answer[i]);
			}
		}
		
		System.out.println(Arrays.toString(answer));
		System.out.println("구분 " + 1%numbers.length);
		
	}

}
