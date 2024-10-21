package programmers;

public class 짝수와홀수 {
	
	public static void main(String[] args) {
		
		int num = 3;
		String answer = "";
		
		if(num%2==0) {
			answer = "Even";
		} else {
			answer = "Odd";
		}
		
		//삼항연산자도 가능
		answer = (num%2==0)? "Even": "Odd";
		
		//if문을 사용하기 전에 삼항연산자를 먼저 생각하자
		//if문과 삼항연산자의 속도 부분에서 GPT에게 물어보았다.
		//성능 측면   : if문 ≒ 삼항연산자
		//가독성 측면 : if문 < 삼항연산자
		//복잡한 조건 및 로직 : if문 > 삼항연산자
		
	}

}
