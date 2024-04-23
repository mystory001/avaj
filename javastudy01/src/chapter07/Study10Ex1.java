package chapter07;

class Time{
	//접근 제어자를 private으로 하여 외부에서 직접 접근하지 못하도록 함
	private int hour;
	private int minute;
	private int second;
	
	//메서드를 통해서 iv에 접근. 메서드를 통해 간접 접근 허용 
	public int getHour() {
		return hour;
	}
	
	public void setHour(int hour) {
		if(isNotValidHour(hour)) {
			return;
		}
		this.hour = hour;
	}

	//매개변수로 넘겨지 hour가 유효한지 확인해서 알려주는 메서드
	private boolean isNotValidHour(int hour) {
		return hour < 0 || hour >24;
	}
	
}

public class Study10Ex1 {
	
	public static void main(String[] args) {

		Time time = new Time();
//		time.hour = -1;
		time.setHour(21); //hour의 값을 21로 변경
		System.out.println(time.getHour());
		time.setHour(100);
		System.out.println(time.getHour());
		
	}
	
}
