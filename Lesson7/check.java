package Lesson7;

import java.text.DecimalFormat;

public class check {	// ��� ��� Ȯ��

	// ������
	static String[] kopo09_OneRex = { 
			"01 ��������            1,000  1      1,000", "02 �ٳ�������          3,600  4     14,400",
			"03 ������              3,300  1      3,300", "04 �������ֽ�         25,000  1     25,000",
			"05 ���ڿ���            1,000 10     10,000", "06 ����ũ              3,000  4     12,000",
			"07 �Ŀ���1.8L          8,500  1      8,500", "08 ����Ʈ�׸�����     15,900  2     31,800",
			"09 �������� 150g       3,880  2      7,760", "10 Ȩ��������          5,850  2     11,700",
			"11 �����ʹ�           13,584  1     13,584", "12 ö�� �����10k     31,900  1     31,900",
			"13 ���� ��ũ��ũ       1,580 10     15,800", "14 �նѲ� 110g         1,110  3      3,330",
			"15 ��ġ���� 500g       2,700  2      5,400", "16 ������ ħ��     3,800,000  1  3,800,000",
			"17 ������ ����       228,000  2    406,000", "18 ����                2,980  2      5,960",
			"19 �λ�            2,780  3      8,340", "20 ���� �ܹ���       2,180  2      4,360",
			"21 ����                6,990  1      6,990", "22 [�ۿ����]CM       23,800  1     23,800",
			"23 ������ �ѵ���       7,120  3     21,360", "24 �ɶ�ý� ����       6,950  1      6,950",
			"25 Ǫ���� �̼���       2,980  2      5,960", "26 ���ѱ� �����       2,750  3      8,250",
			"27 (����)����߰�      7,920  1      7,920", "28 CJ ����Ĩ 20      1,990  1      1,990",
			"29 1, ��޶� 10��      3,480  2      6,960", "30 ��Ƽ�� ĸ��        16,511  2     33,002",
			"31 ������ 718     96,300,000  1 96,300,000", "32 ���                5,000 20    100,000" };

	public static void main(String[] args) {
		for (int kopo09_i = 0; kopo09_i < kopo09_OneRex.length; kopo09_i++) { // ��� ���ǿ� ����
			checkSum(kopo09_i); // ��� ������ �κ� Ȯ�� ����
		}
	}

	// ���ڿ� �� ���� ������ + ��� Ȯ��
	public static void checkSum(int num) {
		DecimalFormat kopo09_df = new DecimalFormat("###,###,###,###"); // �������� ��ü ����
		int kopo09_price = 0, kopo09_count = 0, kopo09_sum = 0; // ���� ����, ����, �հ�� ��� 0���� �ʱ�ȭ

		// ���� ���� ������, õ������������ ����
		int kopo09_unit = 0; // ���� ������ ���� 0���� �ʱ�ȭ. unit�� ������ ���� ����, ����, �հ迡 ��� ����� ����.
		for (int kopo09_i = 27; kopo09_i > 17; kopo09_i--) { // ���� ������ �ڿ��� �պκб���
			if (kopo09_i == 20 || kopo09_i == 24) { // ","�� �ش�Ǵ� byte�� ����
			} else { // ","�� �ƴ� ��
				String kopo09_sNum = new String(kopo09_OneRex[num].getBytes(), kopo09_i, 1); // �ش� byte�� string���� ��ȯ
				if (!kopo09_sNum.equals(" ")) { // ������ �ƴϸ�
					kopo09_price += Integer.parseInt(kopo09_sNum) * Math.pow(10, (kopo09_unit)); // ���ڷ� ��ȯ �� ������ �°� �߰�
					kopo09_unit++; // ���� ����
				}
			}
		}

		// ���� ������, 2�ڸ������� ����
		kopo09_unit = 0; // ������ ������ ���� �ʱ�ȭ
		for (int kopo09_i = 30; kopo09_i > 28; kopo09_i--) { // ������ �ڿ��� �պκб���

			String kopo09_sNum = new String(kopo09_OneRex[num].getBytes(), kopo09_i, 1); //
			if (!kopo09_sNum.equals(" ")) {
				kopo09_count += Integer.parseInt(kopo09_sNum) * Math.pow(10, (kopo09_unit));
				kopo09_unit++;
			}

		}

		// �հ� ������, õ������������ ����
		kopo09_unit = 0; // �հ��� ������ ���� �ʱ�ȭ
		for (int kopo09_i = 41; kopo09_i > 30; kopo09_i--) {// �հ��� �ڿ��� �պκб���
			if (kopo09_i == 34 || kopo09_i == 38) { // ","�� �ش�Ǵ� byte�� ����
			} else { // ","�� �ƴ� ��
				String kopo09_sNum = new String(kopo09_OneRex[num].getBytes(), kopo09_i, 1); // �ش� byte�� string���� ��ȯ
				if (!kopo09_sNum.equals(" ")) { // ������ �ƴϸ�
					kopo09_sum += Integer.parseInt(kopo09_sNum) * Math.pow(10, (kopo09_unit)); // ���ڷ� ��ȯ �� ������ �°� �߰�
					kopo09_unit++; // ���� ����
				}
			}
		}

		// ��� Ȯ��
		if (kopo09_price * kopo09_count == kopo09_sum) { // ����� �´ٸ�
			System.out.printf("*********************\n"); // �ش� ���
		} else { // ����� Ʋ����
			System.out.printf("����[%s  %s]\n", new String(kopo09_OneRex[num].getBytes(), 0, 2),
					new String(kopo09_OneRex[num].getBytes(), 2, 40));	// ���� �޽��� ���
			System.out.printf("����[%s  %s%11s]\n", new String(kopo09_OneRex[num].getBytes(), 0, 2),
					new String(kopo09_OneRex[num].getBytes(), 2, 29), kopo09_df.format(kopo09_price * kopo09_count));	// ���� �� ���� ������ ���
		}
	}
}
