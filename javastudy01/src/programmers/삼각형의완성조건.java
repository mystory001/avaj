package programmers;

import java.util.Arrays;

public class 삼각형의완성조건 {

	public static void main(String[] args) {

		int[] sides = {199,72,222};
		int answer = 0;
		Arrays.sort(sides);
		if(sides[0]+sides[1]>sides[2]) {
			answer = 1;
		} else {
			answer = 2;
		}
		
		System.out.println(answer);
	}
	
}
