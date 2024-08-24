package chapter14;

/**
 * *��Ʈ��
 * -�پ��� �����ͼҽ�(�÷���, �迭)�� ǥ��ȭ�� ������� �ٷ�� ���� ��
 * List,Set,Map ������� ���� �ʾ����� ��Ʈ���� ���� ������� ���Ͻ�Ŵ
 * Stream �� �߰� ����(n��) �� ��������(1��, ���)
 * ��Ʈ�� �۾� : ��Ʈ�� ����� �� �߰����� �� ��������
 * Stream<T> Collection stream()
 * List<Integer> list = Arrays.asList{1,2,3,4,5};
 * Stream<Integer> intStream = list.stream(); //�÷���
 * Stream<String> strStream = Stream.of(new String[]{"a","b","c"}); //�迭
 * Stream<Integer> evenStream = Stream.iterate(0, n -> n+2); //0,2,4,6,8,...
 * Steram<Double> randomStream = Stream.generate(Math::random);
 * IntStream intStream = new Random().ints(5); //ũ�Ⱑ 5�� ���� ��Ʈ��
 * -��Ʈ���� �����ϴ� ���
 * �߰� ���� : �������� ��Ʈ���� ����. �ݺ������� ���밡��
 * ���� ���� : �������� ��Ʈ���� �ƴ� ����. �� �� ���� ���밡��(��Ʈ���� ��Ҹ� �Ҹ�)
 * String[] strArr={"dd","aaa","cc","CC","b"};
 * Stream<String> stream = Stream.of(strArr); //���ڿ� �迭�� �ҽ��� ��Ʈ��
 * Stream<String> filteredStream = stream.filter(); //�ɷ�����(�߰�����)
 * Stream<String> distinctedStream = stream.distinct(); //�ߺ�����(�߰�����)
 * Stream<String> sortedStream = stream.sort(); //����(�߰�����)
 * Stream<String> limitedStream = stream.limit(5); //��Ʈ���ڸ���(�߰�����)
 * int total = stream.count(); //��� ���� ����(���� ����)
 */

/**
 * *��Ʈ���� Ư¡
 * -��Ʈ���� ������ �ҽ��κ��� �����͸� �б⸸�� �� �������� ����
 * ������ �������� �ʰ� ���� �б⸸ ��
 * List<Integer> list = Arrays.asList(3,1,5,2,4);
 * List<Integer> sortedList = list.stream().sorted() //list�� ����
  							.collect(Collectors.toList()); //���ο� List�� ����
 * System.out.println(list); // [3,1,5,2,4]
 * System.out.println(sortedList); //[1,2,3,4,5]
 * -Iteratoró�� ��ȸ��(�� �� ����ϸ� �ٽ� ��Ʈ���� �����ؾ���)
 * strStream.forEach(System.out::println); //��� ��Ҹ� ȭ�鿡 ���(��������)
 * int numOfStr = strStream.count(); //���� ��Ʈ���� ��������
 * -���� ���� ������ �߰������� ������� ����. ������ ����
 * IntStream intStream = new Random().ints(1,46); //1~45������ ���� ��Ʈ��
 * IntStream.distinct().limit(6).sorted() //�߰�����
  		.forEach(i->System.out.println(i+", ")); //��������
 * -��Ʈ���� �۾��� ���� �ݺ����� ó����
 * -�۾��� ���ķ� ó�� - ���� ��Ʈ��(��Ƽ������)
 * -�⺻�� ��Ʈ�� - IntStream, LongStream, DoubleStream
 * ����ڽ� & ��ڽ��� ��ȿ���� ���ŵ�(Stream<Integer> ��� IntStream ���)
 * ���ڿ� ���õ� ������ �޼ҵ带 Stream<T>���� �� ���� ����
 */

public class Study6_1 {

}
