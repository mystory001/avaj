package programmers;

public class 수조작하기1 {

	public static void main(String[] args) {
		
		int n = 0;
		String control = "wsdawsdassw";
		int answer = n;

		for(int i = 0; i < control.length(); i++){
		    if(control.charAt(i) == 'w'){
		        answer += 1;
		    } else if(control.charAt(i) == 's'){
		        answer -= 1;
		    } else if(control.charAt(i) == 'd'){
		        answer += 10;
		    } else if(control.charAt(i) == 'a'){
		        answer -= 10;
		    }
		}
		System.out.println(answer); 

		//다른풀이
//	  for(int i = 0 ; i < control.length(); i++){
//	            switch(control.charAt(i)){
//	                case 'w' : 
//	                    answer+=1;
//	                    break;
//	                case 's' :
//	                    answer-=1;
//	                    break;
//	                case 'a' :
//	                    answer-=10;
//	                    break;
//	                case 'd' :
//	                    answer+=10;
//	                    break;
//	                default :
//	                    break;
//	            }
//	        }

		
	}

}
