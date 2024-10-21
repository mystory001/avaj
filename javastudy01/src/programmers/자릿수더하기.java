package programmers;

public class 자릿수더하기 {

	public static void main(String[] args) {
		
		int n = 1234;
		int answer = 0;
		
		
		/*
		n을 문자열로 바꿔서 각각의 문자열을 더한값으로 하려고 함
		String nString = n+"";
		for(int i = 0; i < nString.length(); i++) {
			answer += Integer.parseInt(nString, nString.charAt(i));
		}
		=> 결과 java.lang.NumberFormatException. 추가적으로 그다지 좋은 방법은 아닌 것 같음
		*/
		
		
		int mod = 0;
		while(n>0) {
			mod = n%10;
			n/=10;
			answer += mod;
		}
		
		/*
		 * n = 1234%10 = 4
		 * n = 123%10 = 3
		 * n = 12%10 = 2
		 * n = 1%10 = 1
		 * answer = 4 + 3 + 2 + 1
		 */
		
		System.out.println(answer);
		
		//조금 수정된 방법
		while(n>0) {
			answer+=n%10;
			n/=10;
		}
		
		//다른 방법
		//String의 경우 length()를 지원하지만, int는 지원하지 않음 이 경우 Math함수를 이용해야함
		int length = (int)(Math.log10(n)+1);
		System.out.println("n의 길이 : " + length);
		for(int i = 0; i< length; i++) {
			answer+=n%10;
			n/=10;
		}
				

	}

}
