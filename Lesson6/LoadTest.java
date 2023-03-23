package Lesson6;

public class LoadTest {
	
	static String name = "폴리융";	// 이름은 전역변수로 선언

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLode ol = new OverLode(); // 클래스 OverLode의 객체 생성
		int[] march = { 100, 100, 100 }; // 3월 성적
		int[] april = { 100, 100, 100, 100 }; // 4월 성적
		int[] may = { 100, 100, 100, 100, 100 }; // 5월 성적

		// 3월 성적표
		title(3, 3);	// 3월의 3개의 과목의 타이틀
		grade(march);	// 3월의 점수 출력
		System.out.printf("%d  %4.1f\n", ol.sum(march[0], march[1], march[2]), ol.ave(march[0], march[1], march[2]));	// 3월 총점, 평균
		// 4월 성적표
		title(4, 4);	// 4월의 4개의 과목의 타이틀
		grade(april);	// 4월의 점수 출력
		System.out.printf("%d  %4.1f\n", ol.sum(april[0], april[1], april[2],april[3]), ol.ave(april[0], april[1], april[2],april[3]));	// 3월 총점, 평균
		
		// 5월 성적표
		title(5, 5);	// 5월의 5개의 과목의 타이틀
		grade(may);	// 5월의 점수 출력
		System.out.printf("%d  %4.1f\n", ol.sum(may[0], may[1], may[2], may[3], may[4]), ol.ave(may[0], may[1], may[2], may[3], may[4]));	// 3월 총점, 평균
		
	}

	// 타이틀 출력
	public static void title(int month, int count) { // 월과 과목 개수
		String[] subject = { "국어", "영어", "수학", "과학", "사회" };	// 과목배열
		System.out.printf("%d월 성적표\n", month);	// 월 출력
		System.out.printf("================================================\n");

		System.out.printf("이름   ");	// 이름은 기본으로 생성
		for (int i = 0; i < count; i++) {	// 과목개수에 맞춰 생성
			System.out.printf("%s  ", subject[i]);
		}
		System.out.printf("총점  평균\n");	// 총점과 평균도 기본으로 생성
		System.out.printf("================================================\n");

	}

	// 점수 출력
	public static void grade(int[] grade) {	// 과목 점수 배열
		System.out.printf("%s  ", name);	// 이름은 전역변수에 선언된 이름으로
		for (int i = 0; i < grade.length; i++) {	// 과목 수 만큼 
			System.out.printf("%d   ", grade[i]);	// 점수들 출력
		}
	}
}
