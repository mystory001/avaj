package chapter12;

import java.util.ArrayList;

interface Eatable{}

class Fruit implements Eatable{
	public String toString() {return "Fruit";}
}

class Apple extends Fruit{public String toString() {return"Apple";}}
class Grape extends Fruit{public String toString() {return"Grape";}}
class Toy				 {public String toString() {return"Toy";}}

public class Study07 {

	public static void main(String[] args) {
		
//		Box b = null; //Box b = new Box<String>();
//		Box<String> bStr = null;
//		b = (Box)bStr;			//Box<String> → Box 가능. 경고
//		bStr = (Box<String>)b;	//Box → Box<String> 가능. 경고
		
//		FruitBox<Fruit> fruitbox = new FruitBox<Fruit>();
		FruitBox<? extends Fruit> fruitbox = (FruitBox<? extends Fruit>)new FruitBox<Fruit>(); //타입 불일치로 (FruitBox<? extends Fruit>)들어가야하지만 생략
		FruitBox<Apple> applebox = new FruitBox<Apple>(); //가능
//		FruitBox<? extends Fruit> applebox = new FruitBox<Apple>(); //가능
		FruitBox<Apple> appleBox1 = (FruitBox<Apple>)applebox; //가능. 경고발생
		

		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
//		FruitBox<Grape> grapeBox = new FruitBox<Apple>(); // 에러. 타입 불일치
//		FruitBox<Toy>   toyBox    = new FruitBox<Toy>();   // 에러.

		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
//		appleBox.add(new Grape());  // 에러. Grape는 Apple의 자손이 아님
		grapeBox.add(new Grape());

		System.out.println("fruitBox "+fruitBox);
		System.out.println("appleBox "+appleBox);
		System.out.println("grapeBox "+grapeBox);		
	}
}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {}

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item)  { list.add(item);      }
	T get(int i)      { return list.get(i); }
	int size()        { return list.size();  }
	public String toString() { return list.toString();}
}
