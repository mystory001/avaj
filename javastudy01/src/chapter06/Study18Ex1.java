package chapter06;
//������ this()

class Car{
	String color; //����
	String type; //���ӱ� ����
	int door; //������ ��

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
