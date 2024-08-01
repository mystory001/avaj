package programmers;

public class 커피 {
	
	public static void main(String[] args) {

		//커피 한 잔 가격은 5500원
		//최대로 마실 수 있는 커피 잔 수와 남은 돈을 배열에 담기
		
		int money = 0; //보유 금액
		int[] answer = new int[2]; //보유 금액으로 최대로 마실 수 있는 커피 수, 남은 돈
		
		answer[0] = (int)(money/5500);
		answer[1] = (int)(money%5500);
		
		for(int i = 0; i<answer.length;i++) {
			System.out.println(answer[i]);
		}
		
	}

}
