package chapter06;

//�����ڰ� �ϳ��� ���� ����, �����Ϸ��� �⺻ ������ �ڵ� �߰�
//Ŭ������ �������� �� �⺻ �����ڸ� �ۼ����ִ� ������ ������
class Data_1{
	int value;
	Data_1(){} //�⺻������
}

class Data_2{
	int vaule;
	
	Data_2(){} //�⺻������
	Data_2(int x){ //�Ű������� �ִ� ������
		vaule = x;
	}
}


public class Study17Ex1 {

	public static void main(String[] args) {
		Data_1 data_1 = new Data_1();
		Data_2 data_2 = new Data_2(); //�⺻ ������ ȣ��-> �⺻�����ڰ� ���� ������ ���� �߻�

	}

}
