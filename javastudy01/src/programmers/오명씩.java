package programmers;

public class 오명씩 {

	public static void main(String[] args) {

		String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
//		String[] answer = {}; //앞에서부터 5명씩 묶은 그룹의 가장 앞에 서있는 사람들의 이름을 담는 리스트
		
		//1~5명 => 1명 name.length()%5
		//6~10명 => 2명
		//11명~15명 => 3명 
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
		
		//size를 삼항연산자로
		String[] answer1 = new String[names.length%5==0? names.length/5:(names.length/5) + 1];
		
		
	}

}
