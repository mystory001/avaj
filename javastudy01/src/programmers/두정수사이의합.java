package programmers;

public class �������������� {
	
	public static void main(String[] args) {

		int a= 3;
		int b = 5;
		long answer = 0;
		
		if(a>=b) {
			for(int i = b; i<=a; i++) {
				answer +=i;
			}
		} else {
			for(int i = a; i<=b;i++) {
				answer +=i;
			}
		}
		
		System.out.println(answer);
		
		
	}

}
