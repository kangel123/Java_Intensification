package Lesson6;

public class InputData {
	public String[] kopo09_name;	// 이름
	public int[] kopo09_kor;	// 국어
	public int[] kopo09_eng;	// 영어
	public int[] kopo09_mat;	// 수학
	public int[] kopo09_sum;	// 총점
	public double[] kopo09_ave;	// 평균

	InputData() { // 기본 생성자 5명으로 설정
		this(5);
	}

	InputData(int kopo09_person) { // 조건만큼 인원수 설정
		this.kopo09_name = new String[kopo09_person];	// 이름 저장 공간 생성
		this.kopo09_kor = new int[kopo09_person];	// 국어 저장 공간 생성
		this.kopo09_eng = new int[kopo09_person];	// 영어 저장 공간 생성
		this.kopo09_mat = new int[kopo09_person];	// 수학 저장 공간 생성
		this.kopo09_sum = new int[kopo09_person];	// 총점 저장 공간 생성
		this.kopo09_ave = new double[kopo09_person];	// 평균 저장 공간 생성
	}

	public void SetData(int kopo09_i, String kopo09_name, int kopo09_kor, int kopo09_eng, int kopo09_mat) {	// 데이터 저장
		this.kopo09_name[kopo09_i] = kopo09_name;	// 이름 저장
		this.kopo09_kor[kopo09_i] = kopo09_kor;	// 국어 점수 저장
		this.kopo09_eng[kopo09_i] = kopo09_eng;	// 영어 점수 저장
		this.kopo09_mat[kopo09_i] = kopo09_mat;	// 수학 점수 저장
		this.kopo09_sum[kopo09_i] = kopo09_kor + kopo09_eng + kopo09_mat;	// 총점 저장
		this.kopo09_ave[kopo09_i] = this.kopo09_sum[kopo09_i] / 3.0;	// 평균 저장
	}
}
