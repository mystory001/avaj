package programmers;

public class ����������Ư�����׸����ϱ� {
	
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
