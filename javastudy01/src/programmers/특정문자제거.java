package programmers;

public class Ư���������� {

	public static void main(String[] args) {
		
		String a ="dfeLrLJffd";
		String del = "L";
		
		String answer = a.replaceAll(del, "");
		System.out.println(answer);
		
		//�ٸ� Ǯ��
		for(char c : del.toCharArray()) {
			a = a.replace(String.valueOf(c), "");
		}
		
	}

}
