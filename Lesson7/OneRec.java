package Lesson7;

public class OneRec {
	private String kopo09_name; // �̸�
	private int kopo09_kor; // ���� ����
	private int kopo09_eng; // ���� ����
	private int kopo09_mat; // ���� ����

	OneRec(String kopo09_name, int kopo09_kor, int kopo09_eng, int kopo09_mat) { // Ư�� ������ ����
		this.kopo09_name = kopo09_name; // �̸� ����
		this.kopo09_kor = kopo09_kor; // ���� ���� ����
		this.kopo09_eng = kopo09_eng; // ���� ���� ����
		this.kopo09_mat = kopo09_mat; // ���� ���� ����
	}

	public String name(){return this.kopo09_name;};	// �̸� ��ȯ
	public int kor(){return this.kopo09_kor;};	// ���� ���� ��ȯ
	public int eng(){return this.kopo09_eng;};	// ���� ���� ��ȯ
	public int mat(){return this.kopo09_mat;};	// ���� ���� ��ȯ
	public int sum(){return this.kopo09_kor+this.kopo09_eng+this.kopo09_mat;};	// �հ� ��ȯ
	public double ave() {return sum()/3.0;};	// ��� ��ȯ
}