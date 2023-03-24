package Lesson6;

public class ReportSheet {

	public static void main(String[] args) { // 메인 메소드
		int kopo09_iPerson = 10; // 10명의 사람에 대해
		InputData kopo09_inData = new InputData(kopo09_iPerson); // 10명의 정보를 저장할 공간 생성
		for (int kopo09_i = 0; kopo09_i < kopo09_iPerson; kopo09_i++) { // 10명의 사람 각각에 대해
			String kopo09_name = String.format("홍길%02d", kopo09_i); // 이름은 홍길+번호(번호는 1씩 증가)
			int kopo09_kor = (int) (Math.random() * 100); // 임의의 국어 점수
			int kopo09_eng = (int) (Math.random() * 100); // 임의의 영어 점수
			int kopo09_mat = (int) (Math.random() * 100); // 임의의 수학 점수
			kopo09_inData.SetData(kopo09_i, kopo09_name, kopo09_kor, kopo09_eng, kopo09_mat); // 번호, 이름, 국어, 영어, 수학 정보를 저장. 총점, 평균도 구해서 저장
		}

		for (int kopo09_i = 0; kopo09_i < kopo09_iPerson; kopo09_i++) { // 10명의 학생에 대해
			System.out.printf("번호:%d, 이름:%s, 국어:%d, 수학:%d, 영어:%d, 총점:%d, 평균:%f\n", kopo09_i, // 번호
					kopo09_inData.kopo09_name[kopo09_i], kopo09_inData.kopo09_kor[kopo09_i], kopo09_inData.kopo09_eng[kopo09_i],	// 이름, 국어, 영어,
					kopo09_inData.kopo09_mat[kopo09_i], kopo09_inData.kopo09_sum[kopo09_i], kopo09_inData.kopo09_ave[kopo09_i]);	//수학, 총점, 평균 출력
		}
	}

}
