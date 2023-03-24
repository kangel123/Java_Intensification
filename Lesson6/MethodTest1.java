package Lesson6;

public class MethodTest1 {
	
	public static void iamMethod() {	// MethodTest클래스에 생성된 메소드
		System.out.printf("메소드라 불러줘요~~\n");
	}
	
	public static void main(String[] args) {		// 실행할 메인 메소드
		MethodTest1.iamMethod();	// MethodTest 클래스에서 iamMethod함수 호출
		iamMethod();	// 현재 클래스(MethodTest) iamMethod 호출
	}
}
