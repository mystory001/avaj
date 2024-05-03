package chapter09;

public class Study07 {

	public static void main(String[] args) {

		//StringBuffer Ŭ������ �޼���
		
		//StringBuffer() 16���ڸ� ���� �� �ִ� ���۸� ���� StringBuffer �ν��Ͻ��� ����
		StringBuffer sb1 = new StringBuffer(); //""
		
		//StringBuffer(int length) ������ ������ ���ڸ� ���� �� �ִ� ���۸� ���� StringBuffer �ν��Ͻ��� ������
		StringBuffer sb2 = new StringBuffer(10); //""
		
		//StringBuffer(String str) ������ ���ڿ� ��(str)�� ���� StringBuffer �ν��Ͻ��� ������
		StringBuffer sb3 = new StringBuffer("Hello"); //"Hello"
		
		//StringBuffer append(Object obj) �Ű������� �Էµ� ���� ���ڿ��� ��ȯ�Ͽ� StringBuffer �ν��Ͻ��� �����ϰ� �ִ� ���ڿ��� �ڿ� ������
		StringBuffer sb4 = new StringBuffer("abc");
		StringBuffer sb5 = sb4.append(true); //sb5 = abctrue
		
		//int capacity() StringBuffer�ν��Ͻ��� ����ũ�⸦ �˷���. length()�� ���ۿ� ��� ���ڿ��� ���̸� �˷���
		StringBuffer sb6 = new StringBuffer(100);
		sb6.append("abcd");
		int bufferSize = sb6.capacity(); //100
		int stringSize = sb6.length(); //4
		
		//char charAt(int index) ������ ��ġ(index)�� �ִ� ���ڸ� ��ȯ
		StringBuffer sb7 = new StringBuffer("abc");
		char c1 = sb7.charAt(2); //'c'
		
		//StringBuffer delete(int start, int end) ������ġ(start)���� �� ��ġ(end) ���̿� �ִ� ���ڸ� ����. ��, �� ��ġ�� ���ڴ� ����
		StringBuffer sb8 = new StringBuffer("0123456");
		StringBuffer sb9 = sb8.delete(2, 4); //01456
		
		//StringBuffer deleteCharAt(int index) ������ ��ġ(index)�� ���ڸ� ����
		StringBuffer sb10 = new StringBuffer("0123456");
		StringBuffer sb11 = sb10.deleteCharAt(3); //012456
		
		//StringBuffer insert(int pos, Object obj) �� ��° �Ű������� ���� ���� ���ڿ��� ��ȯ�Ͽ� ������ ��ġ(pos)�� �߰�. pos�� 0���� ����
		StringBuffer sb12 = new StringBuffer("0123456");
		sb12.insert(4, '/'); //0123/456
		
		//int length() StringBuffer �ν��Ͻ��� ����Ǿ� �ִ� ���ڿ��� ���̸� ��ȯ
		StringBuffer sb13 = new StringBuffer("0123456");
		int length = sb13.length(); //7
		
		//StringBuffer repalce(int start, int end, String str) ������ ����(start~end)�� ���ڵ��� �־��� ���ڿ��� �ٲ�. end ��ġ�� ���ڴ� ���Ե��� ����(start<= x < end)
		StringBuffer sb14 = new StringBuffer("0123456");
		sb14.replace(3, 6, "xyz"); //012xyz6
		
		//StringBuffer reverse() StringBuffer�ν��Ͻ��� ����Ǿ� �ִ� ���ڿ��� ������ �Ųٷ� ����
		StringBuffer sb15 = new StringBuffer("0123456");
		sb15.reverse(); //6543210
		
		//void setCharAt(int index, char ch) ������ ��ġ�� ���ڸ� �־��� ����(ch)�� �ٲ�
		StringBuffer sb16 = new StringBuffer("0123456");
		sb16.setCharAt(0, '9'); //9123456
		
		//void setLength(int newLength) ������ ���̷� ���ڿ��� ���̸� ����. ���̸� �ø��� ��� ������ �� ������ null ���� '\u0000'���� ä��
		StringBuffer sb17 = new StringBuffer("0123456");
		sb17.setLength(5); //01234
		StringBuffer sb18 = new StringBuffer("0123456");
		sb18.setLength(10); //"0123456   "
		String str1 = sb18.toString().trim(); //0123456
		
		//String toString() StringBuffer �ν��Ͻ��� ���ڿ��� String���� ��ȯ
		StringBuffer sb19 = new StringBuffer("0123456");
		String str2 = sb19.toString(); //0123456
		
		//String substring(int start), String substring(int start, int end) ������ ���� ���� ���ڿ��� String���� �̾Ƽ� ��ȯ. ������ġ�� �����ϸ� ������ġ���� ���ڿ� ������ �̾Ƽ� ��ȯ
		StringBuffer sb20 = new StringBuffer("012345");
		String str3 = sb20.substring(3); //345
		String str4 = sb20.substring(3, 5); //34
		
		
	}
	
}
