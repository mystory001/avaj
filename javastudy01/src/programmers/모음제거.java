package programmers;

public class �������� { //�ٽ� Ǯ���
	
	public static void main(String[] args) {

		String string1 = "hello world";
		String answer = "";
		String[] x = {"a","e","i","o","u"};
		
		//replaceAll()
		answer = string1.replaceAll("[aeiou]", ""); //[]����ǥ����
//		answer = string1.replaceAll("a|e|i|o|u", "");
		System.out.println(answer);
		
		//�ٸ� Ǯ��
		 for(String a : x){
	            if(string1.contains(a)){
	                string1 = string1.replace(a, "");            }
	     }
		
		//�ٸ� Ǯ��
        string1 = string1.replace("a", "");
        string1 = string1.replace("e", "");
        string1 = string1.replace("i", "");
        string1 = string1.replace("o", "");
        string1 = string1.replace("u", "");
		 
		
	}

}
