package chapter14;

/**
 * *스트림의 연산
 * -스트림이 제공하는 기능 : 중간연산, 최종연산
 * 중간연산
 * Stream<T> distinct() : 중복 제거
 * Stream<T> filter(Predicate<T> predicate) : 조건에 안 맞는 요소 제외
 * Stream<T> limit(long maxSize) : 스트림의 일부를 잘라냄
 * Stream<T> skip(long n) : 스트림의 일부를 건너뜀
 * Stream<T> peek(Consumer<T> action) : 스트림 요소에 작업 수행
 * Stream<T> sorted(), Stream<T> sorted(Comparator<T> comparator) : 스트림의 요소를 정렬
 * 스트림의 요소를 변환
 * Stream<R> map(Function<T,R> mapper)
 * DoubleStream mapToDouble(ToDoubleFunction<T> mapper)
 * IntStream mapToInt(ToIntFunction<T> mapper)
 * LongStream mapToLong(ToLongFunction<T> mapper)
 * Stream<R> flatMat(Function<T, Stream<R>> mapper)
 * DoubleStream flatMapToDouble(Function<T,DoubleStream> m)
 * IntStream flatMapToInt(Function<T, IntStream> m)
 * LongStream flatMapToLong(Function<T, LongStream> m)
 * 
 * 최종연산
 * void forEach(Consumer<? super T> action), void forEachOrdered(Consumer<? super ?) action) : 각 요소에 지정된 작업 수행(병렬일 때 forEachOrdered)
 * long count() : 스트림의 요소의 개수 반환
 * Optional <T> max/min(Conparator<? super T> comparator) : 스트림의 최대값/최소값을 반환
 * Optional <T> findAny() : 스트림의 요소 아무거나 하나를 반환
 * Optional <T> findFirst() : 스트림의 첫 번째 요소 하나를 반환
 * boolean allMatch(Predicate <T> p) : 주어진 조건을 모두 만족하는지 확인
 * boolean anyMatch(Predicate<T> p) : 주어진 조건 중 하나라도 만족하는지 확인
 * boolean noneMatch(Predicate<T> p) : 주어진 조건을 모두 만족하지 않는지 확인
 * Object[] toArray(), A[] toArray(IntFunction<A[]> generator) : 스트림의 모든 요소를 배열로 반환
 * Optional<T> reduce(BinaryOperator<T> accumulator), T reduce(T identity, BinaryOperator<T> accumulator),
 * U reduce(U identity, BiFunction<U,T,U> accumulator, BinaryOperator<U> combiner : 스트림의 요소를 하나씩 줄여가면서 리듀싱 계산
 * R collect(Collector<T,A,R> collector), R collect(Supplier<R> supplier, BiConsumer<R,T> accumulator, BiConsumer<R,R> combiner) : 스트림의 요소를 수집. 주로 요소를 그룹화하거나 분할한 결과를 컬렉션에 담아 반환하는데 사용
 */

public class Study8_1 {

}
