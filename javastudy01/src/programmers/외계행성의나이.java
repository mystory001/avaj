package programmers;

public class 외계행성의나이 {
	
	public static void main(String[] args) {

		int age = 51;
		String answer = "";
		String ageString = age+"";
//		System.out.println(ageString);
		
		//a = 0, b = 1, c = 2, d = 3, e = 4
		//f = 5, g = 6, h = 7, i = 8, j = 9
		
		for(int i = 0; i < ageString.length(); i++) {
			if(ageString.charAt(i)=='0') {
				answer+="a";
			} else if(ageString.charAt(i)=='1'){
				answer+="b";
			} else if(ageString.charAt(i)=='2'){
				answer+="c";
			} else if(ageString.charAt(i)=='3'){
				answer+="d";
			} else if(ageString.charAt(i)=='4'){
				answer+="e";
			} else if(ageString.charAt(i)=='5'){
				answer+="f";
			} else if(ageString.charAt(i)=='6'){
				answer+="g";
			} else if(ageString.charAt(i)=='7'){
				answer+="h";
			} else if(ageString.charAt(i)=='8'){
				answer+="i";
			} else {
				answer+="j";
			}
			
		}
		System.out.println(answer);
		
		//다른 사람 풀이
		StringBuilder sb = new StringBuilder();
		while(age>0) {
			sb.insert(0, (char)((age%10)+(int)'a'));
			age/=10;
		}
		
		
	}

}
