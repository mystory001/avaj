package programmers;

public class ���￡���輭��ã�� {
	
	public static void main(String[] args) {

		String[] seoul = {"Jane", "" ,"Kim"};
		String answer = "";
		int x = 0;
		
		for(int i = 0; i < seoul.length; i++) {
			if(seoul[i].equals("Kim")) {
				x = i;
			}
		}
		
		answer = "�輭���� " + x +"�� �ִ�";
		
		System.out.println(answer);
		
		
	}

}
