package exercise.chapter06;

//생성자와 info() 추가
class Student3{
	String name; //학생이름
	int ban; //반
	int no; //번호
	int kor; //국어점수
	int eng; //영어점수
	int math; //수학점수
	
	public Student3() {} //기본생성자
	public Student3(String name, int ban, int no, int kor, int eng, int math) {
		this.name=name;
		this.ban=ban;
		this.no=no;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
	int getTotal() { //국어,영어,수학의 점수를 모두 더해서 반환
		return kor+eng+math;
	}
	
	float getAverage() { //총점을 과목수로 나눈 평균을 구함
		return (float) ((int)(((getTotal()/3.0F)*10+0.5)))/10;
	}
	
	String info() {
		return name+", "+ ban+", "+no+", "+ kor+", "+ eng+", "+math+", " +getTotal()+", "+ getAverage();
	}
	
}

public class Ex05 {

	public static void main(String[] args) {
		
		Student3 s = new Student3("홍길동", 1, 1, 100, 60, 76);
		System.out.println(s.info());

	}

}
