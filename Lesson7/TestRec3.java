package Lesson7;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class TestRec3 {

	static ArrayList<OneRec2> kopo09_AOR = new ArrayList<OneRec2>();

	static int kopo09_sumkor = 0; // ���� ����
	static int kopo09_sumeng = 0; // ���� ����
	static int kopo09_summat = 0; // ���� ����
	static int kopo09_sumsum = 0; // ���� ����
	static int kopo09_sumave = 0; // ���� ���
	static final int kopo09_iPerson = 200; // ��� ���� 200���� ����
	static final int kopo09_division = 30;	// �� �������� 30��
	
	public static void dataSet() { // ������ ����� ��̸���Ʈ�� �ֱ�
		for (int kopo09_i = 0; kopo09_i < kopo09_iPerson; kopo09_i++) { // ��� ����鿡 ����
			String kopo09_name = String.format("ȫ��%02d", kopo09_i); // �̸� �����
			int kopo09_kor = (int) (Math.random() * 100); // ���� ���� �����
			int kopo09_eng = (int) (Math.random() * 100); // ���� ���� �����
			int kopo09_mat = (int) (Math.random() * 100); // ���� ���� �����
			kopo09_AOR.add(new OneRec2(kopo09_i, kopo09_name, kopo09_kor, kopo09_eng, kopo09_mat));
		}
	}

	public static void HeaderPrint(int kopo09_num) { // ��� �μ�
		SimpleDateFormat kopo09_sdf = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss"); // ��¥, �ð� ���� ��ü ����
		Calendar kopo09_current = Calendar.getInstance(); // ��½ð�
		System.out.printf("%20s\n\n", "���� ����ǥ"); // �Ӹ���
		System.out.printf("%s%40s\n", "PAGE : " + (kopo09_num + 1), "������� : " + kopo09_sdf.format(kopo09_current.getTime())); // ����������, �������
		
		System.out.printf("=====================================================\n");
		System.out.printf("%2s %4s  %5s %5s %5s %5s   %s\n", "��ȣ", "�̸�", "����", "����", "����", "�հ�", "���");
		System.out.printf("=====================================================\n");
	}

	public static void itemPrint(int kopo09_i) { // �ش� ��ȣ�� ����� ���� �μ�
		OneRec2 kopo09_rec; // ��ü ����
		kopo09_rec = kopo09_AOR.get(kopo09_i); // ��ü�� �ش� ��ȣ�� ��� ������ ������
		System.out.printf(" %3d %5s %6d %7d %7d   %5d  %6.2f\n", kopo09_rec.student_id(), kopo09_rec.name(),
				kopo09_rec.kor(), kopo09_rec.eng(), kopo09_rec.mat(), kopo09_rec.sum(), kopo09_rec.ave());	// ���� ���
		kopo09_sumkor += kopo09_rec.kor(); // ��������
		kopo09_sumeng += kopo09_rec.eng(); // ��������
		kopo09_summat += kopo09_rec.mat(); // ��������
		kopo09_sumsum += kopo09_rec.sum(); // ��������
		kopo09_sumave += kopo09_rec.ave(); // �������
	}

	public static void statistic(int kopo09_first, int kopo09_end) { // first���� end������ �հ�, ��� ���
		System.out.printf("====================================================\n");
		System.out.printf("���� ������\n");
		int kopo09_korSum = 0;	// ���� �հ�
		int kopo09_engSum = 0;	// ���� �հ�
		int kopo09_matSum = 0;	// ���� �հ�
		int kopo09_korAve = 0;	// ���� ���
		int kopo09_engAve = 0;	// ���� ���
		int kopo09_matAve = 0;	// ���� ���
		int kopo09_allsum = 0;	// ��� ���� �հ�
		int kopo09_allave = 0;	// ��� ���� ���

		OneRec2 kopo09_rec; // ��ü ����
		for (int kopo09_i = kopo09_first; kopo09_i < kopo09_end; kopo09_i++) { // first���� end����
			kopo09_rec = kopo09_AOR.get(kopo09_i); // ��ü�� �ش� ��ȣ�� ��� ������ ������
			kopo09_korSum += kopo09_rec.kor();	// ���� �հ� ���ϱ�
			kopo09_engSum += kopo09_rec.eng();	// ���� �հ� ���ϱ�
			kopo09_matSum += kopo09_rec.mat();	// ���� �հ� ���ϱ�
		}
		
		kopo09_korAve = kopo09_korSum / (kopo09_end - kopo09_first);	// ���� ��� ���ϱ�
		kopo09_engAve = kopo09_engSum / (kopo09_end - kopo09_first);	// ���� ��� ���ϱ�
		kopo09_matAve = kopo09_matSum / (kopo09_end - kopo09_first);	// ���� ��� ���ϱ�
		kopo09_allsum = kopo09_korSum + kopo09_engSum + kopo09_matSum;	// ��� ���� �հ�
		kopo09_allave = kopo09_allsum / 3;	// ��� ���� ���
		System.out.printf("�հ� %15d %6d %6d% 9d %8d\n", kopo09_korSum, kopo09_engSum, kopo09_matSum, kopo09_allsum, kopo09_allave);	// �հ� ������ ���
		System.out.printf("��� %15d %6d %6d% 9d %8d\n", kopo09_korAve, kopo09_engAve, kopo09_matAve, kopo09_allsum / (kopo09_end - kopo09_first),
				kopo09_allave / (kopo09_end - kopo09_first));	// ��� ������ ���
	
	}

	public static void TailPrint(int kopo09_num) {	// ó������ end������ �հ�, ��� ���
		System.out.printf("====================================================\n");

		System.out.printf("���� ������\n");
		System.out.printf("�հ� %15d %6d %6d% 9d %8d\n", kopo09_sumkor, kopo09_sumeng, kopo09_summat, kopo09_sumsum, kopo09_sumave);	// �հ� ������ ���
		System.out.printf("��� %15d %6d %6d% 9d %8d\n", kopo09_sumkor/kopo09_num, kopo09_sumeng/kopo09_num, kopo09_summat/kopo09_num, kopo09_sumsum/kopo09_num, kopo09_sumave/kopo09_num);	// ��� ������ ���
	
	}

	public static void main(String[] args) {
		dataSet();	// ������ ����
		int kopo09_i = 0;
		for (; kopo09_i < kopo09_AOR.size(); kopo09_i++) {	// ��� ����� ����
			if(kopo09_i%kopo09_division==0) {
				HeaderPrint(kopo09_i/kopo09_division);	// ����μ�
			}
			itemPrint(kopo09_i);	// ���� ���
			if((kopo09_i+1)%kopo09_division==0) {
				statistic(kopo09_i-29,kopo09_i+1);
				TailPrint(kopo09_i+1);
			}
		}
		statistic(kopo09_i/kopo09_division*kopo09_division, kopo09_i);	// ���� �л��� ���� ������ ��� ���
		TailPrint(kopo09_i);	// ��� �л� ������ ��� ���
	}
}
