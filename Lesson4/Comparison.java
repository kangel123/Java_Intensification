package Lesson4;

public class Comparison {

	public static void main(String[] args) {
//		simpleComparison();
		numberAndCharacterComparison();
//		rangeComparison();
	}

	// 단순비교로 별찍기
	public static void simpleComparison() {
		int kopo09_iA, kopo09_iB;	// kopo09_iA는 행을 의미하고, kopo09_iB는 열을 의미한다.

		kopo09_iA = 0;	// 행으로 따지면 1이다
		while (true) {	// 아래의 연산을 반복
			kopo09_iB = 0;	// 열로 따지면 1이다
			
			while (true) {	// 아래의 연산을 반복
				System.out.printf("*");	// 별을 찍는다
				if (kopo09_iA == kopo09_iB) break;	// 만약 행과 열의 번호가 같으면 반복문 종료
				kopo09_iB++;	// 다음 열번호로 넘어간다
			}
			
			System.out.printf("\n");	// 위의 반복문 종료되면 실행
			kopo09_iA++;	// 다음 행번호로 넘어간다.
			if (kopo09_iA == 30) break;	// 행이 30개가 그려지면 반복문 종료한다. 
		}
	}

	// 숫자형 비교와 문자형 비교
	public static void numberAndCharacterComparison() {
		// 숫자형(int, double) 비교
		int kopo09_il;	// Integer형 kopo09_il를 미리 선언
		double kopo09_iD;	// Double형 kopo09_iD를 미리 선언

		kopo09_il = 10/3;	// int형/int형이므로 3
		kopo09_iD = 10/3.0;	// int형/double형이므로 3.333333(유효숫자만 표시)
		
		if(kopo09_il==kopo09_iD) System.out.printf("equal\n");	// kopo09_il과 kopo09_i를 비교(예시에서는 다르다)하여 같으면 equal 출력
		else System.out.printf("Not equal[%f][%f]\n", (double)kopo09_il, kopo09_iD);	// 다르면 kopo09_il과 kopo09_iD의 값을 출력

		if(kopo09_iD==3.333333) System.out.printf("equal\n");	// kopo09_iD의 유효숫자가 3.333333이지 값이 3.333333이 아니므로 kopo09_iD와 3.333333은 다르다
		else System.out.printf("Not equal[3.333333][%f]\n", kopo09_iD);	// 따라서 else문을 수행
		
		kopo09_iD = (int)kopo09_iD;	// type casting를 활용하여 int형으로 3을 만들었으나 기존의 kopo09_iD는 double형 이었으므로 kopo09_iD는 3.000000이 된다
		if(kopo09_il==kopo09_iD) System.out.printf("equal\n");	// 비교대상이 int형과 double형이지만 값이 같으면 true이다
		else System.out.printf("Not equal[%f][%f]\n", (double)kopo09_il, kopo09_iD);	// 만약 달랐으면 else문 수행

		System.out.printf("int로 인쇄[%d][%f]\n", kopo09_il, kopo09_iD);	// kopo09_il은 int형이므로 %d, kopo09_iD은 double형이므로 %f
		System.out.printf("double로 인쇄[%f][%f]\n", (double)kopo09_il, kopo09_iD);	// double형으로 나타내야 하므로 둘다 %f
		
		// 문자 비교
		char kopo09_a = 'c';	// kopo09_a는 char(한글자)형으로 'c'값을 가진 비교대상이다
		if (kopo09_a=='b')System.out.printf("a는 b이다\n");	// kopo09_a과 'b'는 다르므로 출력하지 않는다
		if (kopo09_a=='c')System.out.printf("a는 c이다\n");	// kopo09_a과 'c'는 다르므로 출력한다
		if (kopo09_a=='d')System.out.printf("a는 d이다\n");	// kopo09_a과 'd'는 다르므로 출력하지 않는다

		// 문자열 비교
		String kopo09_aa = "abcd";	// kopo09_aa는 String(한글자 이상)형이다
		if(kopo09_aa.equals("abcd"))System.out.printf("aa는 abcd이다\n");	// A.equals(B)는 A의 문자열과 B의 문자열을 비교하는 함수
		else System.out.printf("aa는 abcd이 아니다\n");	// 다른 문자열이면 else문 수행
		
		// boolean를 활용한 비교
		boolean kopo09_bb = true;	// kopo09_bb는 참, 거짓을 표현하는 boolean형으로 참이다
		if(!!kopo09_bb)System.out.printf("bb가 아니고 아니면 참이다\n");	// kopo09_bb == true, !kopo09_bb == false, !!kopo09_bb == true
		else System.out.printf("bb가 아니고 아니면 거짓이다\n");	// kopo09_bb이 거짓이었으면 else문 수행
	}
	
	// 범위를 준 비교(if~else if~else)
	public static void rangeComparison() {
		int kopo09_iVal;	// Integer형 kopo09_iVal를 미리 선언
		for(int kopo09_i = 0; kopo09_i < 300; kopo09_i++) {	//  0부터 299까지 수행
			kopo09_iVal = 5 * kopo09_i; 	//  값을 5의 배수로 변경(0부터 5*299까지)
			if(kopo09_iVal >= 0 && kopo09_iVal < 10)System.out.printf("일 %d\n", kopo09_iVal);	// 숫자가 일의 단위이면 수행
			else if(kopo09_iVal >= 10 && kopo09_iVal < 100)System.out.printf("십 %d\n", kopo09_iVal);	// 숫자가 십의 단위이면 수행
			else if(kopo09_iVal >= 100 && kopo09_iVal < 1000)System.out.printf("백 %d\n", kopo09_iVal);	// 숫자가 백의 단위이면 수행
			else System.out.printf("천 %d\n", kopo09_iVal);	// 나머지의 경우는 숫자가 천의 단위이로 생각하고 수행
		}
	}
}
