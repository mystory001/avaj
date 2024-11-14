package programmers;

public class 피자나눠먹기2 {
	
	public static void main(String[] args) {

		//피자 한 판에 조각 6개 => 모두 같은 수의 피자 조각을 먹어야할때
		int n = 4; //피자를 나눠먹을 사람의 수
		int answer = 0; //최소 몇 판 시켜야함?
		
		//n= 10, x = 6
		//10 5 2 1
		//6 3 2 1
		
		if(n%6==0) {
			answer = n/6;
		} else {
			//최소공배수를 계산하는 식
		}
		
		System.out.println(answer);
		
		
	}

}
