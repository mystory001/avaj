package chapter11;

import java.util.*;

public class Study11Ex1 {

	public static void main(String[] args) {

		HashMap map = new HashMap();
		map.put("id1", "1234");
		map.put("id2", "1234");
		map.put("id2", "0000");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("id�� pw�� �Է�");
		while (true) {
			System.out.println("id : ");
			String id = sc.nextLine().trim();
			
			System.out.println("pw : ");
			String pw = sc.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("�Է��� id�� �������� ����. �ٽ� �Է�");
				continue;
			}
			if(!(map.get(id)).equals(pw)) {
				System.out.println("pw ����ġ. �ٽ� �Է�");
			} else {
				System.out.println("id�� pw ��ġ. ���α׷� �����մϴ�.");
				break;
			}
			
		}
		
		
	}

}
