package programmers;

public class k의개수 {
	
	public static void main(String[] args) {

		int i = 1;
		int j = 13;
		int k = 1;
		
		int answer = 0;
		
		//접근방법? => 형변환해서?
		String kString = k+"";
		String tmp = "";
		
//		for(int a = i; a<=j; a++) {
//			tmp = a+"";
//			if(tmp.contains(kString)) {
//				answer++;
//			}
//			
//			tmp="";
//		}
		//위의 for문이 왜 틀렸는가? 11일때는 1이 2개 들어가는데?
//		if(tmp.equals(kString+kString)) {
//			answer++;
//		}
		//이것도 안됨 999일때 k=9면 반례가 생김
		
		//String[] split(String regex)
		//입력받은 정규표현식 또는 특정문자를 기준으로 문자열을 나누어 배열(Array)에 저장하여 리턴
		for(int a = i; a<=j; a++) {
			tmp = a+"";
			String[] arr = tmp.split("");
			
			for(String arrString : arr) {
				if(arrString.contains(kString)) {
					answer++;
				}
			}
			
		}
		
		System.out.println(answer);
		
		//다른사람 풀이
		for(int a = i; a<=j; i++) {
			int x = a;
			while(x!=0) {
				if(x%10==k) {
					answer++;
				}
				x/=10;
			}
		}
		
		
		
	}

}
