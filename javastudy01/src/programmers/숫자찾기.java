package programmers;

public class ����ã�� {
	
	public static void main(String[] args) {

		int num = 23156;
		int k = 1;
		int answer = 0;
		
		String numString = num+"";
		String kString = k+"";
		
		if(numString.indexOf(kString)==-1) {
			answer = -1;
		} else {
			answer = numString.indexOf(kString)+1;
		}
			
		System.out.println(answer);
		
		//�ٸ� Ǯ��
		//int answer = numStr.indexOf(kStr);
	    //answer < 0 ? -1 : answer + 1 ;
		
	}

}
