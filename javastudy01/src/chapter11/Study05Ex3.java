package chapter11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Study05Ex3 {
	
	static Queue queue = new LinkedList();
	static final int MAX_SIZE = 5;
	
	public static void save(String input) {
	if(!"".equals(input))
		queue.offer(input);
	
	if(queue.size()>MAX_SIZE)
		queue.remove();
	}
	public static void main(String[] args) {

		System.out.println("help를 입력하면 도움말을 확인");
		
		while(true) {
			System.out.print(">>");
			try {
				Scanner sc = new Scanner(System.in);
				String input = sc.nextLine().trim();
				
				if("".equals(input)) continue;
				if(input.equalsIgnoreCase("q")) {
					System.exit(0);
				} else if(input.equalsIgnoreCase("help")){
					System.out.println("help : 도움말");
					System.out.println("q 또는 Q : 프로그램 종료");
					System.out.println("history : 최근 입력한 명령어 " + MAX_SIZE + "개를 보여줌");
				} else if(input.equalsIgnoreCase("history")) {
					save(input);
					LinkedList list = (LinkedList)queue;
//					for(int i = 0; i<list.size();i++) //list.size()를 계속해서 불러오기 때문에 좋지 않은 코드 아래와 같이 해주도록 권장
					final int SIZE = list.size();
					for(int i= 0 ; i<SIZE ; i++)
						System.out.println((i+1)+"."+list.get(i));
				} else {
					save(input);
					System.out.println(input);
				}
				
			} catch (Exception e) {
				System.out.println("입력 오류");
			}
		}
		
		
	}

}
