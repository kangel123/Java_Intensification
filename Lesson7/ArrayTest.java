package Lesson7;

public class ArrayTest {

	public static void main(String[] args) {	// �迭 �� �ִ�, �ּ� ã��
		int[] kopo09_iArray = { 1, 7, 5, 3, 2, 1, 3, 4, 9, 12, 1, 212, 33, 11, 21, 11, 2121, 121, 11, 5, 6, 33 }; // �迭

		for (int kopo09_i = 0; kopo09_i < kopo09_iArray.length; kopo09_i++) { // �迭�� ��� ��� ���
			System.out.printf("iArray[%d]=%d\n", kopo09_i, kopo09_iArray[kopo09_i]);
		}

		int kopo09_iMax = kopo09_iArray[0]; // �ִ밪�� �ϴ� 0�� �ε��� ������ �ʱ�ȭ
		int kopo09_iMaxPt = 0; // �ε��� ��ȣ
		for (int kopo09_i = 0; kopo09_i < kopo09_iArray.length; kopo09_i++) { // ��� �迭�� ���Ͽ�
			if (kopo09_iMax < kopo09_iArray[kopo09_i]) { // ���� �ִ밪���� ū ���� �����ϸ�
				kopo09_iMax = kopo09_iArray[kopo09_i]; // �ִ밪�� �ش� ������ �����ϰ�
				kopo09_iMaxPt = kopo09_i; // �ε��� ��ȣ�� �ش� ��ȣ�� �����Ѵ�
			}
		}
		System.out.printf("MAX : iArray[%d]=%d\n", kopo09_iMaxPt, kopo09_iMax); // �ִ밪 ���

		int kopo09_iMin = kopo09_iArray[0]; // �ּҰ��� �ϴ� 0�� �ε��� ������ �ʱ�ȭ
		int kopo09_iMinPt = 0; // �ε��� ��ȣ
		for (int kopo09_i = 0; kopo09_i < kopo09_iArray.length; kopo09_i++) { // ��� �迭�� ���Ͽ�
			if (kopo09_iMin > kopo09_iArray[kopo09_i]) { // ���� �ּҰ����� ���� ���� �����ϸ�
				kopo09_iMin = kopo09_iArray[kopo09_i]; // �ּҰ��� �ش� ������ �����ϰ�
				kopo09_iMinPt = kopo09_i; // �ε��� ��ȣ�� �ش� ��ȣ�� �����Ѵ�
			}
		}
		System.out.printf("Min : iArray[%d]=%d\n", kopo09_iMinPt, kopo09_iMin); // �ּҰ� ���
	}

}
