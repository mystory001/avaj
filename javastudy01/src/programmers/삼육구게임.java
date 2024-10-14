package programmers;

public class 삼육구게임 {
	
	public static void main(String[] args) {

		int order = 29413;
		int answer = 0;
		
		//int를 String으로 변경하고 for문 돌려서 하는 방법?
		String orderString = order + "";
		
		for(int i = 0; i<orderString.length();i++) {
			if(orderString.charAt(i)=='3' || orderString.charAt(i)=='6' || orderString.charAt(i)=='9') {
				answer++;
			} 
		}
		
		System.out.println(answer);
		
	}

}
