package chapter13;

import java.util.ArrayList;

/**
 * *wait()와 notify()
 * -동기화의 효율을 높이기 위해 wait(), notify()를 사용
 * wait() 기다리기, notify() 통보, 알려주기
 * -Object클래스에 정의되어 있으며, 동기화 블록 내에서만 사용할 수 있음
 * wait() : 객체의 lock을 풀고 쓰레드를 해당 객체의 waiting pool에 넣음
 * notify() : waiting pool에서 대기중인 쓰레드 중의 하나를 깨움
 * notifyAll() : waiting pool에서 대기중인 모든 쓰레드를 깨움
 */

class Customer implements Runnable {
	private Table table;
	private String food;

	Customer(Table table, String food) {
		this.table = table;  
		this.food  = food;
	}

	public void run() {
		while(true) {
			try { Thread.sleep(10);} catch(InterruptedException e) {}
			String name = Thread.currentThread().getName();
			
			if(eatFood())
				System.out.println(name + " ate a " + food);
			else 
				System.out.println(name + " failed to eat. :(");
		} // while
	}

	boolean eatFood() { return table.remove(food); }
}

class Cook implements Runnable {
	private Table table;
	
	Cook(Table table) {	this.table = table; }

	public void run() {
		while(true) {
			// 임의의 요리를 하나 선택해서 table에 추가한다.
			int idx = (int)(Math.random()*table.dishNum());
			table.add(table.dishNames[idx]);

			try { Thread.sleep(1);} catch(InterruptedException e) {}
		} // while
	}
}

class Table {
	String[] dishNames = { "donut","donut","burger" }; // donut이 더 자주 나온다.
	final int MAX_FOOD = 6;  // 테이블에 놓을 수 있는 최대 음식의 개수
	
private ArrayList<String> dishes = new ArrayList<>();

	public void add(String dish) {
		// 테이블에 음식이 가득찼으면, 테이블에 음식을 추가하지 않는다.
		if(dishes.size() >= MAX_FOOD)	
			return;
		dishes.add(dish);
		System.out.println("Dishes:" + dishes.toString());
	}

	public boolean remove(String dishName) {
		// 지정된 요리와 일치하는 요리를 테이블에서 제거한다. 
		for(int i=0; i<dishes.size();i++)
			if(dishName.equals(dishes.get(i))) {
				dishes.remove(i);
				return true;
			}

		return false;
	}

	public int dishNum() { return dishNames.length; }
}

public class 쓰레드10_1 {
	
	public static void main(String[] args) {

		Table table = new Table(); // 여러 쓰레드가 공유하는 객체

		new Thread(new Cook(table), "COOK1").start();
		new Thread(new Customer(table, "도넛"),  "CUST1").start();
		new Thread(new Customer(table, "햄버거"), "CUST2").start();
	
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// 0.1초(100 밀리 세컨드) 후에 강제 종료시킨다.
		System.exit(0);
		
	}

}
