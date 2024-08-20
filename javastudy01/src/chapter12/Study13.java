package chapter12;

import java.lang.annotation.*;

/**
 * *�ֳ����̼� Ÿ�� ����
 * -�ֳ����̼��� ���� ����� �� �� ����
 * 	@interface �ֳ����̼��̸�{
 * 		Ÿ�Կ���̸�(); //�ֳ����̼��� ��Ҹ� ����
 * 		...
 * }
 * -�ֳ����̼��� �޼ҵ�� �߻� �޼ҵ��̸�, �ֳ����̼��� ������ �� ����(����X)
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
//    DateTime testDate(); //�ڽ��� �ƴ� �ٸ� �ֳ����̼�(@DateTime)�� ������ �� ����
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
 * *�ֳ����̼��� ���
 * -����� ���� �������� ������, ���� �� �ִ� �⺻�� ��������(null ����)
 * -��Ұ� �ϳ��̰� �̸��� value�� ���� ����� �̸� ���� ����
 * -����� Ÿ���� �迭�� ���, ��ȣ{}�� ���
 */

//@interface TestInfo1{
//	int count() default 1; //�⺻���� 1�� ����
//}
//@TestInfo1 //@TestInfo1(count=1)�� ����. default���� �ִ°�� ��������

//@interface TestInfo2{
//	String value();
//}
//@TestInfo2("passed") //@TestInfo(value="passed")�� ����

//@interface TestInfo3{
//	String[] testTools();
//}
////@TestInfo3(testTools={"passed"}) //���� �ϳ��� ��� @TestInfo3(testTools="passed")�� ���� {} ��������
////@TestInfo3(testTools={"Tester1","Tester2"})
//@TestInfo3(testTools= {}) //���� ���� �� {} �ݵ�� �ʿ�

/**
 * *��� �ֳ����̼��� ���� java.lang.annotation.Annotation
 * -Annotation�� ��� �ֳ����̼��� ���������� ��� �Ұ�.
 * -Annotation�� �������̽�
 */
//@interface TestInfo4 extends Annotation{} //����. ������ ���� ǥ��

/**
 * *��Ŀ �ֳ����̼�
 * -��Ұ� �ϳ��� ���ǵ��� ���� �ֳ����̼�
 */

/**
 * *�ֳ����̼� ����� ��Ģ
 * -����� Ÿ���� �⺻��, String, enum, �ֳ����̼�, Class(Class Ŭ����)�� ���
 * -��ȣ() �ȿ� �Ű������� ������ �� ����
 * -���ܸ� ������ �� ����
 * -��Ҹ� Ÿ�� �Ű������� ������ �� ����
 */

@Deprecated
@SuppressWarnings("1234") //��ȿ���� ���� �ֳ����̼��� ���õ�
@chapter12.Study13.TestInfo(testedBy="abc", testDate=@chapter12.Study13.DateTime(yymmdd="240820", hhmmss="161500"))
public class Study13 {
	
	public static void main(String[] args) {
		
		Class<Study13> cls = Study13.class; //Study13�� Class��ü�� ����
		
		TestInfo anno = cls.getAnnotation(TestInfo.class);
		System.out.println("anno.testedBy() = " + anno.testedBy());
		System.out.println("anno.testDate().yymmdd() = " + anno.testDate().yymmdd());
		System.out.println("anno.testDate().hhmmss() = " + anno.testDate().hhmmss());
		
		for(String str:anno.testTools()) {
			System.out.println("testTools = " + str);
		}
		
		System.out.println();
		
		Annotation[] annoArr = cls.getAnnotations(); //���� Ŭ������ ����� ��� �ֳ����̼��� ������
		for(Annotation annotation : annoArr) {
			System.out.println(annotation);
		}
		
	}
	
@Retention(RetentionPolicy.RUNTIME) //���� �ÿ� ��� �����ϵ��� ����
@interface TestInfo{
	int count() default 1;
	String testedBy();
	String[] testTools() default "JUnit";
	TestType testType() default TestType.FIRST;
	DateTime testDate();
}

@Retention(RetentionPolicy.RUNTIME) //���� �� ��� �����ϵ��� ����
@interface DateTime{
	String yymmdd();
	String hhmmss();
}

enum TestType{FIRST,FINAL}

}
