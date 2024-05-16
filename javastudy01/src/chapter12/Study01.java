package chapter12;

public class Study01 {

	public static void main(String[] args) {
	
		//제네릭(지네릭, Generics)
		//컴파일 시 타입을 체크해주는 기능
		//Tv객체만 저장할 수 있는 ArrayList를 생성
		/*
		 ArrayList<Tv> tvList = new ArrayList<Tv>();
		 
		 tvList.add(new Tv());
//		 tvList.add(new Audio()); //컴파일 에러. Tv 외 다른 타입 불가
		 */
		//객체의 타입 안정성을 높이고 형변환의 번거로움을 줄여줌
		//※런타임 에러 < 컴파일 에러 -> 수정이 가능하기 때문에 런타임 에러를 컴파일 에러가 나게끔 하는 것이 포인트
		
	}
	
}
