package JavaIntensification4;

public class Main {
	public static void main(String[] args) {
		switchCaseTest();
		forTest();
	}
	
	// Character comparison using switch/case statement
	public static void switchCaseTest() {
		String kopo09_jumin = "123456-1234567"; // String type variable(kopo09_jumin) declaration and initialize it to "123456-1234567"
		switch (kopo09_jumin.charAt(7)) { // Make the 7th index a char
		case '1': // if 7th index is equal to 1
			System.out.printf("20세기전 태어난 남자 사람\n"); // Print Text
			break; // Escape
		case '2': // if 7th index is equal to 2
			System.out.printf("20세기전 태어난 여자 사람\n"); // Print Text
			break; // Escape
		case '3': // if 7th index is equal to 3
			System.out.printf("20세기후 태어난 남자 사람\n"); // Print Text
			break; // Escape
		case '4': // if 7th index is equal to 4
			System.out.printf("20세기후 태어난 여자 사람\n"); // Print Text
			break;
		default: // otherwise
			System.out.printf("사람\n"); // Print Text
			break; // Escape
		}	
	}
	
	// Find the sum and make multiplication tables using for statement
	public static void forTest() {
		// Find the sum 
		int kopo09_sum = 0;	// Integer type variable(kopo09_sum) declaration and initialize it to 0
		for(int i = 0; i < 10; i++) {	// i repeats from 0 to 9
			kopo09_sum += i;	// Add the value of i to kopo09_sum
		}
		System.out.printf("sum %d\n", kopo09_sum);	// Print sum value

		// make multiplication tables
		for(int i = 1; i < 10; i++) {	// i repeats from 1 to 9
			System.out.printf("**************************\n");	// Print head start	
			System.out.printf("        구구단 %d 단\n", i);	// Print title
			System.out.printf("**************************\n");		// Print head end
			for(int j=1;j<10;j++) {		// j repeats from 1 to 9
				System.out.printf(" %d * %d = %d \n", i, j, i*j);	// Print multiplication tables
			}
		}
	}
}
