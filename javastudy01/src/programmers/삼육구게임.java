package programmers;

public class ���������� {
	
	public static void main(String[] args) {

		int order = 29413;
		int answer = 0;
		
		//int�� String���� �����ϰ� for�� ������ �ϴ� ���?
		String orderString = order + "";
		
		for(int i = 0; i<orderString.length();i++) {
			if(orderString.charAt(i)=='3' || orderString.charAt(i)=='6' || orderString.charAt(i)=='9') {
				answer++;
			} 
		}
		
		System.out.println(answer);
		
	}

}
