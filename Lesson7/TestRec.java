package Lesson7;

public class TestRec {	// Ŭ������ �迭 �����غ���
	public static void main(String[] args) {
		int kopo09_iPerson = 5; // ��� ��
		OneRec[] kopo09_inData = new OneRec[kopo09_iPerson]; // ��� ����ŭ OneRec�� �迭 ����

		// ������ �迭���� Ŭ���� �ν��Ͻ� ����
		kopo09_inData[0] = new OneRec("ȫ��01", 100, 100, 90);	// �迭 0��° Ŭ���� �ν��Ͻ� ����
		kopo09_inData[1] = new OneRec("ȫ��02", 90, 90, 90);	// �迭 1��° Ŭ���� �ν��Ͻ� ����
		kopo09_inData[2] = new OneRec("ȫ��03", 80, 70, 90);	// �迭 2��° Ŭ���� �ν��Ͻ� ����
		kopo09_inData[3] = new OneRec("ȫ��04", 70, 60, 90);	// �迭 3��° Ŭ���� �ν��Ͻ� ����
		kopo09_inData[4] = new OneRec("ȫ��05", 60, 100, 90);	// �迭 4��° Ŭ���� �ν��Ͻ� ����
	}
}
