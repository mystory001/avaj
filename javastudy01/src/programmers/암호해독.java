package programmers;

public class ��ȣ�ص� {
	
	public static void main(String[] args) {

		//��ȣȭ�� ���ڿ� cipher
		//code�� ��� ��° ���ڸ� ��¥ ��ȣ
		
		String cipher = "pfqallllabwaoclk";
		int code = 2;
		String answer = "";
		
		for(int i = code-1;i<cipher.length();i+=code) {
			answer += cipher.charAt(i);
		}
		System.out.println(answer);
		
		//�ٸ� Ǯ�� 1
        for (int i = code; i <= cipher.length(); i = i + code) {
            answer += cipher.substring(i - 1, i);
        }
        
        //�ٸ� Ǯ�� 2
        for(int i =0; i<cipher.length(); i++){
            if((i+1)%code==0) answer += cipher.charAt(i);
        }
        
        
		
		
	}

}
