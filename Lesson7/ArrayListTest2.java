package Lesson7;

import java.util.ArrayList;

public class ArrayListTest2 {	//백만개의 원소를 갖는 어레이리스트

	public static void main(String[] args) {
		int kopo09_iTestMAX = 1000000;	// 백만개
		ArrayList<Integer> kopo09_iAL = new ArrayList<>();	// 어레이리스트 객체 생성
		
		for(int kopo09_i=0;kopo09_i<kopo09_iTestMAX;kopo09_i++) {	// 백만번 동안
			kopo09_iAL.add((int)(Math.random()*1000000));	// 0부터 999999까지 중 랜덤으로 어레이리스트에 저장
		}
		
		for(int kopo09_i=0;kopo09_i<kopo09_iAL.size();kopo09_i++) {	// 어레이리스트 크기(백만번) 동안
			System.out.printf(" ArrayList %d = %d\n", kopo09_i, kopo09_iAL.get(kopo09_i));	// 값 출력
		}
		System.out.printf("****************************\n");	// 구분

		kopo09_iAL.sort(null);		// 정렬하기
		for(int kopo09_i=0;kopo09_i<kopo09_iAL.size();kopo09_i++) {	// 어레이리스트 크기(백만번) 동안
			System.out.printf(" ArrayList %d = %d\n", kopo09_i, kopo09_iAL.get(kopo09_i));	// 정렬된 값 출력
		}
	}

}