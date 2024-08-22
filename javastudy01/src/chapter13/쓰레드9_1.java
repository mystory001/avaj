package chapter13;

/**
 * *쓰레드의 동기화(synchronization)
 * -멀티 쓰레드 프로세스에서는 다른 쓰레드의 작업에 영향을 미칠 수 있음
 * -진행중인 작업이 다른 쓰레드에게 간섭받지 않게 하려면 '동기화'가 필요
 * ※쓰레드의 동기화 : 한 쓰레드가 진행중인 다른 작업을 다른 쓰레드가 간섭하지 못하게 막는 것
 * -동기화하려면 간섭받지 않아야 하는 문장들을 '임계 영역'으로 설정
 * -임계영역은 락(lock)을 얻은 단 하나의 쓰레드만 출입가능(객체 1개에 락 1개)
 */

/**
 * *synchronized를 이용한 동기화
 * -synchronized로 임계영역(lock이 걸리는 영역)을 설정하는 방법0
 */
////1. 메소드 전체를 임계영역으로 지정→ 최소화해야함 1번의 1개의 쓰레드
//public synchronized void sum(){
//	//....
//}
//
////2. 특정 영역을 임계영역으로 지정
//synchronized(객체의 참조변수){
//	//....
//}


class Account{
	private int balance = 1000; //private으로 해야 동기화가 의미가 있음
	
	public synchronized int getBalance() {
		return balance;
	}
	
//	public void withdraw(int money) {
	public synchronized void withdraw(int money) { //synchronized로 메소드를 동기화
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
			//100,200,300 중 한 값을 임의로 선택해서 출금
			int money = (int)(Math.random()*3+1)*100;
			account.withdraw(money);
			System.out.println("balance : " + account.getBalance());
		}
	}
}

public class 쓰레드9_1 {
	
	public static void main(String[] args) {

		Runnable r = new Runnable9_1();
		new Thread(r).start(); //ThreadGroup에 의해 참조되므로 gc대상이 아님
		new Thread(r).start(); //ThreadGroup에 의해 참조되므로 gc대상이 아님
		
		
	}

}
