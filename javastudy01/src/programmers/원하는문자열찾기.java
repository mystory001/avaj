package programmers;

public class ���ϴ¹��ڿ�ã�� {
	
	public static void main(String[] args) {

		String myString = "AbCdEfG";
		String pat = "AbC";
		int answer = 0;
		
		if(myString.toLowerCase().contains(pat.toLowerCase())) {
			answer = 1;
		} else {
			answer = 0;
		}
		
		//�ٸ� Ǯ��
		//myString.toLowerCase().contains(pat.toLowerCase())?1:0;
		
	}

}
