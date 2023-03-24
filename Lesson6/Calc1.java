package Lesson6;

// 오버로딩 : 매개변수의 개수와 타입이 다르면 함수이름이 같아도 
// 프로그램이 알아서 적합한 메소드를 찾아서 수행한다.

public class Calc1 {
	
	// 매개변수 2개일 경우
	public int sum(int kopo09_a, int kopo09_b) {
		return kopo09_a + kopo09_b;	// 2개의 합 반환
	}

	// 매개변수 3개일 경우
	public int sum(int kopo09_a, int kopo09_b, int kopo09_c) {
		return kopo09_a + kopo09_b + kopo09_c;	// 3개의 합 반환
	}
	
	// 매개변수 4개일 경우
	public int sum(int kopo09_a, int kopo09_b, int kopo09_c, int kopo09_d) {
		return kopo09_a + kopo09_b + kopo09_c + kopo09_d;	// 4개의 합 반환
	}
	
	// 매개변수가 double형인 경우
	public double sum(double kopo09_a, double kopo09_b) {
		return kopo09_a + kopo09_b;	// 더블형으로 2개의 합 반환
	}
	
}
