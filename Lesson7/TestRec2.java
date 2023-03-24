package Lesson7;

import java.util.ArrayList;

public class TestRec2 {

	static ArrayList<OneRec2> kopo09_AOR = new ArrayList<OneRec2>();

	static int kopo09_sumkor = 0; // ���� ����
	static int kopo09_sumeng = 0; // ���� ����
	static int kopo09_summat = 0; // ���� ����
	static int kopo09_sumsum = 0; // ���� ����
	static int kopo09_sumave = 0; // ���� ���
	static final int kopo09_iPerson = 20; // ��� ���� 20���� ����

	public static void dataSet() { // ������ ����� ��̸���Ʈ�� �ֱ�
		for (int kopo09_i = 0; kopo09_i < kopo09_iPerson; kopo09_i++) { // ��� ����鿡 ����
			String kopo09_name = String.format("ȫ��%02d", kopo09_i); // �̸� �����
			int kopo09_kor = (int) (Math.random() * 100); // ���� ���� �����
			int kopo09_eng = (int) (Math.random() * 100); // ���� ���� �����
			int kopo09_mat = (int) (Math.random() * 100); // ���� ���� �����
			kopo09_AOR.add(new OneRec2(kopo09_i, kopo09_name, kopo09_kor, kopo09_eng, kopo09_mat));
		}
	}

	public static void HeaderPrint() { // ��� �μ�
		System.out.printf("*****************************************\n");
		System.out.printf("%2s %4s  %2s %2s %2s %2s   %s\n", "��ȣ", "�̸�", "����", "����", "����", "�հ�", "���");
		System.out.printf("*****************************************\n");
	}

	public static void itemPrint(int kopo09_i) { // �ش� ��ȣ�� ����� ���� �μ�
		OneRec2 kopo09_rec; // ��ü ����
		kopo09_rec = kopo09_AOR.get(kopo09_i); // ��ü�� �ش� ��ȣ�� ��� ������ ������
		System.out.printf("%3d %6s %3d %4d %4d   %3d  %6.2f\n", kopo09_rec.student_id(), kopo09_rec.name(),
				kopo09_rec.kor(), kopo09_rec.eng(), kopo09_rec.mat(), kopo09_rec.sum(), kopo09_rec.ave());	// ���� ���
		kopo09_sumkor += kopo09_rec.kor(); // ��������
		kopo09_sumeng += kopo09_rec.eng(); // ��������
		kopo09_summat += kopo09_rec.mat(); // ��������
		kopo09_sumsum += kopo09_rec.sum(); // ��������
		kopo09_sumave += kopo09_rec.ave(); // �������
	}

	public static void TailPrint() {	// ������
		System.out.printf("*****************************************\n");
		System.out.printf("�����հ� %d  �������: %6.2f\n", kopo09_sumkor, kopo09_sumkor / (double) kopo09_AOR.size());	// ���� 
		System.out.printf("�����հ� %d  �������: %6.2f\n", kopo09_sumeng, kopo09_sumeng / (double) kopo09_AOR.size());	// ���� 
		System.out.printf("�����հ� %d  �������: %6.2f\n", kopo09_summat, kopo09_summat / (double) kopo09_AOR.size());	// ���� 
		System.out.printf("*****************************************\n");
		System.out.printf("������հ� %d   �����: %6.2f\n", kopo09_sumave, kopo09_sumave / (double) kopo09_AOR.size());	// �����
	}

	public static void main(String[] args) {
		dataSet();	// ������ ����
		HeaderPrint();	// ����μ�
		for (int kopo09_i = 0; kopo09_i < kopo09_AOR.size(); kopo09_i++) {	// ��� ����� ����
			itemPrint(kopo09_i);	// ���� ���
		}
		TailPrint();	//������
	}
}
