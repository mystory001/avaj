package programmers;

public class 피자나눠먹기1 {

	public static void main(String[] args) {
		
		//피자 한 판에는 7조각, 피자를 나눠 먹을 사람 수 n. 모든 사람이 피자 한 조각을 먹기 위해서는?
		
		int n = 0; //사람 수
		int answer = 0; //피자 수
		if(n%7==0) {
			answer = n/7;
		} else {
			answer = n/7+1;
		}
			

	}

}
