package chapter13;

/**
 * *�������� ����ȭ(synchronization)
 * -��Ƽ ������ ���μ��������� �ٸ� �������� �۾��� ������ ��ĥ �� ����
 * -�������� �۾��� �ٸ� �����忡�� �������� �ʰ� �Ϸ��� '����ȭ'�� �ʿ�
 * �ؾ������� ����ȭ : �� �����尡 �������� �ٸ� �۾��� �ٸ� �����尡 �������� ���ϰ� ���� ��
 * -����ȭ�Ϸ��� �������� �ʾƾ� �ϴ� ������� '�Ӱ� ����'���� ����
 * -�Ӱ迵���� ��(lock)�� ���� �� �ϳ��� �����常 ���԰���(��ü 1���� �� 1��)
 */

/**
 * *synchronized�� �̿��� ����ȭ
 * -synchronized�� �Ӱ迵��(lock�� �ɸ��� ����)�� �����ϴ� ���0
 */
////1. �޼ҵ� ��ü�� �Ӱ迵������ ������ �ּ�ȭ�ؾ��� 1���� 1���� ������
//public synchronized void sum(){
//	//....
//}
//
////2. Ư�� ������ �Ӱ迵������ ����
//synchronized(��ü�� ��������){
//	//....
//}


class Account{
	private int balance = 1000; //private���� �ؾ� ����ȭ�� �ǹ̰� ����
	
	public synchronized int getBalance() {
		return balance;
	}
	
//	public void withdraw(int money) {
	public synchronized void withdraw(int money) { //synchronized�� �޼ҵ带 ����ȭ
		if(balance>=money) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			balance-=money;
		}
	}
}

class Runnable9_1 implements Runnable{
	Account account = new Account();
	public void run() {
		while(account.getBalance()>0) {
			//100,200,300 �� �� ���� ���Ƿ� �����ؼ� ���
			int money = (int)(Math.random()*3+1)*100;
			account.withdraw(money);
			System.out.println("balance : " + account.getBalance());
		}
	}
}

public class ������9_1 {
	
	public static void main(String[] args) {

		Runnable r = new Runnable9_1();
		new Thread(r).start(); //ThreadGroup�� ���� �����ǹǷ� gc����� �ƴ�
		new Thread(r).start(); //ThreadGroup�� ���� �����ǹǷ� gc����� �ƴ�
		
		
	}

}
