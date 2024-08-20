package chapter12;

import java.lang.annotation.*;

/**
 * *애너테이션 타입 정의
 * -애너테이션을 직접 만들어 쓸 수 있음
 * 	@interface 애너테이션이름{
 * 		타입요소이름(); //애너테이션의 요소를 선언
 * 		...
 * }
 * -애너테이션의 메소드는 추상 메소드이며, 애너테이션을 적용할 때 지정(순서X)
 */
//@interface DateTime{
//	String yymmdd();
//    String hhmmss();
//}
//
//enum TestType{FIRST, FINAL}
//
//@interface TestInfo{
//	int count();
//    String testedBy();
//    String[] testTools();
//    TestType testType(); //enum TestTpye{FIRST, FINAL}
//    DateTime testDate(); //자신이 아닌 다른 애너테이션(@DateTime)을 포함할 수 있음
//}
//
//@TestInfo(
//		count=3,
//	    testedBy="Kim",
//	    testTools={"JUnit","AutoTester"},
//	    testType=TestType.FIRST,
//	    testDate=@DateTime(yymmdd="240820", hhmmss="165000")
//	)

//=================================================

/**
 * *애너테이션의 요소
 * -적용시 값을 지정하지 않으면, 사용될 수 있는 기본값 지정가능(null 제외)
 * -요소가 하나이고 이름이 value일 때는 요소의 이름 생략 가능
 * -요소의 타입이 배열인 경우, 괄호{}를 사용
 */

//@interface TestInfo1{
//	int count() default 1; //기본값을 1로 지정
//}
//@TestInfo1 //@TestInfo1(count=1)과 동일. default값이 있는경우 생략가능

//@interface TestInfo2{
//	String value();
//}
//@TestInfo2("passed") //@TestInfo(value="passed")와 동일

//@interface TestInfo3{
//	String[] testTools();
//}
////@TestInfo3(testTools={"passed"}) //값이 하나일 경우 @TestInfo3(testTools="passed")와 같이 {} 생략가능
////@TestInfo3(testTools={"Tester1","Tester2"})
//@TestInfo3(testTools= {}) //값이 없을 때 {} 반드시 필요

/**
 * *모든 애너테이션의 조상 java.lang.annotation.Annotation
 * -Annotation은 모든 애너테이션의 조상이지만 상속 불가.
 * -Annotation은 인터페이스
 */
//@interface TestInfo4 extends Annotation{} //에러. 허용되지 않은 표현

/**
 * *마커 애너테이션
 * -요소가 하나도 정의되지 않은 애너테이션
 */

/**
 * *애너테이션 요소의 규칙
 * -요소의 타입은 기본형, String, enum, 애너테이션, Class(Class 클래스)만 허용
 * -괄호() 안에 매개변수를 선언할 수 없음
 * -예외를 선언할 수 없음
 * -요소를 타입 매개변수로 정의할 수 없음
 */

@Deprecated
@SuppressWarnings("1234") //유효하지 않은 애너테이션은 무시됨
@chapter12.Study13.TestInfo(testedBy="abc", testDate=@chapter12.Study13.DateTime(yymmdd="240820", hhmmss="161500"))
public class Study13 {
	
	public static void main(String[] args) {
		
		Class<Study13> cls = Study13.class; //Study13의 Class객체를 얻음
		
		TestInfo anno = cls.getAnnotation(TestInfo.class);
		System.out.println("anno.testedBy() = " + anno.testedBy());
		System.out.println("anno.testDate().yymmdd() = " + anno.testDate().yymmdd());
		System.out.println("anno.testDate().hhmmss() = " + anno.testDate().hhmmss());
		
		for(String str:anno.testTools()) {
			System.out.println("testTools = " + str);
		}
		
		System.out.println();
		
		Annotation[] annoArr = cls.getAnnotations(); //현재 클래스에 적용된 모든 애너테이션을 가져옴
		for(Annotation annotation : annoArr) {
			System.out.println(annotation);
		}
		
	}
	
@Retention(RetentionPolicy.RUNTIME) //실행 시에 사용 가능하도록 지정
@interface TestInfo{
	int count() default 1;
	String testedBy();
	String[] testTools() default "JUnit";
	TestType testType() default TestType.FIRST;
	DateTime testDate();
}

@Retention(RetentionPolicy.RUNTIME) //실행 시 사용 가능하도록 지정
@interface DateTime{
	String yymmdd();
	String hhmmss();
}

enum TestType{FIRST,FINAL}

}
