package chapter07;

class PointS5E4{
	int x;
	int y;
	
	PointS5E4(){
		this(0,0); //OK
	}
	
	PointS5E4(int x, int y){
		//super(); 조상 기본 생성자 호출
		this.x = x;
		this.y = y;
	}
}

public class Study05Ex4 {

}
