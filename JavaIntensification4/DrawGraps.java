package JavaIntensification4;

public class DrawGraps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Spacing();
		makeSinGrap();
//		makePyramid();
	}

	// 띄어쓰기
	public static void Spacing() {
		for (int kopo09_row = 0; kopo09_row < 10; kopo09_row++) { // 행은 0부터 9까지
			for (int kopo09_column = 0; kopo09_column < kopo09_row; kopo09_column++) System.out.printf(" "); // 열은 0부터 시작해서 행번호와 열번호가 같을 때까지 띄어쓰기
			System.out.printf("%d\n", kopo09_row); // 행번호 출력
		}
	}

	// sin함수 그리기
	public static void makeSinGrap() {
		double kopo09_fSin;	// double형으로 sin값을 나타낼 kopo09_fSin 선언
		for (int kopo09_i = 0; kopo09_i < 360; kopo09_i++) {	// 0부터 359까지 반복
			kopo09_fSin = Math.sin(kopo09_i * 3.141592 / 180);	// Math.sin()는 ()안에 값에 대한 sin의 값을 준다
			System.out.printf("%d sin ==>%f\n", kopo09_i, kopo09_fSin);	// 각각의 sin값 출력
		}

		for (int kopo09_i = 0; kopo09_i < 360; kopo09_i++) {	// 0부터 359까지 반복
			kopo09_fSin = Math.sin(kopo09_i * 3.141592 / 180);	// 위와 동일
			
			int kopo09_iSpace = (int) ((1.0 - kopo09_fSin) * 50);	// 보기 편하게 50을 곱하여 저장. iSpace는 빈공간 생성에 활용
			for (int kopo09_j = 0; kopo09_j < kopo09_iSpace; kopo09_j++) System.out.printf(" ");	// iSpace의 크기만큼 빈공간 생성 후
			System.out.printf("*[%f][%d]\n", kopo09_fSin, kopo09_iSpace);	// sin값 출력
		}
	}

	// 별로 피라미드 그리기
	public static void makePyramid() {
		int kopo09_countStar, kopo09_countBlank;	// kopo09_countStar는 별개수를 의미하고 kopo09_countBlank는 왼쪽의 빈공간을 의미한다
		kopo09_countStar = 1;	// 별은 1개부터 시작
		kopo09_countBlank = 20;	//빈공간은 20개부터
		
		while(true) {	// 반복문
			for(int kopo09_i = 0; kopo09_i < kopo09_countBlank ; kopo09_i++) System.out.printf(" ");	// kopo09_countBlank의 값만큼 빈공간 생성
			for(int kopo09_i = 0; kopo09_i < kopo09_countStar; kopo09_i++) System.out.printf("*");	// kopo09_countStar의 값만큼 별 생성
			System.out.printf("\n");
			
			kopo09_countStar += 2;	// 별은 2개씩 증가(왼쪽으로 1개, 오른쪽으로 1개)
			kopo09_countBlank -= 1;	// 왼쪽의 빈공간은 1개씩 줄어든다
			
			if(kopo09_countBlank < 0) break;	// 생성해야될 빈공간이 음수가 되면 반복문 종료
		}
	}

}
