package chapter07;

class ParentS9E1{
	private int privateVariable; 	//같은 클래스
	int defaultVariable; 			//같은 패키지
	protected int protectedVariable;//같은 패키지 + 자손(다른 패키지)
	public int publicVariable;		//접근제한이 없음
	
	public void printMembers() {
		System.out.println(privateVariable);
		System.out.println(defaultVariable);
		System.out.println(protectedVariable);
		System.out.println(publicVariable);
	}

}

public class Study09Ex1 {
	
	public static void main(String[] args) {

		ParentS9E1 parentS9E1 = new ParentS9E1();
//		System.out.println(parentS9E1.privateVariable); //에러. 접근 범위가 안맞음
		System.out.println(parentS9E1.defaultVariable);
		System.out.println(parentS9E1.protectedVariable);
		System.out.println(parentS9E1.publicVariable);
		
		
		
	}

}
