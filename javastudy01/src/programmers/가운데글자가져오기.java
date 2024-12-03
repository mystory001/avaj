package programmers;

public class 가운데글자가져오기 {
	
	public static void main(String[] args) {

		String s = "qwer";
		String answer = "";
		
		//가장 먼저 생각난 접근방법 => if문 + for문
		//다른 접근 방법으로는 => StringBuilder?
		
		if(s.length()%2==0) {
			for(int i = s.length()/2-1 ; i<=s.length()/2; i++) {
				answer += s.charAt(i)+"";
			}
		} else {
			answer += s.charAt((int)s.length()/2);
		}
		System.out.println(answer);
		
		//다른 풀이1
		int length = s.length();
		
		if(length%2==0) {
			int mid = length/2;
			answer = s.substring(mid-1, mid+1);
		} else {
			int mid = length/2;
			answer = s.substring(mid, mid+1);
		}
		
		//다른 풀이2
		StringBuilder sb = new StringBuilder();
		if(s.length()%2==0) {
			sb.append(String.valueOf(s.charAt(s.length()/2-1)));
		}
		sb.append(String.valueOf(s.charAt(s.length()/2)));
		answer = sb.toString();
		
		//대체적으로 valueOf나 substring으로 푸는 방법이 多
	}

}
