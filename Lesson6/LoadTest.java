package Lesson6;

public class LoadTest {

	static String kopo09_name = "폴리융"; // 이름은 전역변수로 선언

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLode kopo09_ol = new OverLode(); // 클래스 OverLode의 객체 생성
		int[] kopo09_march = { 100, 100, 100 }; // 3월 성적
		int[] kopo09_april = { 100, 100, 100, 100 }; // 4월 성적
		int[] kopo09_may = { 100, 100, 100, 100, 100 }; // 5월 성적

		// 3월 성적표
		title(3, 3); // 3월의 3개의 과목의 타이틀
		grade(kopo09_march); // 3월의 점수 출력
		System.out.printf("%d  %4.1f\n", kopo09_ol.sum(kopo09_march[0], kopo09_march[1], kopo09_march[2]),	// 3월 총점
				kopo09_ol.ave(kopo09_march[0], kopo09_march[1], kopo09_march[2])); // 3월 평균
		// 4월 성적표
		title(4, 4); // 4월의 4개의 과목의 타이틀
		grade(kopo09_april); // 4월의 점수 출력
		System.out.printf("%d  %4.1f\n", kopo09_ol.sum(kopo09_april[0], kopo09_april[1], kopo09_april[2], kopo09_april[3]),	// 4월 총점
				kopo09_ol.ave(kopo09_april[0], kopo09_april[1], kopo09_april[2], kopo09_april[3])); // 4월 평균

		// 5월 성적표
		title(5, 5); // 5월의 5개의 과목의 타이틀
		grade(kopo09_may); // 5월의 점수 출력
		System.out.printf("%d  %4.1f\n",kopo09_ol.sum(kopo09_may[0], kopo09_may[1], kopo09_may[2], kopo09_may[3], kopo09_may[4]), // 5월 총점
				kopo09_ol.ave(kopo09_may[0], kopo09_may[1], kopo09_may[2], kopo09_may[3], kopo09_may[4])); // 5월 평균

	}

	// 타이틀 출력
	public static void title(int kopo09_month, int kopo09_count) { // 월과 과목 개수
		String[] kopo09_subject = { "국어", "영어", "수학", "과학", "사회" }; // 과목배열
		System.out.printf("%d월 성적표\n", kopo09_month); // 월 출력
		System.out.printf("================================================\n");

		System.out.printf("이름   "); // 이름은 기본으로 생성
		for (int kopo09_i = 0; kopo09_i < kopo09_count; kopo09_i++) { // 과목개수에 맞춰 생성
			System.out.printf("%s  ", kopo09_subject[kopo09_i]);
		}
		System.out.printf("총점  평균\n"); // 총점과 평균도 기본으로 생성
		System.out.printf("================================================\n");

	}

	// 점수 출력
	public static void grade(int[] kopo09_grade) { // 과목 점수 배열
		System.out.printf("%s  ", kopo09_name); // 이름은 전역변수에 선언된 이름으로
		for (int i = 0; i < kopo09_grade.length; i++) { // 과목 수 만큼
			System.out.printf("%d   ", kopo09_grade[i]); // 점수들 출력
		}
	}
}
