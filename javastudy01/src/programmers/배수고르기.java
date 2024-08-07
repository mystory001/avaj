package programmers;

public class 배수고르기 {
	
	public static void main(String[] args) {

		int n = 3;
		int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
		
		int cnt = 0;
		
		int[] answer = {};
		int[] temp=new int[numlist.length];
		for(int i = 0; i < numlist.length;i++) {
			if(numlist[i]%n==0) {
				temp[i]= numlist[i];
				cnt++;
			}
		}
//		System.out.println(cnt);
		int idx = 0;
		answer = new int[cnt];
		for(int val : temp) {
			if(val!=0) {
				answer[idx++] = val;
			}
		}
		
		for(int x : answer) {
			System.out.println(x);
		}
		
	}

}
