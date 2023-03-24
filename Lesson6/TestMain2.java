package Lesson6;

public class TestMain2 {

	public static void main(String[] args) {
		Calc1 kopo09_cc = new Calc1();	// Calc1클래스의 객체 생성
		System.out.printf("2개 덧셈이 호출됨 [%d]\n", kopo09_cc.sum(1, 2));	// Calc1의 1번 sum 메소드
		System.out.printf("3개 덧셈이 호출됨 [%d]\n", kopo09_cc.sum(1, 2, 3));	// Calc1의 2번 sum 메소드
		System.out.printf("4개 덧셈이 호출됨 [%d]\n", kopo09_cc.sum(1, 2, 3, 4));	// Calc1의 3번 sum 메소드
		System.out.printf("더블형 덧셈이 호출됨 [%f]\n", kopo09_cc.sum(1.3, 2.4));	// Calc1의 4번 sum 메소드
	}
}
