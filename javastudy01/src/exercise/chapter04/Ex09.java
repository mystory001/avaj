package exercise.chapter04;

public class Ex09 {

	public static void main(String[] args) {
		
		//숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드
		//만일 문자열이 12345라면, 1+2+3+4+5의 결과인 15를 출력
		String str = "123456";
		int sum = 0;
		for(int i =0; i<str.length();i++) {
			sum+= str.charAt(i)-48;
		}
		System.out.println(sum);
		

	}

}
