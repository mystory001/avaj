package chapter12;

public class Study03 {
	
	public static void main(String[] args) {

		//���׸� ���
		//Box<T> : ���׸� Ŭ����. 'T�� Box' �Ǵ� 'T Box' ��� ����
		//T : Ÿ�� ���� �Ǵ� Ÿ�� �Ű�����.(T�� Ÿ�� ����)
		//Box : ���� Ÿ��(raw type). �Ϲ� Ŭ���� -> ���׸� Ŭ����
		//class Box<T>{} : ���׸� Ŭ���� ����
		//Box<String> b = new Box<String>(); : ���׸� Ÿ�� ȣ��. String ���Ե� Ÿ��(�Ű�����ȭ�� Ÿ��, parameterized type). ������ ������ �ٲ� �� ����
		
		//���׸� Ÿ�԰� ������
		//���� ������ �������� ���Ե� Ÿ���� ��ġ
		//Array<Tv> list = new ArrayList<Tv>();
		//ArrayList<Product> list = new ArrayList<Tv>(); //����
		//���׸� Ŭ���� ���� �������� ����(���Ե� Ÿ���� ��ġ�ؾ���)
		//List <Tv> list = new ArrayList<Tv>(); //ArrayList�� List�� ����(������)
		//List<Tv> list = new LinkedList<Tv>(); //LinkedList�� List�� ����(������)
		//�Ű������� �������� ����
		//ArrayList<Product> list = new ArrayList<Product>();
		//list.add(new Product());
		//list.add(new Tv());
		//list.add(new Audio());
		
		
	}

}
