package Lesson6;

// 오버로딩 : 매개변수의 개수와 타입이 다르면 함수이름이 같아도 
// 프로그램이 알아서 적합한 메소드를 찾아서 수행한다.

public class Calc1 {
	
	// 매개변수 2개일 경우
	public int sum(int a, int b) {
		return a + b;
	}

	// 매개변수 3개일 경우
	public int sum(int a, int b, int c) {
		return a + b + c;
	}
	
	// 매개변수 4개일 경우
	public int sum(int a, int b, int c, int d) {
		return a + b + c + d;
	}
	
	// 매개변수가 double형인 경우
	public double sum(double a, double b) {
		return a + b;
	}
	
}
