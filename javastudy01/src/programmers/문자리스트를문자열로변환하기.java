package programmers;

public class ���ڸ���Ʈ�����ڿ��κ�ȯ�ϱ� {
	
	public static void main(String[] args) {

		String[] arr = {"a","b","c"};
		String answer = "";
		
		for(int i = 0; i<arr.length;i++) {
			answer += arr[i];
		}

		System.out.println(answer);
		
		//�ٸ� Ǯ��
		String.join("", arr);
		
	}

}
