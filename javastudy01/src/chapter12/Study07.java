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
//		b = (Box)bStr;			//Box<String> �� Box ����. ���
//		bStr = (Box<String>)b;	//Box �� Box<String> ����. ���
		
//		FruitBox<Fruit> fruitbox = new FruitBox<Fruit>();
		FruitBox<? extends Fruit> fruitbox = (FruitBox<? extends Fruit>)new FruitBox<Fruit>(); //Ÿ�� ����ġ�� (FruitBox<? extends Fruit>)���������� ����
		FruitBox<Apple> applebox = new FruitBox<Apple>(); //����
//		FruitBox<? extends Fruit> applebox = new FruitBox<Apple>(); //����
		FruitBox<Apple> appleBox1 = (FruitBox<Apple>)applebox; //����. ���߻�
		

		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
//		FruitBox<Grape> grapeBox = new FruitBox<Apple>(); // ����. Ÿ�� ����ġ
//		FruitBox<Toy>   toyBox    = new FruitBox<Toy>();   // ����.

		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
//		appleBox.add(new Grape());  // ����. Grape�� Apple�� �ڼ��� �ƴ�
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
