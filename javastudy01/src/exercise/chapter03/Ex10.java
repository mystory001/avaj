package exercise.chapter03;

public class Ex10 {

	public static void main(String[] args) {
		
		//�빮�ڸ� �ҹ��ڷ� �����ϴ� �ڵ�
		char ch = 'C';
		char lowerCase = (65<=ch&&ch<=90)?(char)((int)ch+32):ch;
		//�ٸ� Ǯ��
//		char lowerCase = ('A'<=ch&&ch<='Z')?(char)((int)ch+32):ch;
		
		System.out.println("ch:"+ch);
		System.out.println("ch to lowerCase:"+lowerCase);

	}

}
