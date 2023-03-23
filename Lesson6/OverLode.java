package Lesson6;

public class OverLode {	// 오버로딩 연습

	public static int sum(int a, int b, int c) {	// 3개의 합
		return a + b + c;
	}

	public static int sum(int a, int b, int c, int d) {	// 4개의 합
		return a + b + c + d;
	}

	public static int sum(int a, int b, int c, int d, int e) {	// 5개의 합
		return a + b + c + d + e;
	}

	public static double ave(int a, int b, int c) {	// 3개의 평균
		return (a + b + c)/3.0;
	}

	public static double ave(int a, int b, int c, int d) {	// 4개의 평균
		return (a + b + c + d)/4.0;
	}

	public static double ave(int a, int b, int c, int d, int e) {	// 5개의 평균
		return (a + b + c + d + e)/5.0;
	}
}
