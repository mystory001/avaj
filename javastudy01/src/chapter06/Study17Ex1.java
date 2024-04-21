package chapter06;

//생성자가 하나도 없을 때만, 컴파일러가 기본 생성자 자동 추가
//클래스를 생성했을 때 기본 생성자를 작성해주는 습관을 가지자
class Data_1{
	int value;
	Data_1(){} //기본생성자
}

class Data_2{
	int vaule;
	
	Data_2(){} //기본생성자
	Data_2(int x){ //매개변수가 있는 생성자
		vaule = x;
	}
}


public class Study17Ex1 {

	public static void main(String[] args) {
		Data_1 data_1 = new Data_1();
		Data_2 data_2 = new Data_2(); //기본 생성자 호출-> 기본생성자가 없기 때문에 에러 발생

	}

}
