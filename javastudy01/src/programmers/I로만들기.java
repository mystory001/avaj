package programmers;

public class I�θ���� {

	public static void main(String[] args) {
		
		String myString = "abcdevwxyz";
		
		//a = 97, l = 105 
		System.out.println((int)'l');
		
		String answer = "";
		
		for(int i = 0; i<myString.length(); i++) {
			if('a'<=myString.charAt(i)&&myString.charAt(i)<='k') {
				answer += "l";
			} else {
				answer += myString.charAt(i);
			}
		}
		
		System.out.println(answer);
		
		//�ٸ� ��� Ǯ�� => ����ǥ������ �̿�
//		myString.replaceAll("[a-l]", "l");

	}

}
