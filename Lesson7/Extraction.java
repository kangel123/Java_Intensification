package Lesson7;

public class Extraction {

	public static void main(String[] args) {
		String[] kopo09_OneRec = {
				"허가(신고)번호,허가(신고)일자,영업종류,상호,우편번호,소재지(지번),소재지(도로명),연락처,시설면적(m^2),영업상태,안정성검사대상 유기기구 시설종수,안정성검사대상 우기기구 시설대수,"
				+ "안정성검사대상이 아닌 유기기구 시설종수,안정성검사대상이 아닌 유기기구 시설대수,소재지도로명여부",
				"27200-2015,2013-10-21,일반유원시설업,아이스온아트,,부산광역시 북구 덕천동 763번지,,051-333-3238,9966,영업중,2,2,0,0,N",
				"27200-2015-000002,2015-08-25,기타유원시설업,만덕범퍼카랜드,46565,부산광역시 북구 만덕동 927-1번지 대성종합상가 106동 B01호,부산광역시 북구 만덕2로44번길 72,"
				+ "106동 801호(만덕동,대성종합상가),051-334-5436,207,영업중,0,0,1" };

		String[] kopo09_field_name = kopo09_OneRec[0].split(","); // OneRec의 인덱스를 ","로 나눠서 배열에 저장. 필드 이름
		for (int kopo09_i = 1; kopo09_i < kopo09_OneRec.length; kopo09_i++) { // 모든 내용 필드에 대해
			String[] kopo09_field = kopo09_OneRec[kopo09_i].split(","); // 내용도 위와 같이 배열로 저장
			System.out.printf("**************************************\n");
			for (int kopo09_j = 0; kopo09_j < kopo09_field.length; kopo09_j++) { // 필드의 모든 배열에 대해
				System.out.printf("%s : %s\n", kopo09_field_name[kopo09_j], kopo09_field[kopo09_j]); // 필드와 내용 출력
			}
			System.out.printf("**************************************\n");
		}
	}
}
