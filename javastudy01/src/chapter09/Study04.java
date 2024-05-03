package chapter09;

public class Study04 {
	
	public static void main(String[] args) {

		//String ������

		//String(String s) �־��� ���ڿ�(s)�� ���� String �ν��Ͻ��� ����
		String string = new String("Hello");
		
		//String(char[] value) �־��� ���ڿ�(value)�� ���� String �ν��Ͻ��� ����
		char[] c = {'H','e','l','l','o'};
		String string2 = new String(c);
		
		//String(StringBuffer buf) StringBuffer �ν��Ͻ��� ���� �ִ� ���ڿ��� ���� ������ String �ν��Ͻ��� ����
		StringBuffer sb = new StringBuffer("Hello");
		String string3 = new String(sb);
		
		//char charAt(int index) ������ ��ġ(index)�� �ִ� ���ڿ��� �˷���. index�� 0���� ����
		String string4 = "Hello";
		String n = "0123456";
		char c1 = sb.charAt(1);
		char c2 = n.charAt(1);
		
		//int compareTo(String str) ���ڿ�(str)�� ���������� ��. ������ 0, ���������� �����̸� ����, ���ĸ� ����� ��ȯ
		int i1 = "aaa".compareTo("aaa");
		int i2 = "aaa".compareTo("bbb");
		int i3 = "bbb".compareTo("aaa");
		
		//String concat(String str) ���ڿ�(Str)�� �ڿ� ������
		String string5 = "Hello";
		String string6 = string5.concat(" World");
		
		//boolean contains(CharSequence s) ������ ���ڿ�(s)�� ���ԵǾ� �ִ��� �˻� ��interface CharSequence 
		String string7 = "asdfjklzxcvnriw";
		boolean b = string7.contains("sd"); //���ӵ� ���ڿ� ad�� string7���� ���ԵǾ����� �������־ ����� false�� ��ȯ
		
		//boolean endsWith(String suffix) ������ ���ڿ�(suffix)�� ���������� �˻�
		String file = "Hello.txt";
		boolean b1 = file.endsWith("txt");
		
		//boolean equals(Object obj) �Ű������� ���� ���ڿ�(obj)�� String �ν��Ͻ��� ���ڿ��� ��. obj�� String�� �ƴϰų� ���ڿ��� �ٸ��� false�� ��ȯ
		String string8 = "Hello";
		boolean b2 = string8.equals("Hello"); //true
		boolean b3 = string8.equals("hello"); //false
		
		//boolean equalsIgnoreCase(String str) ���ڿ��� String �ν��Ͻ��� ���ڿ��� ��ҹ��� ���о��� ��
		string8 = "Hello";
		boolean b4 = string8.equalsIgnoreCase("HELLO"); //true
		boolean b5 = string8.equalsIgnoreCase("hello"); //true
		
		//int indexOf(int ch) �־��� ����(ch)�� ���ڿ��� �����ϴ��� Ȯ���Ͽ� ��ġ(index)�� �˷���. ��ã���� -1�� ��ȯ(index ���� ��ȣ�� 0). ��ҹ��� ����
		string8 = "Hello";
		int idx1 = string8.indexOf("o"); //4
		int idx2 = string8.indexOf("a"); //-1
		int idx3 = string8.indexOf("h"); //-1
		
		//int indexOf(int ch, int pos) �־��� ����(ch)�� ���ڿ��� �����ϴ��� ������ ��ġ(pos)���� Ȯ���Ͽ� ��ġ(index)�� �˷���. ��ã���� -1�� ��ȯ(index ���� ��ȣ�� 0)
		string8 = "Hello";
		int idx4 = string8.indexOf('e', 0);
		int idx5 = string8.indexOf('e', 2);
		
		//int indexOf(String str) �־��� ���ڿ��� �����ϴ��� Ȯ���Ͽ� �� ��ġ(index)�� �˷���. ������ -1�� ��ȯ(index ���� ��ȣ�� 0)
		 String string9 = "ABCDFEG";
		 int idx6 = string9.indexOf("DF"); //3
		 
		 //int lastIndexOf(int ch) ������ ���� �Ǵ� �����ڵ带 ���ڿ��� ������ ���������� ã�Ƽ� ��ġ(index)�� �˷���. ��ã���� -1�� ��ȯ
		 String string10 = "java.lang.Object";
		 int idx7 = string10.lastIndexOf("."); //9
		 int idx8 = string10.indexOf("."); //4
		 
		 //int lastIndexOf(String str) ������ ���ڿ��� �ν��Ͻ��� ���ڿ� ���������� ã�� ��ġ(index)�� �˷���. �� ã���� -1�� ��ȯ
		 string10 = "java.lang.Object";
		 int idx9 = string10.lastIndexOf("java"); //10
		 int idx10 = string10.indexOf("java"); //0
		 
		 //int length() ���ڿ��� ����
		 String string11 = "Hello";
		 int length = string11.length(); //5
		 
		 //String[] split(String regex) ���ڿ��� ������ �и���(regex)�� ������ ���ڿ� �迭�� ��� ��ȯ
		 String animal = "dog,cat,pig";
		 String[] arr = animal.split(",");
		 for(String a : arr) {
			 System.out.println(a);
		 }
		 
		 //String[] split(String regex, int limit) ���ڿ��� ������ �и���(regex)�� ������ ���ڿ��迭�� ��� ��ȯ. ��, ���ڿ� ��ü�� ������ ��(limit)�� �ڸ�
		 String [] arr1 = animal.split(",", 2);
		 for(String x : arr1) {
			 System.out.println(x);
		 }
		 
		 //boolean startsWith(String prefix) �־��� ���ڿ�(prefix)�� �����ϴ��� �˻�
		 String string12 = "java.lang.Object";
		 boolean b6 = string12.startsWith("java"); //ture
		 boolean b7 = string12.startsWith("Object"); //false
		 
		 //String substring(int begin), String substring(int begin, int end) �־��� ������ġ(begin)���� �� ��ġ(end) ������ ���Ե� ���ڿ��� ����. �̶� ������ġ�� ���ڴ� ������ ���Ե����� �� ��ġ�� ���ڴ� ���Ե��� ����(begin <= x < end)
		 String string13 = "java.lang.Object";
		 String s1 = string13.substring(10); //Object
		 String s2 = string13.substring(5, 9); //lang
		 
		 //String toLowerCase() String �ν��Ͻ��� ����Ǿ� �ִ� ��� ���ڿ��� �ҹ��ڷ� ��ȯ�Ͽ� ��ȯ
		 String a = "Hello";
		 String a1 = a.toLowerCase(); //hello
		 
		 //String toUpperCase() String �ν��Ͻ��� ����Ǿ� �ִ� ��� ���ڿ��� �빮�ڷ� ��ȯ�Ͽ� ��ȯ
		 a = "Hello";
		 String a2 = a.toUpperCase(); //HELLO
		 
		 //String trim() ���ڿ��� ���� ���� ������ ���� �ִ� ������ ���� ����� ��ȯ. ��, ���ڿ� �߰��� �ִ� ������ ���ŵ��� ����
		 String a3 = "                    Hello       World                        ";
		 String a4 = a3.trim(); //Hello       World
		 
		 //static String valueOf(Object obj) ������ ���� ���ڿ��� ��ȯ�Ͽ� ��ȯ. ���� ������ ��� toString()�� ȣ���� ����� ��ȯ
		
	}

}
