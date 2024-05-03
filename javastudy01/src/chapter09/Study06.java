package chapter09;

public class Study06 {
	
	public static void main(String[] args) {

		//StringBuffer 클래스
		//String처럼 문자형 배열(char[])을 내부적으로 가지고 있음
		//String과 달리 내용을 변경할 수 있음(mutable)
		
		//StringBuffer의 생성자
		//배열은 길이 변경 불가. 공간이 부족하면 새로운 배열 생성
		//만들어진 배열의 크기가 부족했을 때 크기가 더 큰 새로운 배열을 생성한 후 기존 배열의 내용을 복사, 참조 변경
		//StringBuffer는 저장한 문자열의 길이를 고려해서 적절한 크기로 생성
		//※버퍼의 크기를 지정하지 않으면 버퍼의 크기는 16이됨.
		
		//StringBuffer의 변경
		//StringBuffer는 String과 달리 내용 변경이 가능
		//StringBuffer sb = new StringBuffer("abc");
		//sb.append("123");
		//※append() : 끝에 문자열 추가, delete() : 삭제, insert() 삽입
		//append()는 지정된 내용을 StringBuffer에 추가 후, StringBuffer의 참조를 반환(Study06Ex2)
		
		//StringBuffer의 비교
		//StringBuffer는 equals()가 오버라이딩되어 있지 않음.(주소비교)
		//StringBuffer sb1 = new StringBuffer("abc");
		//StringBuffer sb2 = new StringBuffer("abc");
		//System.out.println(sb1==sb2); //false
		//System.out.println(sb1.equals(sb2)); //false
		//StringBuffer을 String으로 변환한 후에 equals()로 비교해야함
		//String s1 = sb1.toString();
		//String s2 = sb2.toString();
		//System.out.println(s1.equals(s2)); //true
		
	}

}
