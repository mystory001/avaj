package programmers;

public class 수조작하기2 {

	public static void main(String[] args) {
		
		int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
		String answer = "";
		//wsdawsdassw
		//"w" : 수에 1을 더한다.
		//"s" : 수에 1을 뺀다.
		//"d" : 수에 10을 더한다.
		//"a" : 수에 10을 뺀다.
		
		//i = 1 했을 때 i와 i-1을 비교해서 얼마만큼 증감되었는가를 비교 해야할 듯
		
		for(int i = 1; i < numLog.length; i++) {
			if(numLog[i]==numLog[i-1]+1) {
				answer+="w";
			} else if(numLog[i]==numLog[i-1]-1) {
				answer+="s";
			} else if(numLog[i]==numLog[i-1]+10) {
				answer+="d";
			} else if(numLog[i]==numLog[i-1]-10){
				answer+="a";
			}
		}
		
		System.out.println(answer);
		
		//또 다른 답변
		for(int i = 1; i < numLog.length; i++) {
			switch(numLog[i]-numLog[i-1]) {
				case 1 : 
					answer +="w";
					break;
				case -1 :
					answer+="s";
					break;
				case 10 : 
					answer+="d";
					break;
				case -10 :
					answer+="a";
					break;
				default :
					break;
			}
		}
		System.out.println(answer);
		
	}

}
