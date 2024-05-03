package chapter09;

public class Study07 {

	public static void main(String[] args) {

		//StringBuffer 클래스의 메서드
		
		//StringBuffer() 16문자를 담을 수 있는 버퍼를 가진 StringBuffer 인스턴스를 생성
		StringBuffer sb1 = new StringBuffer(); //""
		
		//StringBuffer(int length) 지정된 개수의 문자를 담을 수 있는 버퍼를 가진 StringBuffer 인스턴스를 새엇ㅇ
		StringBuffer sb2 = new StringBuffer(10); //""
		
		//StringBuffer(String str) 지정된 문자열 값(str)을 갖는 StringBuffer 인스턴스를 새엇ㅇ
		StringBuffer sb3 = new StringBuffer("Hello"); //"Hello"
		
		//StringBuffer append(Object obj) 매개변수로 입력된 값을 문자열로 변환하여 StringBuffer 인스턴스가 저장하고 있는 문자열의 뒤에 덧붙임
		StringBuffer sb4 = new StringBuffer("abc");
		StringBuffer sb5 = sb4.append(true); //sb5 = abctrue
		
		//int capacity() StringBuffer인스턴스의 버퍼크기를 알려줌. length()는 버퍼에 담긴 문자열의 길이를 알려줌
		StringBuffer sb6 = new StringBuffer(100);
		sb6.append("abcd");
		int bufferSize = sb6.capacity(); //100
		int stringSize = sb6.length(); //4
		
		//char charAt(int index) 지정된 위치(index)에 있는 문자를 반환
		StringBuffer sb7 = new StringBuffer("abc");
		char c1 = sb7.charAt(2); //'c'
		
		//StringBuffer delete(int start, int end) 시작위치(start)부터 끝 위치(end) 사이에 있는 문자를 제거. 단, 끝 위치의 문자는 제외
		StringBuffer sb8 = new StringBuffer("0123456");
		StringBuffer sb9 = sb8.delete(2, 4); //01456
		
		//StringBuffer deleteCharAt(int index) 지정된 위치(index)의 문자를 제거
		StringBuffer sb10 = new StringBuffer("0123456");
		StringBuffer sb11 = sb10.deleteCharAt(3); //012456
		
		//StringBuffer insert(int pos, Object obj) 두 번째 매개변수로 받은 값을 문자열로 변환하여 지정된 위치(pos)에 추가. pos는 0부터 시작
		StringBuffer sb12 = new StringBuffer("0123456");
		sb12.insert(4, '/'); //0123/456
		
		//int length() StringBuffer 인스턴스에 저장되어 있는 문자열의 길이를 반환
		StringBuffer sb13 = new StringBuffer("0123456");
		int length = sb13.length(); //7
		
		//StringBuffer repalce(int start, int end, String str) 지정된 범위(start~end)의 문자들을 주어진 문자열로 바꿈. end 위치의 문자는 포함되지 않음(start<= x < end)
		StringBuffer sb14 = new StringBuffer("0123456");
		sb14.replace(3, 6, "xyz"); //012xyz6
		
		//StringBuffer reverse() StringBuffer인스턴스에 저장되어 있는 문자열의 순서를 거꾸로 나열
		StringBuffer sb15 = new StringBuffer("0123456");
		sb15.reverse(); //6543210
		
		//void setCharAt(int index, char ch) 지정된 위치의 문자를 주어진 문자(ch)로 바꿈
		StringBuffer sb16 = new StringBuffer("0123456");
		sb16.setCharAt(0, '9'); //9123456
		
		//void setLength(int newLength) 지정된 길이로 문자열의 길이를 변경. 길이를 늘리는 경우 나머지 빈 공간에 null 문자 '\u0000'으로 채움
		StringBuffer sb17 = new StringBuffer("0123456");
		sb17.setLength(5); //01234
		StringBuffer sb18 = new StringBuffer("0123456");
		sb18.setLength(10); //"0123456   "
		String str1 = sb18.toString().trim(); //0123456
		
		//String toString() StringBuffer 인스턴스의 문자열을 String으로 반환
		StringBuffer sb19 = new StringBuffer("0123456");
		String str2 = sb19.toString(); //0123456
		
		//String substring(int start), String substring(int start, int end) 지정된 범위 내의 문자열을 String으로 뽑아서 반환. 시작위치만 지정하면 시작위치부터 문자열 끝까지 뽑아서 반환
		StringBuffer sb20 = new StringBuffer("012345");
		String str3 = sb20.substring(3); //345
		String str4 = sb20.substring(3, 5); //34
		
		
	}
	
}
