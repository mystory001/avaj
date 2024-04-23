package chapter07;

class Time{
	//���� �����ڸ� private���� �Ͽ� �ܺο��� ���� �������� ���ϵ��� ��
	private int hour;
	private int minute;
	private int second;
	
	//�޼��带 ���ؼ� iv�� ����. �޼��带 ���� ���� ���� ��� 
	public int getHour() {
		return hour;
	}
	
	public void setHour(int hour) {
		if(isNotValidHour(hour)) {
			return;
		}
		this.hour = hour;
	}

	//�Ű������� �Ѱ��� hour�� ��ȿ���� Ȯ���ؼ� �˷��ִ� �޼���
	private boolean isNotValidHour(int hour) {
		return hour < 0 || hour >24;
	}
	
}

public class Study10Ex1 {
	
	public static void main(String[] args) {

		Time time = new Time();
//		time.hour = -1;
		time.setHour(21); //hour�� ���� 21�� ����
		System.out.println(time.getHour());
		time.setHour(100);
		System.out.println(time.getHour());
		
	}
	
}
