package programmers;

public class ���� {

	public static void main(String[] args) {

		String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
//		String[] answer = {}; //�տ������� 5�� ���� �׷��� ���� �տ� ���ִ� ������� �̸��� ��� ����Ʈ
		
		//1~5�� => 1�� name.length()%5
		//6~10�� => 2��
		//11��~15�� => 3�� 
		int size = 0;
		if(names.length%5!=0) {
			size = (names.length/5) + 1;
		} else {
			size = (names.length/5);
		}

		String[] answer = new String[size];
		for(int i = 0; i<size; i++) {
			int idx = i*5;
			answer[i]=names[idx];
		}
		
		for(String a : answer) {
			System.out.println(a);
		}
		
		//size�� ���׿����ڷ�
		String[] answer1 = new String[names.length%5==0? names.length/5:(names.length/5) + 1];
		
		
	}

}
