package programmers;

public class 등차수열의특정한항만더하기 {
	
	public static void main(String[] args) {

		int a = 3;
		int d = 4;
		boolean[] included = {true, false, false, true, true};
		//3 + 15 + 19 = 
		
		int answer = 0;
		
		for(int i = 0; i < included.length; i++) {
			if(included[i]) {
				answer += a+((included[i]?i*1:0)*d);
			}
		}
		System.out.println(answer);
		
		
		
	}

}
