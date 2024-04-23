package chapter07;

class CarS12E1{
	String color;
	int door;
	
	void drive() {
		System.out.println("운전하는 기능");
	}
	
	void stop() {
		System.out.println("정지하는 기능");
	}
}

//		자식					부모
class FireTruckS12E1 extends CarS12E1{
	void water() {
		System.out.println("물을 뿌리는 기능");
	}
}

class AmbulanceS12E1 extends CarS12E1{
	void siren() {
		System.out.println("사이렌 울리는 기능");
	}
}

public class Study12Ex1 {
	
	public static void main(String[] args) {

		FireTruckS12E1 fireTruck = new FireTruckS12E1();
		CarS12E1 car = (CarS12E1)fireTruck; //조상(부모) 타입으로 형변환(생략 가능)
		FireTruckS12E1 fireTruck2 = (FireTruckS12E1)car; //자손(자식) 타입으로 형변환(생략 불가)
//		AmbulanceS12E1 ambulance = (AmbulanceS12E1)fireTruck; //상속관계가 아닌 클래스 간의 형변환 불가
		
	}

}
