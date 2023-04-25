package Lesson7;

public class TestRec {	// 클래스로 배열 생성해보기
	public static void main(String[] args) {
		int kopo09_iPerson = 5; // 사람 수
		OneRec[] kopo09_inData = new OneRec[kopo09_iPerson]; // 사람 수만큼 OneRec의 배열 생성

		// 각각의 배열마다 클래스 인스턴스 생성
		kopo09_inData[0] = new OneRec("홍길01", 100, 100, 90);	// 배열 0번째 클래스 인스턴스 생성
		kopo09_inData[1] = new OneRec("홍길02", 90, 90, 90);	// 배열 1번째 클래스 인스턴스 생성
		kopo09_inData[2] = new OneRec("홍길03", 80, 70, 90);	// 배열 2번째 클래스 인스턴스 생성
		kopo09_inData[3] = new OneRec("홍길04", 70, 60, 90);	// 배열 3번째 클래스 인스턴스 생성
		kopo09_inData[4] = new OneRec("홍길05", 60, 100, 90);	// 배열 4번째 클래스 인스턴스 생성
	}
}