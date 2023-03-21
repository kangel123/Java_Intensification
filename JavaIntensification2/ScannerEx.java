package JavaIntensification2;

import java.util.*; // for Scanner, java.util.* means we can use any class/interfaces which are part of the packages.

public class ScannerEx {

	//How to use Scanner
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);	// Create Scanner object
		System.out.print("두자리 정수를 하나 입력해주세요.>");	// print text
		String kopo09_input = scanner.nextLine();	// received input from the keyboard, One line of content input is stored in input
		int kopo09_num = Integer.parseInt(kopo09_input);	// type casting(String to integer)

		System.out.println("입력내용 : " + kopo09_input);	// print variable(kopo09_input) value, println = print + \n
		System.out.printf("num=%d%n", kopo09_num);	// print variable(kopo09_num) value, printf = print + format
	}

}
