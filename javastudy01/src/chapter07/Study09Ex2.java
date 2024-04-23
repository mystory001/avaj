package chapter07;

class ChildS9E1 extends ParentS9E1{

	public void printMembers() {
//		System.out.println(privateVariable); //에러
		System.out.println(defaultVariable);
		System.out.println(protectedVariable);
		System.out.println(publicVariable);
	}
	
	//만약 다른 패키지에 있는 클래스는
//	public void printMembers() {
//		System.out.println(privateVariable); //에러
//		System.out.println(defaultVariable); //에러
//		System.out.println(protectedVariable);
//		System.out.println(publicVariable);
//	}
	
}

public class Study09Ex2 {
	
	public static void main(String[] args) {

	}

}
