package Lesson6;

public class ReportSheet3 {

	public static void main(String[] args) {
		int kopo09_iPerson = 200;	// 총 학생 수
		int kopo09_division=30;	// 한 페이지에 출력할 학생 수
		InputData3 kopo09_id = new InputData3(kopo09_iPerson);	// InputData3의 객체 호출
		
		int kopo09_first=0;	// 출력 안된 학생중 가장 앞에 번호
		int kopo09_i=0;	// 현재 학생의 인덱스 번호
		
		for(;kopo09_i<kopo09_iPerson;kopo09_i++) {
			if(kopo09_i%kopo09_division==0) kopo09_id.title(kopo09_i/kopo09_division);	// 처음이거나, division 값의 인원수에 맞춰 타이틀 출력
			kopo09_id.grade(kopo09_i);	// 각 학생의 성적 출력
			if((kopo09_i+1)%kopo09_division==0) {	// 처음과 구분하기 위해 i+1
				kopo09_id.statistic(kopo09_first, kopo09_i+1);	// 출력 안된 학생중 가장 앞에 번호부터 현재 학생까지 출력
				kopo09_first=kopo09_i+1;	//  출력 안된 학생 번호 변경
				kopo09_id.total(kopo09_i+1);	// 지금까지 출력된 학생의 총점과 평균 출력
				System.out.printf("\n");	// 다음페이지 구분용
			} 
		}
		kopo09_id.statistic(kopo09_first, kopo09_i);	// 남은 학생의 대한 총점과 평균 출력
		kopo09_id.total(kopo09_i);	// 모든 학생의 총점과 평균 출력
	}

}
