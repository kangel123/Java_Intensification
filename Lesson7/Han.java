package Lesson7;

public class Han { // ���ڵ� Ms949

	public static void main(String[] args) {
		System.out.printf("HanBlankForeword[%s]\n", HanBlackForeword("�ѱ�abcd", 15));
		System.out.printf("HanBlankForeword[%s]\n", HanBlackForeword("�ѱ��ѱ�aa", 15));
		System.out.printf("HanBlankBackword[%s]\n", HanBlankBackword("�ѱ�aa", 15));
		System.out.printf("HanBlankBackword[%s]\n", HanBlankBackword("�ѱ��ѱ�aa", 15));
		System.out.printf("�ѱ��� [%d]��\n", HanCount("�ѱ��ѱ�aa"));
	}

	// �տ� �������� �� ���߱�
	public static String HanBlackForeword(String kopo09_word, int kopo09_space) {
		String kopo09_newWord = "";	// ���ο� ����
		for (int kopo09_i = 0; kopo09_i < kopo09_space - kopo09_word.getBytes().length; kopo09_i++) {	// ������ ��ŭ
			kopo09_newWord += " ";	// ���� �߰�
		}
		kopo09_newWord += kopo09_word;	// ���� ���� �߰�

		return kopo09_newWord;	// ���ο� ���� ��ȯ
	}

	// �ڿ� �������� �� ���߱�
	public static String HanBlankBackword(String kopo09_word, int kopo09_space) {
		String kopo09_newWord = kopo09_word;	// ���ο� ���ڿ� �������� �߰�
		for (int kopo09_i = 0; kopo09_i < kopo09_space - kopo09_word.getBytes().length; kopo09_i++) {	// ������ ��ŭ
			kopo09_newWord += " ";	// ���� �߰�
		}

		return kopo09_newWord;	// ���ο� ���� ��ȯ
	}
	
	// �ѱ� ����, �����ڵ� ���
	public static int HanCount(String kopo09_word) {
		int kopo09_num = 0;	// �ѱ� ����
		for (int kopo09_i = 0; kopo09_i < kopo09_word.length(); kopo09_i++) {	// ��� ���ڿ� ����
			if (44032 <= (int) kopo09_word.charAt(kopo09_i) && (int) kopo09_word.charAt(kopo09_i) <= 55215) { // �ѱ��̸� 
				kopo09_num++;	// +1
			} else if (4352 <= (int) kopo09_word.charAt(kopo09_i) && (int) kopo09_word.charAt(kopo09_i) <= 4607) { // ������ ������ 
				kopo09_num++;	// +1
			} else if (12592 <= (int) kopo09_word.charAt(kopo09_i) && (int) kopo09_word.charAt(kopo09_i) <= 12687) { // ������ ������ 
				kopo09_num++;	// +1
			}
		}
		return kopo09_num;	// �ѱ� ���� ��ȯ
	}
}
