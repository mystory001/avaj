package exercise.chapter06;

//getTotal(), getAverage()를 추가
class Student2{
	String name; //학생이름
	int ban; //반
	int no; //번호
	int kor; //국어점수
	int eng; //영어점수
	int math; //수학점수
	
	int getTotal() { //국어,영어,수학의 점수를 모두 더해서 반환
		return kor+eng+math;
	}
	
	float getAverage() { //총점을 과목수로 나눈 평균을 구함
		return (float) ((int)(((getTotal()/3.0F)*10+0.5)))/10;
	}
	
}

public class Ex04 {

	public static void main(String[] args) {
		
		Student2 s = new Student2();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름 : " + s.name);
		System.out.println("총점 : " + s.getTotal());
		System.out.println("평균 : " + s.getAverage());

	}

}
