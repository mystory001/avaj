package programmers;

public class 부족한금액계산하기 {
	
	public static void main(String[] args) {

		int price = 3; // 놀이기구 이용료
		int money = 20; // 처음에 가지고 있던 금액
		int count = 4; // 놀이기구의 이용 횟수
		long answer = -1; 
		
		//3 6 9 12 => 30원 ==> answer = 총 비용 - money
		
		long totalMoney = 0;

		for (int i = price; i <= price * count; i += price) {
			totalMoney += i;
		}

		if (money > totalMoney) {
			answer = 0;
		} else {
			answer = totalMoney - money;
		}
		
		
	}

}
