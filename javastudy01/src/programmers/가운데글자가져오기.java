package programmers;

public class ������ڰ������� {
	
	public static void main(String[] args) {

		String s = "qwer";
		String answer = "";
		
		//���� ���� ������ ���ٹ�� => if�� + for��
		//�ٸ� ���� ������δ� => StringBuilder?
		
		if(s.length()%2==0) {
			for(int i = s.length()/2-1 ; i<=s.length()/2; i++) {
				answer += s.charAt(i)+"";
			}
		} else {
			answer += s.charAt((int)s.length()/2);
		}
		System.out.println(answer);
		
		//�ٸ� Ǯ��1
		int length = s.length();
		
		if(length%2==0) {
			int mid = length/2;
			answer = s.substring(mid-1, mid+1);
		} else {
			int mid = length/2;
			answer = s.substring(mid, mid+1);
		}
		
		//�ٸ� Ǯ��2
		StringBuilder sb = new StringBuilder();
		if(s.length()%2==0) {
			sb.append(String.valueOf(s.charAt(s.length()/2-1)));
		}
		sb.append(String.valueOf(s.charAt(s.length()/2)));
		answer = sb.toString();
		
		//��ü������ valueOf�� substring���� Ǫ�� ����� ��
	}

}
