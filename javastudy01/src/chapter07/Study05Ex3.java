package chapter07;

class PointS5E3{
	int x, y;
	
	PointS5E3(int x, int y) {
		//iv 초기화
		this.x = x;
		this.y = y;
	}
}

class Point3DS5E3 extends PointS5E3{
	int z;
	
//	모든 생성자는 첫 줄에 다른 생성자를 호출. 따라서 기본 생성자 작성은 필수
//	Point3DS5E3(int x, int y, int z){
//		this.x = x; //조상 멤버 초기화
//		this.y = y; //조상 멤버 초기화
//		this.z = z;
//	}
	
	//자손의 생성자
	Point3DS5E3(int x, int y,int z){
		super(x, y); //조상클래스의 생성자 PointS5E3(int x, int y)를 호출
		this.z = z; //자신의 멤버를 초기화
	}
}




public class Study05Ex3 {

}
