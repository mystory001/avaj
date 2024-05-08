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

		System.out.println("help�� �Է��ϸ� ������ Ȯ��");
		
		while(true) {
			System.out.print(">>");
			try {
				Scanner sc = new Scanner(System.in);
				String input = sc.nextLine().trim();
				
				if("".equals(input)) continue;
				if(input.equalsIgnoreCase("q")) {
					System.exit(0);
				} else if(input.equalsIgnoreCase("help")){
					System.out.println("help : ����");
					System.out.println("q �Ǵ� Q : ���α׷� ����");
					System.out.println("history : �ֱ� �Է��� ��ɾ� " + MAX_SIZE + "���� ������");
				} else if(input.equalsIgnoreCase("history")) {
					save(input);
					LinkedList list = (LinkedList)queue;
//					for(int i = 0; i<list.size();i++) //list.size()�� ����ؼ� �ҷ����� ������ ���� ���� �ڵ� �Ʒ��� ���� ���ֵ��� ����
					final int SIZE = list.size();
					for(int i= 0 ; i<SIZE ; i++)
						System.out.println((i+1)+"."+list.get(i));
				} else {
					save(input);
					System.out.println(input);
				}
				
			} catch (Exception e) {
				System.out.println("�Է� ����");
			}
		}
		
		
	}

}
