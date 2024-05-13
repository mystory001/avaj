package chapter11;

import java.util.TreeSet;

public class Study10Ex2 {
	
	public static void main(String[] args) {

		TreeSet set = new TreeSet();
		String from = "b";
		String to = "d";
		
		set.add("abc"); set.add("apple");
		set.add("blue"); set.add("Blue");
		set.add("Car"); set.add("cat");
		set.add("elephant"); set.add("elevator");
		set.add("flower"); set.add("first");
		
		System.out.println(set); //[Blue, Car, abc, apple, blue, cat, elephant, elevator, first, flower]
		System.out.println("range search : from " + from + " to " + to);
		System.out.println("result1 : " + set.subSet(from, to)); //result1 : [blue, cat]
		System.out.println("result2 : " + set.subSet(from, to + "r")); //result2 : [blue, cat]
	}

}
