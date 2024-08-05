package programmers;

public class 모음제거 { //다시 풀어보기
	
	public static void main(String[] args) {

		String string1 = "hello world";
		String answer = "";
		String[] x = {"a","e","i","o","u"};
		
		//replaceAll()
		answer = string1.replaceAll("[aeiou]", ""); //[]정규표현식
//		answer = string1.replaceAll("a|e|i|o|u", "");
		System.out.println(answer);
		
		//다른 풀이
		 for(String a : x){
	            if(string1.contains(a)){
	                string1 = string1.replace(a, "");            }
	     }
		
		//다른 풀이
        string1 = string1.replace("a", "");
        string1 = string1.replace("e", "");
        string1 = string1.replace("i", "");
        string1 = string1.replace("o", "");
        string1 = string1.replace("u", "");
		 
		
	}

}
