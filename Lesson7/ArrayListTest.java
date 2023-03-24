package Lesson7;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {	// ��̸���Ʈ ����
		ArrayList<String> kopo09_iAL = new ArrayList<>();	// ArrayList ��ü ����

		kopo09_iAL.add("abc");	// 0��° �ε����� ����
		kopo09_iAL.add("abcd");	// 1��° �ε����� ����
		kopo09_iAL.add("efga");	// 2��° �ε����� ����
		kopo09_iAL.add("������0");	// 3��° �ε����� ����
		kopo09_iAL.add("1234");	// 4��° �ε����� ����
		kopo09_iAL.add("12rk34");	// 5��° �ε����� ����
		System.out.printf("****************************\n");	// ArrayList �� Ȯ�� ����
		System.out.printf(" ���� ArraySize %d \n", kopo09_iAL.size()); // ���� ����, �迭�� length�� ���
		for (int kopo09_i = 0; kopo09_i < kopo09_iAL.size(); kopo09_i++) {	// ��� ���ҿ� ���Ͽ�
			System.out.printf("ArrayList %d = %s\n", kopo09_i, kopo09_iAL.get(kopo09_i));	// kopo09_i��° �ε��� ���� ���
		}
		
		kopo09_iAL.set(3, "������");	// 3�� �ε����� �� ����
		System.out.printf("****************************\n");	// ArrayList �� ���Ұ� ���� Ȯ�� ����
		System.out.printf(" ���뺯�� ArraySize %d \n", kopo09_iAL.size()); // ���� ����, �迭�� length�� ���
		for (int kopo09_i = 0; kopo09_i < kopo09_iAL.size(); kopo09_i++) {	// ��� ���ҿ� ���Ͽ�
			System.out.printf("ArrayList %d = %s\n", kopo09_i, kopo09_iAL.get(kopo09_i));	// kopo09_i��° �ε��� ���� ���
		}
		
		kopo09_iAL.remove(4);	// 4�� �ε��� �� ����, �ڿ� �ε����� ���� �ε����� �̵�(����)
		System.out.printf("****************************\n");	// ArrayList �� ���Ұ� ���� Ȯ�� ����
		System.out.printf(" ���뺯�� ArraySize %d \n", kopo09_iAL.size()); // ���� ����, �迭�� length�� ���
		for (int kopo09_i = 0; kopo09_i < kopo09_iAL.size(); kopo09_i++) {	// ��� ���ҿ� ���Ͽ�
			System.out.printf("ArrayList %d = %s\n", kopo09_i, kopo09_iAL.get(kopo09_i));	// kopo09_i��° �ε��� ���� ���
		}
		
		kopo09_iAL.sort(null);	// ���Ľ�Ű�� �Լ�
		System.out.printf("****************************\n");	// ArrayList ���� Ȯ��
		System.out.printf(" ����ƮSort ArraySize %d \n", kopo09_iAL.size()); // ���� ����, �迭�� length�� ���
		for (int kopo09_i = 0; kopo09_i < kopo09_iAL.size(); kopo09_i++) {	// ��� ���ҿ� ���Ͽ�
			System.out.printf("ArrayList %d = %s\n", kopo09_i, kopo09_iAL.get(kopo09_i));	// kopo09_i��° �ε��� ���� ���
		}
		
		kopo09_iAL.clear();	// ArrayList ����(�ʱ�ȭ)
		System.out.printf("****************************\n");	// ArrayList ���� Ȯ��
		System.out.printf(" ���� ���� ArraySize %d \n", kopo09_iAL.size()); // ���� ����, �迭�� length�� ���
		for (int kopo09_i = 0; kopo09_i < kopo09_iAL.size(); kopo09_i++) {	// ��� ���ҿ� ���Ͽ�
			System.out.printf("ArrayList %d = %s\n", kopo09_i, kopo09_iAL.get(kopo09_i));	// kopo09_i��° �ε��� ���� ���
		}
	}

}
