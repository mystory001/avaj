package chapter12;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Target;

/**
 * *메타 애너테이션
 * -애너테이션을 위한 애너테이션
 * -java.lang.annotation 패키지에 포함
 * -@Target, @Documented, @Inherited, @Retendtion, @Repeatable
 */

/**
 * @Terget
 * 애너테이션을 정의할 때, 적용대상 지정에 사용
 * 대상 타입 : 의미
 * ANNOTATION_TYPE : 애너테이션
 * CONSTRUCTOR : 생성자
 * FIELD : 필드(멤버변수, enum 상수)
 * LOCAL_VARIALBE : 지역변수
 * METHOD : 메소드
 * PACKAGE : 패키지
 * PARAMETER : 매개변수
 * TYPE : 타입(클래스, 인터페이스, enum)
 * TYPE_PARAMETER : 타입 매개변수
 * TYPE_USE : 타입이 사용되는 모든 곳
 */

//@Target({ElementType.FIELD, ElementType.TYPE, ElementType.TYPE_USE}) //적용대상이 FIELD, TYPE, TYPE_USE
//public @interface MyAnnotation{} //MyAnnotation을 정의
//@MyAnnotation //적용 대상이 TYPE인 경우
//class MyClass{ 
//	@MyAnnotation //적용대상이 FIELD인 경우
//	int i ;
//	@MyAnnotation //적용대상이 TYPE_USE인 경우
//	MyClass me;
//}

/**
 * @Retention
 * 애너테이션이 유지(retention)되는 기간을 지정하는 데 사용
 * 유지정책 : 의미
 * SOURCE : 소스파일에만 존재. 클래스파일에는 존재하지 않음
 * CLASS : 클래스 파일에 존재. 실행시에 사용불가. 기본값
 * RUNTIME : 클래스 파일에 존재. 실행시에 사용가능
 * 컴퍼일러에 의해 사용되는 애너테이션의 유지 정책은 SOURCE
 * 실행시에 사용 가능한 애너테이션의 정책은 RUNTIME
 */

/**
 * @Documetented
 * javac로 작성한 문서에 포함시키고자 할 때 붙임
 */
//@Documented
//public @interface FunctionalInterface{}

/**
 * @Inherited
 * 애너테이션을 자손 클래스에 상속하고자 할 때 붙임
 */
//@Inherited //@SuperAnoo가 자손까지 영향 미치게
//@interface SuperAnno{}
//
//@SuperAnno
//class P{}
//
//class C extends P{} //C에 애너테이션이 붙은 것으로 인식

/**
 * @Repeatable
 * 반복해서 붙일 수 있는 애너테이션을 정의할 때 사용
 * @Repeatable이 붙은 애너테이션은 반복해서 붙일 수 있음
 * @Repeatable 하나로 묶을 컨테이너 애너테이션도 정의해야함
 */

public class Study12 {
	public static void main(String[] args) {

		
	}

}
