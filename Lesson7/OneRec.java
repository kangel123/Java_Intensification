package Lesson7;

public class OneRec {
	private String kopo09_name; // 이름
	private int kopo09_kor; // 국어 점수
	private int kopo09_eng; // 영어 점수
	private int kopo09_mat; // 수학 점수

	OneRec(String kopo09_name, int kopo09_kor, int kopo09_eng, int kopo09_mat) { // 특정 생성자 생성
		this.kopo09_name = kopo09_name; // 이름 저장
		this.kopo09_kor = kopo09_kor; // 국어 점수 저장
		this.kopo09_eng = kopo09_eng; // 영어 점수 저장
		this.kopo09_mat = kopo09_mat; // 수학 점수 저장
	}

	public String name(){return this.kopo09_name;};	// 이름 반환
	public int kor(){return this.kopo09_kor;};	// 국어 점수 반환
	public int eng(){return this.kopo09_eng;};	// 영어 점수 반환
	public int mat(){return this.kopo09_mat;};	// 수학 점수 반환
	public int sum(){return this.kopo09_kor+this.kopo09_eng+this.kopo09_mat;};	// 합계 반환
	public double ave() {return sum()/3.0;};	// 평균 반환
}