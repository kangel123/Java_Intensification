package Lesson7;

public class ArrayTest {

	public static void main(String[] args) {	// 배열 내 최대, 최소 찾기
		int[] kopo09_iArray = { 1, 7, 5, 3, 2, 1, 3, 4, 9, 12, 1, 212, 33, 11, 21, 11, 2121, 121, 11, 5, 6, 33 }; // 배열

		for (int kopo09_i = 0; kopo09_i < kopo09_iArray.length; kopo09_i++) { // 배열의 모든 요소 출력
			System.out.printf("iArray[%d]=%d\n", kopo09_i, kopo09_iArray[kopo09_i]);
		}

		int kopo09_iMax = kopo09_iArray[0]; // 최대값은 일단 0번 인덱스 값으로 초기화
		int kopo09_iMaxPt = 0; // 인데스 번호
		for (int kopo09_i = 0; kopo09_i < kopo09_iArray.length; kopo09_i++) { // 모든 배열에 대하여
			if (kopo09_iMax < kopo09_iArray[kopo09_i]) { // 현재 최대값보다 큰 값이 존재하면
				kopo09_iMax = kopo09_iArray[kopo09_i]; // 최대값은 해당 값으로 변경하고
				kopo09_iMaxPt = kopo09_i; // 인덱스 번호도 해당 번호로 변경한다
			}
		}
		System.out.printf("MAX : iArray[%d]=%d\n", kopo09_iMaxPt, kopo09_iMax); // 최대값 출력

		int kopo09_iMin = kopo09_iArray[0]; // 최소값은 일단 0번 인덱스 값으로 초기화
		int kopo09_iMinPt = 0; // 인데스 번호
		for (int kopo09_i = 0; kopo09_i < kopo09_iArray.length; kopo09_i++) { // 모든 배열에 대하여
			if (kopo09_iMin > kopo09_iArray[kopo09_i]) { // 현재 최소값보다 작은 값이 존재하면
				kopo09_iMin = kopo09_iArray[kopo09_i]; // 최소값은 해당 값으로 변경하고
				kopo09_iMinPt = kopo09_i; // 인덱스 번호도 해당 번호로 변경한다
			}
		}
		System.out.printf("Min : iArray[%d]=%d\n", kopo09_iMinPt, kopo09_iMin); // 최소값 출력
	}

}
