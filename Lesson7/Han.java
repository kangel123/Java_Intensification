package Lesson7;

public class Han { // 인코딩 Ms949

	public static void main(String[] args) {
		System.out.printf("HanBlankForeword[%s]\n", HanBlackForeword("한글abcd", 15));
		System.out.printf("HanBlankForeword[%s]\n", HanBlackForeword("한글한글aa", 15));
		System.out.printf("HanBlankBackword[%s]\n", HanBlankBackword("한글aa", 15));
		System.out.printf("HanBlankBackword[%s]\n", HanBlankBackword("한글한글aa", 15));
		System.out.printf("한글은 [%d]개\n", HanCount("한글한글aa"));
	}

	// 앞에 공백으로 줄 맞추기
	public static String HanBlackForeword(String kopo09_word, int kopo09_space) {
		String kopo09_newWord = "";	// 새로운 문자
		for (int kopo09_i = 0; kopo09_i < kopo09_space - kopo09_word.getBytes().length; kopo09_i++) {	// 부족한 만큼
			kopo09_newWord += " ";	// 공백 추가
		}
		kopo09_newWord += kopo09_word;	// 기존 문자 추가

		return kopo09_newWord;	// 새로운 문자 반환
	}

	// 뒤에 공백으로 줄 맞추기
	public static String HanBlankBackword(String kopo09_word, int kopo09_space) {
		String kopo09_newWord = kopo09_word;	// 새로운 문자에 기존문자 추가
		for (int kopo09_i = 0; kopo09_i < kopo09_space - kopo09_word.getBytes().length; kopo09_i++) {	// 부족한 만큼
			kopo09_newWord += " ";	// 공백 추가
		}

		return kopo09_newWord;	// 새로운 문자 반환
	}
	
	// 한글 세기, 유니코드 사용
	public static int HanCount(String kopo09_word) {
		int kopo09_num = 0;	// 한글 개수
		for (int kopo09_i = 0; kopo09_i < kopo09_word.length(); kopo09_i++) {	// 모든 문자에 대해
			if (44032 <= (int) kopo09_word.charAt(kopo09_i) && (int) kopo09_word.charAt(kopo09_i) <= 55215) { // 한글이면 
				kopo09_num++;	// +1
			} else if (4352 <= (int) kopo09_word.charAt(kopo09_i) && (int) kopo09_word.charAt(kopo09_i) <= 4607) { // 자음만 있으면 
				kopo09_num++;	// +1
			} else if (12592 <= (int) kopo09_word.charAt(kopo09_i) && (int) kopo09_word.charAt(kopo09_i) <= 12687) { // 모음만 있으면 
				kopo09_num++;	// +1
			}
		}
		return kopo09_num;	// 한글 개수 반환
	}
}