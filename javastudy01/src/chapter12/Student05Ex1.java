package chapter12;

import java.util.ArrayList;

interface Eatable05Ex1{
	
}

class Fruit05Ex1 implements Eatable05Ex1{
	public String toString() {
		return "Fruit";
	}
}

class Apple05Ex1 extends Fruit05Ex1{
	public String toString() {
		return "Apple";
	}
}
class Grape05Ex1 extends Fruit05Ex1{
	public String toString() {
		return "Grape";
	}
}
class Toy{
}

class Box05Ex1<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {
		list.add(item);
	}
	T get(int i) {
		return list.get(i);
	}
	int size() {
		return list.size();
	}
	public String toString() {
		return list.toString();
	}
}

class FruitBox05Ex1<T extends Fruit05Ex1 & Eatable05Ex1> extends Box05Ex1<T>{
							//,를 쓰지 않고 &를 사용
}
	
public class Student05Ex1 {

	public static void main(String[] args) {
		
		FruitBox05Ex1<Fruit05Ex1> fruitBox = new FruitBox05Ex1();
		FruitBox05Ex1<Apple05Ex1> appleBox = new FruitBox05Ex1();
		FruitBox05Ex1<Grape05Ex1> grapeBox = new FruitBox05Ex1();
//		FruitBox05Ex1<Grape05Ex1> grapeBox1 = new FruitBox05Ex1<Apple05Ex1p>(); //타입 불일치
//		FruitBox05Ex1<Toy> toyBox = new FruitBox05Ex1(); // 에러
		
		fruitBox.add(new Fruit05Ex1());
		fruitBox.add(new Apple05Ex1());
		fruitBox.add(new Grape05Ex1());
		appleBox.add(new Apple05Ex1());
//		appleBox.add(new Grape05Ex1()); //Grape는 Apple의 자손이 아니기 때문에 에러
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(grapeBox);

	}

}
