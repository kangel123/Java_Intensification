package Lesson6;

public class OverLode { // 오버로딩 연습

	public static int sum(int kopo09_a, int kopo09_b, int kopo09_c) { // 3개의 합
		return kopo09_a + kopo09_b + kopo09_c;	// 총점 반환
	}

	public static int sum(int kopo09_a, int kopo09_b, int kopo09_c, int kopo09_d) { // 4개의 합
		return kopo09_a + kopo09_b + kopo09_c + kopo09_d;	// 총점 반환
	}

	public static int sum(int kopo09_a, int kopo09_b, int kopo09_c, int kopo09_d, int kopo09_e) { // 5개의 합
		return kopo09_a + kopo09_b + kopo09_c + kopo09_d + kopo09_e;	// 총점 반환
	}

	public static double ave(int kopo09_a, int kopo09_b, int kopo09_c) { // 3개의 평균
		return sum(kopo09_a, kopo09_b, kopo09_c) / 3.0; // 위 sum(1번째)함수에 값을 넣어 반환된 결과의 평균을 반환
	}

	public static double ave(int kopo09_a, int kopo09_b, int kopo09_c, int kopo09_d) { // 4개의 평균
		return sum(kopo09_a, kopo09_b, kopo09_c, kopo09_d) / 4.0;// 위 sum(2번째)함수에 값을 넣어 반환된 결과의 평균을 반환
	}

	public static double ave(int kopo09_a, int kopo09_b, int kopo09_c, int kopo09_d, int kopo09_e) { // 5개의 평균
		return sum(kopo09_a, kopo09_b, kopo09_c, kopo09_d, kopo09_e) / 5.0;// 위 sum(3번째)함수에 값을 넣어 반환된 결과의 평균을 반환
	}
}
