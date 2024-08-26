package chapter14;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;

/**
 * *��Ʈ���� �׷�ȭ�� ����
 * -partitioningBy()�� ��Ʈ���� 2����
 * Collector partitioningBy(Predicate predicate)
 * Collector partitioningBy(Predicate predicate, Collector downstream)
 * -groupingBy()�� ��Ʈ���� n����
 * Collector groupingBy(Function classifier)
 * Collector groupingBy(Function classifier, Collector downstream)
 * Collector groupingBy(Function classifier, Supplier mapFactory, Collector downstream)
 */

class Student14_1{
	String name;
	boolean isMale; //����
	int grade;
	int ban;
	int score;
	
	Student14_1(String name, boolean isMale, int grade, int ban, int score) {
		this.name = name;
		this.isMale = isMale;
		this.grade = grade;
		this.ban = ban;
		this.score = score;
	}
	
	String getName() {return name;}
	boolean getIsMale() {return isMale;}
	int getGrage() {return grade;}
	int getBan() {return ban;}
	int getScore() {return score;}
	
	public String toString() {
		return String.format("[%s, %s, %d�г� %d��, %3d��]", name,isMale?"��":"��",grade,ban,score);
	}
	
	//groupingBy()���� ���
	enum Level{HIGH,MID,LOW}
	
}

public class Study14_1 {

	public static void main(String[] args) {
		Student14_1[] stuArr = {
				new Student14_1("A", false, 1, 1, 300),
				new Student14_1("B", true, 1, 1, 200),
				new Student14_1("C", false, 1, 1, 250),
				new Student14_1("D", true, 1, 2, 100),
				new Student14_1("E", true, 1, 2, 150),
				new Student14_1("F", true, 1, 2, 300),
				new Student14_1("G", true, 1, 2, 300),
				new Student14_1("H", false, 1, 3, 300),
				new Student14_1("I", false, 1, 3, 200),
				new Student14_1("J", true, 1, 3, 180),
				new Student14_1("K", true, 2, 1, 300),
				new Student14_1("L", false, 2, 1, 190),
				new Student14_1("M", false, 2, 1, 270),
				new Student14_1("N", true, 2, 2, 230),
				new Student14_1("O", true, 2, 2, 250),
				new Student14_1("P", true, 2, 2, 200),
				new Student14_1("Q", false, 2, 3, 170),
				new Student14_1("R", false, 2, 3, 300),
				new Student14_1("S", true, 2, 3, 180)
		};
		
		System.out.println("1. �ܼ��׷�ȭ(�ݺ��� �׷�ȭ)");
		Map<Integer, List<Student14_1>> stuByBan = Stream.of(stuArr)
				                                     .collect(groupingBy(Student14_1::getBan));
		for(List<Student14_1> ban : stuByBan.values()) {
			for(Student14_1 s:ban) {
				System.out.println(s);
			}
		}
		
		System.out.println();
		
		System.out.printf("%n2. �ܼ��׷�ȭ(�������� �׷�ȭ)%n");
		Map<Student14_1.Level, List<Student14_1>> stuByLevel = Stream.of(stuArr)
				.collect(groupingBy(s-> {
						 if(s.getScore() >= 200) return Student14_1.Level.HIGH;
					else if(s.getScore() >= 100) return Student14_1.Level.MID;
					else                         return Student14_1.Level.LOW;
				}));

		TreeSet<Student14_1.Level> keySet = new TreeSet<>(stuByLevel.keySet());

		for(Student14_1.Level key : keySet) {
			System.out.println("["+key+"]");

			for(Student14_1 s : stuByLevel.get(key))
				System.out.println(s);
			System.out.println();
		}

		System.out.printf("%n3. �ܼ��׷�ȭ + ���(������ �л���)%n");
		Map<Student14_1.Level, Long> stuCntByLevel = Stream.of(stuArr)
				.collect(groupingBy(s-> {
						 if(s.getScore() >= 200) return Student14_1.Level.HIGH;
					else if(s.getScore() >= 100) return Student14_1.Level.MID;
					else                         return Student14_1.Level.LOW;
				}, counting()));

		for(Student14_1.Level key : stuCntByLevel.keySet())
			System.out.printf("[%s] - %d��, ", key, stuCntByLevel.get(key));
		System.out.println();
/*
		for(List<Student14_1> level : stuByLevel.values()) {
			System.out.println();
			for(Student s : level) {
				System.out.println(s);
			}
		}
*/
		System.out.printf("%n4. ���߱׷�ȭ(�г⺰, �ݺ�)%n");
		Map<Integer, Map<Integer, List<Student14_1>>> stuByGradeAndBan =
          Stream.of(stuArr)
				.collect(groupingBy(Student14_1::getGrage,
						 groupingBy(Student14_1::getBan)
				));

		for(Map<Integer, List<Student14_1>> hak : stuByGradeAndBan.values()) {
			for(List<Student14_1> ban : hak.values()) {
				System.out.println();
				for(Student14_1 s : ban)
					System.out.println(s);
			}
		}

		System.out.printf("%n5. ���߱׷�ȭ + ���(�г⺰, �ݺ� 1��)%n");
		Map<Integer, Map<Integer, Student14_1>> topStuByHakAndBan = Stream.of(stuArr)
				.collect(groupingBy(Student14_1::getGrage,
						 groupingBy(Student14_1::getBan,
							collectingAndThen(
								maxBy(comparingInt(Student14_1::getScore)),
								Optional::get
							)
						)
				));

		for(Map<Integer, Student14_1> ban : topStuByHakAndBan.values())
			for(Student14_1 s : ban.values())
				System.out.println(s);

		System.out.printf("%n6. ���߱׷�ȭ + ���(�г⺰, �ݺ� �����׷�)%n");
		Map<String, Set<Student14_1.Level>> stuByScoreGroup = Stream.of(stuArr)
			.collect(groupingBy(s-> s.getGrage() + "-" + s.getBan(),
					mapping(s-> {
						 if(s.getScore() >= 200) return Student14_1.Level.HIGH;
					else if(s.getScore() >= 100) return Student14_1.Level.MID;
						 else                    return Student14_1.Level.LOW;
					} , toSet())
			));

		 Set<String> keySet2 = stuByScoreGroup.keySet();

		for(String key : keySet2) {
			System.out.println("["+key+"]" + stuByScoreGroup.get(key));
		}
		
	}
		
}
