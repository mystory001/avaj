package chapter06;
//참조형 반환타입


class Data3{
	int x;
}

public class Study14Ex2 {
	
	static Data3 copy(Data3 d) { 
		Data3 temp = new Data3(); //새로운 객체 temp를 생성
		temp.x =  d.x; //d.x의 값을 temp.x에 복사
		return temp; //복사한 객체의 주소를 반환
	}

	public static void main(String[] args) {
		
		Data3 d = new Data3();
		d.x = 10;
		
		Data3 d2 = copy(d);
		System.out.println("d.x = " + d.x);
		System.out.println("d2.x = " + d2.x);

	}

}
