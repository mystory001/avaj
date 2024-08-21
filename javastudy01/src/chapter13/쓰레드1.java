package chapter13;

/**
 * *프로세스와 쓰레드
 * -프로세스 : 실행중인 프로그램. 자원(resource)과 쓰레드로 구성
 * -쓰레드 : 프로세스 내에서 실제 작업을 수행. 모든 프로세스는 최소한 하나의 쓰레드를 가지고 있음
 * -프로세스 ≒ 공장, 쓰레드 ≒ 일꾼
 * -싱글 쓰레드 프로세스 : 자원 + 1개의 쓰레드
 * -멀티 쓰레드 프로세스 : 자원 + n개의 쓰레드
 */

/**
 * *멀티쓰레드의 장단점
 * -장점
 * 시스템 자원을 보다 효율적으로 사용할 수 있음
 * 사용자에 대한 응답성(responseness)이 향상됨
 * 작업이 분리되어 코드가 간결해짐
 * -단점
 * 동기화(synchronization)에 주의해야함
 * 교착상태(dead-lock)가 발생하지 않도록 주의해야함. 기아 현상 발생
 * 각 쓰레드가 효율적으로 고르게 실행될 수 있게 해야함
 */

public class 쓰레드1 {
	
	public static void main(String[] args) {
		
	}

}
