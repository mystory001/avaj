package programmers;

public class 나머지가1이되는수찾기 {
	
	public static void main(String[] args) {

		int n = 10;
		int answer = 0;
		
		//내가 작성한 답
		//i = 2 -> n = 0
		//i = 3 -> n = 1 break
		for(int i = 1; i<n ;i++) { 
			if(n%i==1) {
				answer = i;
				break;
			}
		}
		
		System.out.println(answer);
		
		//while문으로 바꿔보기
		int a = 1;
		while(true) {
			if(n%a==1) { break;
			}
			a++;
		}
		
		System.out.println(a);
		
		
		
	}

}
