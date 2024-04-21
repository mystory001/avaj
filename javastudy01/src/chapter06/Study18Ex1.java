package chapter06;
//생성자 this()

class Car{
	String color; //색상
	String type; //변속기 종류
	int door; //차문의 수

	Car(String color, String type, int door){
		this.color = color;
		this.type = type;
		this.door = door;
	}
	
	Car(){
		this("white", "auto", 4);
	}
	
	Car(String color){
		this(color, "auto", 4);
	}

}


public class Study18Ex1 {
	
	public static void main(String[] args) {

		
		
	}

}
