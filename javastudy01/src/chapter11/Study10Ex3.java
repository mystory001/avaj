package chapter11;

import java.util.TreeSet;

public class Study10Ex3 {
	
	public static void main(String[] args) {

		TreeSet set = new TreeSet();
		int[] score = {80,95,55,45,30,65,100,0};
		
		for(int i = 0; i<score.length;i++) {
			set.add(new Integer(score[i]));
		}
		
		System.out.println("50보다 작은 값 : " + set.headSet(50));
		System.out.println("50보다 큰 값 : " + set.tailSet(50));
	}

}
