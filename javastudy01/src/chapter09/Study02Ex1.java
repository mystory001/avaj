package chapter09;

class Value{
	int value;
	
	public Value() {}
	
	public Value(int value) {
		this.value = value;
	}

	//Object의 equals()를 오버라이딩해서 주소가 아닌 value를 비교
	public boolean equals(Object obj) {
    	//return this == obj; //주소 비교. 서로 다른 객체는 항상 거짓
        //참조변수의 형변환 전에는 반드시 instanceof로 확인
		if(obj instanceof Value)
			return false;
		Value v = (Value)obj; //obj를 value로 형 변환
		return this.value == v.value;
		
	}
	
}

public class Study02Ex1 {

	public static void main(String[] args) {

		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		//서로 다른 두 객체는 항상 주소가 다름
		System.out.println(v1.equals(v2));
		
	}
	
}