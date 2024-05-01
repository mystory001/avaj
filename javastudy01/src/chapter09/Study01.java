package chapter09;

public class Study01 {
	
	public static void main(String[] args) {

		//hashCode()
		//객체의 해시코드(hash code)를 반환하는 메서드 *해시코드 : 정수값
		//Object 클래스의 hashCode()는 객체의 주소를 int로 변환해서 반환
		//equals()를 오버라이딩하면, hashCode()도 오버라이딩해야함.
		//ㄴequals() 결과가 true인 두 객체의 해시코드는 같아야하기 때문
		//String str1 = new String("abc");
		//String str2 = new String("abc");
		//System.out.println(str1.equals(str2)); //true
		//System.out.println(str1.hashCode());
		//System.out.println(str2.hashCode());
		//System.identityHashCode(Object obj)는 Object클래스의 hashCode()와 동일. 객체마다 다른 해시코드를 반환
		//System.identityHashCode(System.identityHashCode(str1));
		//System.identityHashCode(System.identityHashCode(str2));
		
		//toString()
		//객체를 문자열로 변환하기 위한 메서드
//		public String toString() {	//Object클래스의 toString()
//			return getClass().getName()+"@"+Integer.toHexString(hashCode());
//		}
		
		
		
		
	}

}
