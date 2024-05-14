package chapter11;

import java.util.*;

public class Study11Ex1 {

	public static void main(String[] args) {

		HashMap map = new HashMap();
		map.put("id1", "1234");
		map.put("id2", "1234");
		map.put("id2", "0000");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("id와 pw를 입력");
		while (true) {
			System.out.println("id : ");
			String id = sc.nextLine().trim();
			
			System.out.println("pw : ");
			String pw = sc.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("입력한 id는 존재하지 않음. 다시 입력");
				continue;
			}
			if(!(map.get(id)).equals(pw)) {
				System.out.println("pw 불일치. 다시 입력");
			} else {
				System.out.println("id와 pw 일치. 프로그램 종료합니다.");
				break;
			}
			
		}
		
		
	}

}
