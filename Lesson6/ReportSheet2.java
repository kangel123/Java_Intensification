package Lesson6;

public class ReportSheet2 {

	public static void main(String[] args) { // 메인 메소드
		int kopo09_iPerson = 30; // 학생의 수
		InputData2 kopo09_id = new InputData2(kopo09_iPerson); // InputData2 객체 생성

		kopo09_id.title(); // 타이틀 생성
		for (int kopo09_i = 0; kopo09_i < kopo09_iPerson; kopo09_i++) { // 모든 학생의 대해
			kopo09_id.grade(kopo09_i); // 성적 출력
		}
		System.out.printf("====================================================\n");
		kopo09_id.statistic(0, kopo09_iPerson); // 모든 학생의 합계 및 평균 출력
	}

}
