package Lesson7;

import java.util.ArrayList;

public class ArrayListTest2 {	//�鸸���� ���Ҹ� ���� ��̸���Ʈ

	public static void main(String[] args) {
		int kopo09_iTestMAX = 1000000;	// �鸸��
		ArrayList<Integer> kopo09_iAL = new ArrayList<>();	// ��̸���Ʈ ��ü ����
		
		for(int kopo09_i=0;kopo09_i<kopo09_iTestMAX;kopo09_i++) {	// �鸸�� ����
			kopo09_iAL.add((int)(Math.random()*1000000));	// 0���� 999999���� �� �������� ��̸���Ʈ�� ����
		}
		
		for(int kopo09_i=0;kopo09_i<kopo09_iAL.size();kopo09_i++) {	// ��̸���Ʈ ũ��(�鸸��) ����
			System.out.printf(" ArrayList %d = %d\n", kopo09_i, kopo09_iAL.get(kopo09_i));	// �� ���
		}
		System.out.printf("****************************\n");	// ����

		kopo09_iAL.sort(null);		// �����ϱ�
		for(int kopo09_i=0;kopo09_i<kopo09_iAL.size();kopo09_i++) {	// ��̸���Ʈ ũ��(�鸸��) ����
			System.out.printf(" ArrayList %d = %d\n", kopo09_i, kopo09_iAL.get(kopo09_i));	// ���ĵ� �� ���
		}
	}

}
