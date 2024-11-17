package programmers;

public class 자연수뒤집어배열로만들기 {
	
	public static void main(String[] args) {

//		long n = 12345;
//		long n1 = n;
//		int size = 0;
//		
//		while(n1>0) {
//			n1 =n1/10;
//			size++;
//		}
//		
//		int[] answer = new int[size];
//
//		for(int i = 0; i< size; i++) {
//			answer[i] = (int)(n%10);
//			n = n/10;
//		}
//		
//		for(int a : answer) {
//			System.out.println(a + ",");
//		}
		
		//테스트1, 테스트4 에서 문제가 생긴다. 분명 문제에 대한 코드를 작성한게 맞고, 테스트케이스를 추가해봐도 문제가 없는데?
		//이 문제에 대해서 다른 풀이를 확인해보았다. 
		long n = 12345;
		//n을 String으로 변환하고 그 뒤집은 값을 배열로 변환
		String str = Long.toString(n); //이 부분에서 위의 코드와 차이점
		System.out.println(str);
		
		int[] answer = new int[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			answer[i] = str.charAt(str.length()-1 -i) - '0';
		}
		
		for(int a : answer) {
			System.out.println(a + ",");
		}
		
		//이 문제는 long형의 변수를 어떻게 처리할건지에 대해서 물어보는 문제
		//따라서 처리 방법을 물어봄. 내가 작성한 방법은 이 부분이 빠져있어 해결이 되지 않았음
		
	}

}
