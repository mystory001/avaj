package chapter07;
//동물의 행동 : 움직이다, 먹다, 소리를 낸다.
class 동물{
	
	public 동물() {} //기본 생성자
	
	void 움직이다() {
		System.out.println("동물이 움직입니다.");
	}
	
	void 먹다() {
		System.out.println("동물이 사냥을 하고 식사를 합니다.");
	}
	
	void 소리를내다() {
		System.out.println("동물이 소리를 냅니다.");
	}
}

//사람
class 사람 extends 동물{

	@Override
	void 움직이다() {
		System.out.println("사람이 두 발로 걷습니다.");
	}

	@Override
	void 먹다() {
		System.out.println("사람이 음식을 해서 먹습니다.");
	}

	@Override
	void 소리를내다() {
		System.out.println("사람이 소리로 의사소통을 합니다.");
	}
	
	void 사용하다() {
		System.out.println("사람이 도구를 사용합니다.");
	}
	
}

class 소 extends 동물{

	@Override
	void 움직이다() {
		System.out.println("소가 네 발로 움직입니다.");
	}

	@Override
	void 먹다() {
		System.out.println("소가 풀을 뜯어 먹습니다.");
	}

	@Override
	void 소리를내다() {
		System.out.println("소 울음 소리");
	}
	
}

public class 다형성1 {
	
	public static void main(String[] args) {

		동물 a = new 동물();
		동물 b = new 사람();
		동물 c = new 소();
//		사람 d = new 동물(); => 사람 클래스의 멤버 4개, 동물 클래스 멤버 3개 => 사용할 수 없음. 서브 클래스형으로 슈퍼 클래스의 객체를 생성할 수 없다.
		
		if(c instanceof 소) {
			System.out.println("c instance of 소");
			((소)c).소리를내다();
		}
		
		
	}

}
