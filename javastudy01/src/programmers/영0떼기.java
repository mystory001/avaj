package programmers;

public class 영0떼기 {

	public static void main(String[] args) {
		
		String n_str = "0010";
		String result = "";
		
		
		//replace로 0을 ""공백으로 교체하고 trim으로 하려고 했으나 뒤에 0이 있으면 함께 제거가 됨
		//문자열 앞뒤 공백 제거 → java.lang.String 클래스의 trim(), strip() 메소드가 있음
		//trim() 메소드는 앞뒤 공백을 제거한 문자열의 복사본을 리턴
		//strip() 메소드는 자바 11이후 버전부터 사용가능하며, trim()과 같음
		//stripLeading() 문자열 앞의 공백을 제거
		//stripTrailing() 문자열 뒤의 공백을 제거
		
		//조건문을 이용해서 charAt(i)가 0이 아니면 result에 담고 그렇지 않으면 ~~ 이런식으로 코드 작성을 해야할 것 같은데
		
		//문자열 찾기, 특정 문자 제거 또는 사용
		//StringBuilder 특정 문자열을 찾거나 제거하는 방법
//		StringBuilder sb = new StringBuilder(n_str);
//		int idx = sb.indexOf("0");
//		if(idx!=-1) {
//			sb.deleteCharAt(idx);
//		}
		
		//아주 간단한 방법이 있었음
		result = Integer.toString(Integer.parseInt(n_str));
		System.out.println(result);
		
		//다른 사람의 풀이1
		result = String.valueOf(Integer.parseInt(n_str));
		
		//다른 사람의 풀이2 (내가 처음 하려고 했던 것)
		int idx = -1;
		for(int i = 0; i< n_str.length();i++) {
			if(n_str.charAt(i)>='1') {
				idx=i;
				break;
			}
			result = n_str.substring(idx);
		}

	}

}
