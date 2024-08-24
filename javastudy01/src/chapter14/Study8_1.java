package chapter14;

/**
 * *��Ʈ���� ����
 * -��Ʈ���� �����ϴ� ��� : �߰�����, ��������
 * �߰�����
 * Stream<T> distinct() : �ߺ� ����
 * Stream<T> filter(Predicate<T> predicate) : ���ǿ� �� �´� ��� ����
 * Stream<T> limit(long maxSize) : ��Ʈ���� �Ϻθ� �߶�
 * Stream<T> skip(long n) : ��Ʈ���� �Ϻθ� �ǳʶ�
 * Stream<T> peek(Consumer<T> action) : ��Ʈ�� ��ҿ� �۾� ����
 * Stream<T> sorted(), Stream<T> sorted(Comparator<T> comparator) : ��Ʈ���� ��Ҹ� ����
 * ��Ʈ���� ��Ҹ� ��ȯ
 * Stream<R> map(Function<T,R> mapper)
 * DoubleStream mapToDouble(ToDoubleFunction<T> mapper)
 * IntStream mapToInt(ToIntFunction<T> mapper)
 * LongStream mapToLong(ToLongFunction<T> mapper)
 * Stream<R> flatMat(Function<T, Stream<R>> mapper)
 * DoubleStream flatMapToDouble(Function<T,DoubleStream> m)
 * IntStream flatMapToInt(Function<T, IntStream> m)
 * LongStream flatMapToLong(Function<T, LongStream> m)
 * 
 * ��������
 * void forEach(Consumer<? super T> action), void forEachOrdered(Consumer<? super ?) action) : �� ��ҿ� ������ �۾� ����(������ �� forEachOrdered)
 * long count() : ��Ʈ���� ����� ���� ��ȯ
 * Optional <T> max/min(Conparator<? super T> comparator) : ��Ʈ���� �ִ밪/�ּҰ��� ��ȯ
 * Optional <T> findAny() : ��Ʈ���� ��� �ƹ��ų� �ϳ��� ��ȯ
 * Optional <T> findFirst() : ��Ʈ���� ù ��° ��� �ϳ��� ��ȯ
 * boolean allMatch(Predicate <T> p) : �־��� ������ ��� �����ϴ��� Ȯ��
 * boolean anyMatch(Predicate<T> p) : �־��� ���� �� �ϳ��� �����ϴ��� Ȯ��
 * boolean noneMatch(Predicate<T> p) : �־��� ������ ��� �������� �ʴ��� Ȯ��
 * Object[] toArray(), A[] toArray(IntFunction<A[]> generator) : ��Ʈ���� ��� ��Ҹ� �迭�� ��ȯ
 * Optional<T> reduce(BinaryOperator<T> accumulator), T reduce(T identity, BinaryOperator<T> accumulator),
 * U reduce(U identity, BiFunction<U,T,U> accumulator, BinaryOperator<U> combiner : ��Ʈ���� ��Ҹ� �ϳ��� �ٿ����鼭 ����� ���
 * R collect(Collector<T,A,R> collector), R collect(Supplier<R> supplier, BiConsumer<R,T> accumulator, BiConsumer<R,R> combiner) : ��Ʈ���� ��Ҹ� ����. �ַ� ��Ҹ� �׷�ȭ�ϰų� ������ ����� �÷��ǿ� ��� ��ȯ�ϴµ� ���
 */

public class Study8_1 {

}
