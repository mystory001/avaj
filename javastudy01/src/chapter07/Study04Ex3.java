package chapter07;

class ParentS4E3{
	void parentMethod() {}
}

class ChildS4E3 extends ParentS4E3{
	void parentMethod() {} //오버라이딩
	void parentMethod(int i) {} //오버로딩
	
	void childMethod() {} //메소드 정의
	void childMethod(int i ) {} //오버로딩
//	void childMethod() {} //중복정의. 에러
}

public class Study04Ex3 {

}
