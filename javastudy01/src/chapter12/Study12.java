package chapter12;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Target;

/**
 * *��Ÿ �ֳ����̼�
 * -�ֳ����̼��� ���� �ֳ����̼�
 * -java.lang.annotation ��Ű���� ����
 * -@Target, @Documented, @Inherited, @Retendtion, @Repeatable
 */

/**
 * @Terget
 * �ֳ����̼��� ������ ��, ������ ������ ���
 * ��� Ÿ�� : �ǹ�
 * ANNOTATION_TYPE : �ֳ����̼�
 * CONSTRUCTOR : ������
 * FIELD : �ʵ�(�������, enum ���)
 * LOCAL_VARIALBE : ��������
 * METHOD : �޼ҵ�
 * PACKAGE : ��Ű��
 * PARAMETER : �Ű�����
 * TYPE : Ÿ��(Ŭ����, �������̽�, enum)
 * TYPE_PARAMETER : Ÿ�� �Ű�����
 * TYPE_USE : Ÿ���� ���Ǵ� ��� ��
 */

//@Target({ElementType.FIELD, ElementType.TYPE, ElementType.TYPE_USE}) //�������� FIELD, TYPE, TYPE_USE
//public @interface MyAnnotation{} //MyAnnotation�� ����
//@MyAnnotation //���� ����� TYPE�� ���
//class MyClass{ 
//	@MyAnnotation //�������� FIELD�� ���
//	int i ;
//	@MyAnnotation //�������� TYPE_USE�� ���
//	MyClass me;
//}

/**
 * @Retention
 * �ֳ����̼��� ����(retention)�Ǵ� �Ⱓ�� �����ϴ� �� ���
 * ������å : �ǹ�
 * SOURCE : �ҽ����Ͽ��� ����. Ŭ�������Ͽ��� �������� ����
 * CLASS : Ŭ���� ���Ͽ� ����. ����ÿ� ���Ұ�. �⺻��
 * RUNTIME : Ŭ���� ���Ͽ� ����. ����ÿ� ��밡��
 * �����Ϸ��� ���� ���Ǵ� �ֳ����̼��� ���� ��å�� SOURCE
 * ����ÿ� ��� ������ �ֳ����̼��� ��å�� RUNTIME
 */

/**
 * @Documetented
 * javac�� �ۼ��� ������ ���Խ�Ű���� �� �� ����
 */
//@Documented
//public @interface FunctionalInterface{}

/**
 * @Inherited
 * �ֳ����̼��� �ڼ� Ŭ������ ����ϰ��� �� �� ����
 */
//@Inherited //@SuperAnoo�� �ڼձ��� ���� ��ġ��
//@interface SuperAnno{}
//
//@SuperAnno
//class P{}
//
//class C extends P{} //C�� �ֳ����̼��� ���� ������ �ν�

/**
 * @Repeatable
 * �ݺ��ؼ� ���� �� �ִ� �ֳ����̼��� ������ �� ���
 * @Repeatable�� ���� �ֳ����̼��� �ݺ��ؼ� ���� �� ����
 * @Repeatable �ϳ��� ���� �����̳� �ֳ����̼ǵ� �����ؾ���
 */

public class Study12 {
	public static void main(String[] args) {

		
	}

}
