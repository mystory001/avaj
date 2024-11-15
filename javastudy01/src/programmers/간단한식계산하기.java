package programmers;

public class 간단한식계산하기 {
	
	public static void main(String[] args) {

		String binomial = "43 * 12";
		int answer = 0;
		String op = "";
		
		
		//String - String 연산은 지원되지 않음 => 특정 부분을 제거하고 싶으면 replace()나 replaceAll()을 이용
		
		for(int i = 0; i < binomial.length(); i++) {
			if(binomial.charAt(i)=='+'||binomial.charAt(i)=='-'||binomial.charAt(i)=='*') {
				op += binomial.charAt(i);
			}
		}
		System.out.println("연산자 op : " + op);
		
		//+,-,*를 기준으로 나누기 split()
		//여러 구분자를 처리하는 방법 => 정규 표현식 사용
		String[] part = binomial.split("[\\+\\-\\*]"); //+,-,*를 기준으로 분리
		String a = part[0].trim();
		String b = part[1].trim();
		
		int n1 = Integer.parseInt(a);
		int n2 = Integer.parseInt(b);
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		
		switch(op) {
		case "+" :
			answer = n1 + n2;
			break;
		case "-" :
			answer = n1 - n2;
			break;
		default : answer = n1 * n2;
			break;
		}
		
		
		System.out.println(answer);
		
		//띄어쓰기를 기준으로한다면
		String[] str = binomial.split(" "); //"43 * 12"
		String op1 = str[1];
		//str[0] = 43, str[1] = *, str[2] = 12
		System.out.println(op1);
		
	}

}
