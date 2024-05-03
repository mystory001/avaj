package chapter09;

public class Study04 {
	
	public static void main(String[] args) {

		//String 생성자

		//String(String s) 주어진 문자열(s)을 갖는 String 인스턴스를 생성
		String string = new String("Hello");
		
		//String(char[] value) 주어진 문자열(value)을 갖는 String 인스턴스를 생성
		char[] c = {'H','e','l','l','o'};
		String string2 = new String(c);
		
		//String(StringBuffer buf) StringBuffer 인스턴스가 갖고 있는 문자열과 같은 내용의 String 인스턴스를 생성
		StringBuffer sb = new StringBuffer("Hello");
		String string3 = new String(sb);
		
		//char charAt(int index) 지정된 위치(index)에 있는 문자열을 알려줌. index는 0부터 시작
		String string4 = "Hello";
		String n = "0123456";
		char c1 = sb.charAt(1);
		char c2 = n.charAt(1);
		
		//int compareTo(String str) 문자열(str)과 사전순서로 비교. 같으면 0, 사전순으로 이전이면 음수, 이후면 양수로 반환
		int i1 = "aaa".compareTo("aaa");
		int i2 = "aaa".compareTo("bbb");
		int i3 = "bbb".compareTo("aaa");
		
		//String concat(String str) 문자열(Str)을 뒤에 덧붙임
		String string5 = "Hello";
		String string6 = string5.concat(" World");
		
		//boolean contains(CharSequence s) 지정된 문자열(s)이 포함되어 있는지 검사 ※interface CharSequence 
		String string7 = "asdfjklzxcvnriw";
		boolean b = string7.contains("sd"); //연속된 문자열 ad는 string7에는 포함되었지만 떨어져있어서 결과가 false로 반환
		
		//boolean endsWith(String suffix) 지정된 문자열(suffix)로 끝나는지를 검사
		String file = "Hello.txt";
		boolean b1 = file.endsWith("txt");
		
		//boolean equals(Object obj) 매개변수로 받은 문자열(obj)과 String 인스턴스의 문자열을 비교. obj가 String이 아니거나 문자열이 다르면 false로 반환
		String string8 = "Hello";
		boolean b2 = string8.equals("Hello"); //true
		boolean b3 = string8.equals("hello"); //false
		
		//boolean equalsIgnoreCase(String str) 문자열과 String 인스턴스의 문자열을 대소문자 구분없이 비교
		string8 = "Hello";
		boolean b4 = string8.equalsIgnoreCase("HELLO"); //true
		boolean b5 = string8.equalsIgnoreCase("hello"); //true
		
		//int indexOf(int ch) 주어진 문자(ch)가 문자열에 존재하는지 확인하여 위치(index)를 알려줌. 못찾으면 -1을 반환(index 시작 번호는 0). 대소문자 구분
		string8 = "Hello";
		int idx1 = string8.indexOf("o"); //4
		int idx2 = string8.indexOf("a"); //-1
		int idx3 = string8.indexOf("h"); //-1
		
		//int indexOf(int ch, int pos) 주어진 문자(ch)가 문자열에 존재하는지 지정된 위치(pos)부터 확인하여 위치(index)를 알려줌. 못찾으면 -1을 반환(index 시작 번호는 0)
		string8 = "Hello";
		int idx4 = string8.indexOf('e', 0);
		int idx5 = string8.indexOf('e', 2);
		
		//int indexOf(String str) 주어진 문자열이 존재하는지 확인하여 그 위치(index)를 알려줌. 없으면 -1을 반환(index 시작 번호는 0)
		 String string9 = "ABCDFEG";
		 int idx6 = string9.indexOf("DF"); //3
		 
		 //int lastIndexOf(int ch) 지정된 문자 또는 문자코드를 문자열의 오른쪽 끝에서부터 찾아서 위치(index)를 알려줌. 못찾으면 -1을 반환
		 String string10 = "java.lang.Object";
		 int idx7 = string10.lastIndexOf("."); //9
		 int idx8 = string10.indexOf("."); //4
		 
		 //int lastIndexOf(String str) 지정된 문자열을 인스턴스의 문자열 끝에서부터 찾아 위치(index)를 알려줌. 못 찾으면 -1을 반환
		 string10 = "java.lang.Object";
		 int idx9 = string10.lastIndexOf("java"); //10
		 int idx10 = string10.indexOf("java"); //0
		 
		 //int length() 문자열의 길이
		 String string11 = "Hello";
		 int length = string11.length(); //5
		 
		 //String[] split(String regex) 문자열을 지정된 분리자(regex)로 나누어 문자열 배열에 담아 반환
		 String animal = "dog,cat,pig";
		 String[] arr = animal.split(",");
		 for(String a : arr) {
			 System.out.println(a);
		 }
		 
		 //String[] split(String regex, int limit) 문자열을 지정된 분리자(regex)로 나누어 문자열배열에 담아 반환. 단, 문자열 전체를 지정된 수(limit)로 자름
		 String [] arr1 = animal.split(",", 2);
		 for(String x : arr1) {
			 System.out.println(x);
		 }
		 
		 //boolean startsWith(String prefix) 주어진 문자열(prefix)로 시작하는지 검사
		 String string12 = "java.lang.Object";
		 boolean b6 = string12.startsWith("java"); //ture
		 boolean b7 = string12.startsWith("Object"); //false
		 
		 //String substring(int begin), String substring(int begin, int end) 주어진 시작위치(begin)부터 끝 위치(end) 범위에 포함된 문자열을 얻음. 이때 시작위치의 문자는 범위에 포함되지만 끝 위치의 문자는 포함되지 않음(begin <= x < end)
		 String string13 = "java.lang.Object";
		 String s1 = string13.substring(10); //Object
		 String s2 = string13.substring(5, 9); //lang
		 
		 //String toLowerCase() String 인스턴스에 저장되어 있는 모든 문자열을 소문자로 변환하여 반환
		 String a = "Hello";
		 String a1 = a.toLowerCase(); //hello
		 
		 //String toUpperCase() String 인스턴스에 저장되어 있는 모든 문자열을 대문자로 변환하여 반환
		 a = "Hello";
		 String a2 = a.toUpperCase(); //HELLO
		 
		 //String trim() 문자열의 왼쪽 끝과 오른쪽 끝에 있는 공백을 없앤 결과를 반환. 단, 문자열 중간에 있는 공백은 제거되지 않음
		 String a3 = "                    Hello       World                        ";
		 String a4 = a3.trim(); //Hello       World
		 
		 //static String valueOf(Object obj) 지정된 값을 문자열로 변환하여 반환. 참조 변수의 경우 toString()을 호출한 결과를 반환
		
	}

}
