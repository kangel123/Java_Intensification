package Lesson7;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {	// 어레이리스트 사용법
		ArrayList<String> kopo09_iAL = new ArrayList<>();	// ArrayList 객체 생성

		kopo09_iAL.add("abc");	// 0번째 인덱스에 저장
		kopo09_iAL.add("abcd");	// 1번째 인덱스에 저장
		kopo09_iAL.add("efga");	// 2번째 인덱스에 저장
		kopo09_iAL.add("가나다0");	// 3번째 인덱스에 저장
		kopo09_iAL.add("1234");	// 4번째 인덱스에 저장
		kopo09_iAL.add("12rk34");	// 5번째 인덱스에 저장
		System.out.printf("****************************\n");	// ArrayList 값 확인 시작
		System.out.printf(" 시작 ArraySize %d \n", kopo09_iAL.size()); // 원소 개수, 배열의 length와 비슷
		for (int kopo09_i = 0; kopo09_i < kopo09_iAL.size(); kopo09_i++) {	// 모든 원소에 대하여
			System.out.printf("ArrayList %d = %s\n", kopo09_i, kopo09_iAL.get(kopo09_i));	// kopo09_i번째 인덱스 값을 출력
		}
		
		kopo09_iAL.set(3, "가라라라");	// 3번 인덱스의 값 변경
		System.out.printf("****************************\n");	// ArrayList 내 원소값 변경 확인 시작
		System.out.printf(" 내용변경 ArraySize %d \n", kopo09_iAL.size()); // 원소 개수, 배열의 length와 비슷
		for (int kopo09_i = 0; kopo09_i < kopo09_iAL.size(); kopo09_i++) {	// 모든 원소에 대하여
			System.out.printf("ArrayList %d = %s\n", kopo09_i, kopo09_iAL.get(kopo09_i));	// kopo09_i번째 인덱스 값을 출력
		}
		
		kopo09_iAL.remove(4);	// 4번 인덱스 값 삭제, 뒤에 인덱스는 앞의 인덱스로 이동(변경)
		System.out.printf("****************************\n");	// ArrayList 내 원소값 삭제 확인 시작
		System.out.printf(" 내용변경 ArraySize %d \n", kopo09_iAL.size()); // 원소 개수, 배열의 length와 비슷
		for (int kopo09_i = 0; kopo09_i < kopo09_iAL.size(); kopo09_i++) {	// 모든 원소에 대하여
			System.out.printf("ArrayList %d = %s\n", kopo09_i, kopo09_iAL.get(kopo09_i));	// kopo09_i번째 인덱스 값을 출력
		}
		
		kopo09_iAL.sort(null);	// 정렬시키는 함수
		System.out.printf("****************************\n");	// ArrayList 정렬 확인
		System.out.printf(" 리스트Sort ArraySize %d \n", kopo09_iAL.size()); // 원소 개수, 배열의 length와 비슷
		for (int kopo09_i = 0; kopo09_i < kopo09_iAL.size(); kopo09_i++) {	// 모든 원소에 대하여
			System.out.printf("ArrayList %d = %s\n", kopo09_i, kopo09_iAL.get(kopo09_i));	// kopo09_i번째 인덱스 값을 출력
		}
		
		kopo09_iAL.clear();	// ArrayList 삭제(초기화)
		System.out.printf("****************************\n");	// ArrayList 삭제 확인
		System.out.printf(" 전부 삭제 ArraySize %d \n", kopo09_iAL.size()); // 원소 개수, 배열의 length와 비슷
		for (int kopo09_i = 0; kopo09_i < kopo09_iAL.size(); kopo09_i++) {	// 모든 원소에 대하여
			System.out.printf("ArrayList %d = %s\n", kopo09_i, kopo09_iAL.get(kopo09_i));	// kopo09_i번째 인덱스 값을 출력
		}
	}

}