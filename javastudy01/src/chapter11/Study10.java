package chapter11;

public class Study10 {

	public static void main(String[] args) {

		//TreeSet ���� Ž��, ����
		//���� Ž�� Ʈ��(binary search tree)�� ����. ���� Ž��(from ~ to)�� ���Ŀ� ����
		//���� Ʈ���� ��� ��尡 �ִ� 2���� ���� ��带 ����
		//�� ���(node)�� ����(tree)���·� ����(LinkedList�� ����)
		/*
		 class TreeNode{
		 	TreeNode left; //���� �ڽĳ��
		 	Object element; //������ ��ü
		 	TreeNode right; //������ �ڽĳ��
		 }
		 */
		
		//����Ž��Ʈ��(binary search tree)
		//�θ𺸴� ���� ���� ����, ū ���� �����ʿ� ����
		//�����Ͱ� ���������� �߰�, ������ �ð��� �� �ɸ�(�� Ƚ�� ����)
		
		//TreeSet ������ ������� boolean add(Object o)
		//HashSet�� equals() hashCode()�� ��, TreeSet�� compare()�� ȣ���ؼ� ��
		
		//TreeSet �ּ� �����ڿ� �޼���
		//TreeSet() : �⺻ ������
		//TreeSet(Collection c) : �־��� �÷����� �����ϴ� TreeSet�� ����
		//TreeSet(Comparator comp) : �־��� ���ı������� �����ϴ� TreeSet�� ����
		//Object first() : ���ĵ� �������� ù ��° ��ü�� ��ȯ
		//Object last() : ���ĵ� �������� ������ ��ü�� ��ȯ
		//Object ceiling(Object o) : ������ ��ü�� ���� ��ü ��ȯ. ������ ū ���� ���� ��ü �� ���� ����� ���� ��ȯ. ������ null
		//Object floor(Object o) : ������ ��ü�� ���� ��ü�� ��ȯ. ������ ���� ���� ���� ��ü �� ����� ���� ��ü�� ��ȯ. ������ null
		//Object higher(Object o) : ������ ��ü���� ū ���� ���� ��ü �� ����� ���� ��ü�� ��ȯ. ������ null
		//Object lower(Object o) : ������ ��ü���� ���� ���� ���� ��ü �� ����� ���� ��ü�� ��ȯ. ������ null
		//SortedSet subSet(Object fromElement, Object toElement) : ���� �˻�(from~to ����)�� ����� ��ȯ
		//SortedSet headSet(Object toElement) : ������ ��ü���� ���� ���� ��ü���� ��ȯ
		//SortedSet tailSet(Object fromElement): ������ ��ü���� ū ���� ��ü���� ��ȯ
		//+ add(), size(), remove(), isEmpty(), iterator()
		
		//Ʈ�� ��ȸ(tree traversal)
		//���� Ʈ���� ��� ��带 �� ���� �д� ��
		//���� ��ȸ, ���� ��ȸ, ���� ��ȸ�� ������, ���� ��ȸ�� �ϸ� ������������ ����
		//���� ��ȸ
		
	}
	
}
