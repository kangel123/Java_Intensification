package Lesson7;

import java.util.ArrayList;

public class TestRec2 {

	static ArrayList<OneRec2> kopo09_AOR = new ArrayList<OneRec2>();

	static int kopo09_sumkor = 0; // 국어 총점
	static int kopo09_sumeng = 0; // 영어 총점
	static int kopo09_summat = 0; // 수학 총점
	static int kopo09_sumsum = 0; // 과목 총점
	static int kopo09_sumave = 0; // 과목 평균
	static final int kopo09_iPerson = 20; // 사람 수는 20으로 고정

	public static void dataSet() { // 데이터 만들어 어레이리스트에 넣기
		for (int kopo09_i = 0; kopo09_i < kopo09_iPerson; kopo09_i++) { // 모든 사람들에 대해
			String kopo09_name = String.format("홍길%02d", kopo09_i); // 이름 만들기
			int kopo09_kor = (int) (Math.random() * 100); // 국어 점수 만들기
			int kopo09_eng = (int) (Math.random() * 100); // 영어 점수 만들기
			int kopo09_mat = (int) (Math.random() * 100); // 수학 점수 만들기
			kopo09_AOR.add(new OneRec2(kopo09_i, kopo09_name, kopo09_kor, kopo09_eng, kopo09_mat));
		}
	}

	public static void HeaderPrint() { // 헤더 인쇄
		System.out.printf("*****************************************\n");
		System.out.printf("%2s %4s  %2s %2s %2s %2s   %s\n", "번호", "이름", "국어", "영어", "수학", "합계", "평균");
		System.out.printf("*****************************************\n");
	}

	public static void itemPrint(int kopo09_i) { // 해당 번호의 사람의 정보 인쇄
		OneRec2 kopo09_rec; // 객체 생성
		kopo09_rec = kopo09_AOR.get(kopo09_i); // 객체에 해당 번호의 사람 정보를 가져옴
		System.out.printf("%3d %6s %3d %4d %4d   %3d  %6.2f\n", kopo09_rec.student_id(), kopo09_rec.name(),
				kopo09_rec.kor(), kopo09_rec.eng(), kopo09_rec.mat(), kopo09_rec.sum(), kopo09_rec.ave());	// 정보 출력
		kopo09_sumkor += kopo09_rec.kor(); // 국어총점
		kopo09_sumeng += kopo09_rec.eng(); // 영어총점
		kopo09_summat += kopo09_rec.mat(); // 수학총점
		kopo09_sumsum += kopo09_rec.sum(); // 과목총점
		kopo09_sumave += kopo09_rec.ave(); // 과목평균
	}

	public static void TailPrint() {	// 꼬리글
		System.out.printf("*****************************************\n");
		System.out.printf("국어합계 %d  국어평균: %6.2f\n", kopo09_sumkor, kopo09_sumkor / (double) kopo09_AOR.size());	// 국어 
		System.out.printf("영어합계 %d  영어평균: %6.2f\n", kopo09_sumeng, kopo09_sumeng / (double) kopo09_AOR.size());	// 영어 
		System.out.printf("수학합계 %d  수학평균: %6.2f\n", kopo09_summat, kopo09_summat / (double) kopo09_AOR.size());	// 수학 
		System.out.printf("*****************************************\n");
		System.out.printf("반평균합계 %d   반평균: %6.2f\n", kopo09_sumave, kopo09_sumave / (double) kopo09_AOR.size());	// 반평균
	}

	public static void main(String[] args) {
		dataSet();	// 데이터 생성
		HeaderPrint();	// 헤더인쇄
		for (int kopo09_i = 0; kopo09_i < kopo09_AOR.size(); kopo09_i++) {	// 모든 사람에 대해
			itemPrint(kopo09_i);	// 정보 출력
		}
		TailPrint();	//꼬리말
	}
}
