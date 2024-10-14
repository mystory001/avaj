package programmers;

public class A강조하기 {

	public static void main(String[] args) {

		String myString = "PrOgRaMmErS";
		String answer = "";
		
		answer = myString.toLowerCase();
		answer.replace('a', 'A');
		System.out.println(answer);
		
//		
//		for(int i = 0; i<myString.length();i++) {
//			if(answer.charAt(i)=='a') {
//				answer.replaceAll("a", "A");
//			}
//		}
//		System.out.println(answer);
		
	}
	
}
