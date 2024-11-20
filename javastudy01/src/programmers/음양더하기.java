package programmers;

public class 음양더하기 {
	
	public static void main(String[] args) {

		int[] absolutes = {4,7,12};
		boolean[] signs = {true,false,true};
		int answer = 0;
		
		for(int i = 0; i < signs.length; i++) {
			if(signs[i] == true) {
				answer+=absolutes[i];
			} else {
				answer-=absolutes[i];
			}
		}
		
		System.out.println(answer);
		
		//다른 풀이 => 내가 작성한 if문을 삼항연산자로
		for(int i = 0; i < signs.length; i++) {
			answer+=absolutes[i]*(signs[i]?1:-1);
		}
		
		
	}

}
