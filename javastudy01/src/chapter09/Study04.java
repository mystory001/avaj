package chapter09;

public class Study04 {
	
	public static void main(String[] args) {

		//String 생성자

		//String(String s) 주어진 문자열(s)을 갖는 String 인스턴스를 생성
		String string = new String("Hello");
		//String(char[] value) 주어진 문자열(value)을 갖는 String 인스턴스를 생성
		char[] c = {'H','e','l','l','o'};
		String string2 = new String(c);
		//String(StringBuffer buf) StringBuffer 인스턴스가 갖고 있는 문자열과 같은 내용의 String 인스턴스를 생성
		StringBuffer sb = new StringBuffer("Hello");
		String string3 = new String(sb);
		//char charAt(int index) 지정된 위치(index)에 있는 문자열을 알려줌. index는 0부터 시작
		String string4 = "Hello";
		String n = "0123456";
		char c1 = sb.charAt(1);
		char c2 = n.charAt(1);
		//int compareTo(String str) 문자열(str)과 사전순서로 비교. 같으면 0, 사전순으로 이전이면 음수, 이후면 양수로 반환
		int i1 = "aaa".compareTo("aaa");
		int i2 = "aaa".compareTo("bbb");
		int i3 = "bbb".compareTo("aaa");
		//String concat(String str) 문자열(Str)을 뒤에 덧붙임
		String string5 = "Hello";
		String string6 = string5.concat(" World");
		//boolean contains(CharSequence s) 지정된 문자열(s)이 포함되어 있는지 검사
		
		
	}

}
