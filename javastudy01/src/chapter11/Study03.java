package chapter11;

public class Study03 {

	public static void main(String[] args) {
		
		//ArrayList
		//������ Vector�� ������ ������ ���������� ��������� ����
		//ArrayList ����ȭó���� �Ǿ� ���� �ʰ�, Vector�� ����ȭ ó�����Ǿ� ����
		//List �������̽��� �����ϹǷ�, ��������� �����ǰ� �ߺ��� ���
		//�������� ����������� �迭�� ���(�迭 ���)

		//ArrayList �޼���
		//������
		//ArrayList() //�⺻������
		//ArrayList(Collection c)
		//ArrayList(int initialCapacity) //�迭�� ����
		//�ر��̸� ó������ �˳��� ��Ƶδ� ���� ���Ŀ� �迭�� �ٽ� ����� ���� ������ �� �� �ֱ� ������ ����
		//�߰�
		//boolean add(Object o) 
		//void add(int index, Object element)
		//boolean addAll(Collection c)
		//boolean addAll(int index, Collection c)
		//����
		//boolean remove(Object o)
		//Object remove(int index)
		//boolean removeAll(Collection c)
		//void clear()
		//�˻�
		//int indexOf(obejct o)
		//int lastIndexOf(Object o)
		//boolean contains(Object o)
		//Object get(int index)
		//Object set(int index, Object element)
		
		//List subList(int fromIndex, int toIndex)
		//Object[] toArray()
		//Object[] toArray(Object[] a)
		//boolean isEmpty()
		//void trimToSize()
		//int size()
		
		//==============================
		
		//ArrayList�� ����� ��ü ���� ����
		//1. ������ ������ �Ʒ��� �����͸� �� ĭ�� ���� �����ؼ� ������ �����͸� ���
		//data[n]�� ����� data[n+1]���� data[n]���� �����ϰ� ���
		//2. �����Ͱ� ��� �� ĭ�� �̵������Ƿ� ������ �����ʹ� null�� ��ȯ
		//data[size-1] = null
		//3. �����Ͱ� �����Ǿ� �������� ������ �پ����Ƿ� size�� ���� ����
		//size--;
		//�ظ����� �����͸� �����ϴ� ��쿡�� 1�� ����(�迭�� ����)�� ����
		
		//ArrayList�� ����� ù ��° ��ü���� �����ϴ� ��� => �迭 ���� �߻�
		//list�� �ִ� ��ü�� �����ϴ� �ݺ���
//		for(int i = 0; i< list.size(); i++){
//			list.remove(i);
//		}
		//=> �迭 ���簡 �Ͼ�� ������ ��ü ��ü�� ���� �ȵ�.
		
		//ArrayList�� ����� ������ ��ü���� �����ϴ� ��� => �迭 ���� �߻� ����
//		for(int i = list.size()-1; i >= 0; i--){
//			list.remove(i);
//		}
		
	}

}
