package chapter12;

public class Study05 {

	public static void main(String[] args) {
		/*
		
		*���ѵ� ���׸� Ŭ����
		-extends�� ������ �� �ִ� Ÿ���� ����
		ex) class FruitBox<T extends Fruit>{ //Fruit �ڼո� Ÿ������ ��������
				ArrayList<T> list = new ArrayList<T>();
				(...����...)
			}
			
			FruitBox<Apple> appleBox = new FruitBox<Apple>();
			FruitBox<Toy> toyBox = new FruitBox<Toy>(); //Toy�� Fruit�� �ڼ��� �ƴϹǷ� ����
			
		-�������̽��� ��� extends�� ���. 'implement'�� ������� ����	
		ex) interface Eatable{}
			class FruitBox<T extends Eatable>{~~~}
		
		*���׸��� ����
		-Ÿ�� ������ ������ �ν��Ͻ� ���� �ٸ��� ����
		ex) Box<Apple> appleBox = new Box<Apple>(); //Apple ��ü�� ���尡��
			Box<Grape> grapeBox = new Box<Grape>(); //Grape ��ü�� ���尡��
		-1) static ����� Ÿ�� ���� ��� �Ұ� static ����� ��� �ν��Ͻ��� ����
		class Box<T>{
			static T item; //����
			static int compare(T t1, T t2){~~~} //����
			...
		}	
		-2) �迭, ��ü ������ �� Ÿ�� ���� ���Ұ�. Ÿ�� ������ �迭 ������ ����
			new T => ��ü ����, �迭 ���� X, new ������ �ڿ����� ���� Ÿ���� Ȯ���Ǿ� �־����. T�� ��� ���� Ÿ���� Ȯ���Ǿ� ���� ����
		ex) class Box<T>{
				T[] itemArr; // TŸ���� �迭�� ���� ��������. ���� ����
				...
				T[] toArray(){
					T[] tmpArr = new T[itemArr.length]; //���� �Ұ�
				}
			}
		*/
	}

}
