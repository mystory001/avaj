package chapter05;

public class Study6 {
	
	public static void main(String[] args) {

		//커맨드 라인을 통해 입력받기
		//커맨드 라인에 입력한 값이 문자열 배열에 담겨서 전달
		System.out.println("매개변수의 개수 : " + args.length);
		for(int i = 0; i<args.length; i++) {
			System.out.println("args[" + i + "] = \"" + args[i] + "\"");
		}
		
	}

}
