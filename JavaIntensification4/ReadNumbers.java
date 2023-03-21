package JavaIntensification4;

public class ReadNumbers {
	public static void main(String[] args) {
//		readNumbers1();
		readNumbers2();
	}

	// Read up to 2 digits
	public static void readNumbers1() {
		String[] kopo09_numbers = { "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" }; // Array of string type variable(kopo09_units) declaration and The initial value is name of numbers.
		int kopo09_i10, kopo09_i0;	// Integer type variables(kopo09_i10, kopo09_i0) declaration
									// kopo09_i10 means the second digit
									// kopo09_i0 means the first  digit
		
		for (int i = 0; i < 101; i++) { // i repeats from 0 to 100
			if (i >= 0 && i < 10) { // If number is 1 digit,
				System.out.printf("일의자리 : %s\n", kopo09_numbers[i]);	// read the number in that way
			} else if (i >= 10 && i < 100) {	// If number is 2 digits, 
				kopo09_i10 = i / 10;	// Find second digit
				kopo09_i0 = i % 10;	// Find first digit
				if (kopo09_i0 == 0) {	// If first digit is equal to 0,
					System.out.printf("십의자리: %s십\n", kopo09_numbers[kopo09_i10]);	// read the number in that way
				} else {	// If first digit is not equal to 0,
					System.out.printf("십의자리: %s십%s\n", kopo09_numbers[kopo09_i10], kopo09_numbers[kopo09_i0]); // read the number in that way
				}
			} else {	// If number is 3 or more digits,
				System.out.printf("==> %d\n", i); // print the number as it is
			}
		}
	}

	// Read up to 10 digits
	public static void readNumbers2() {
		int iNumVal = 1001034567;	// value of iNumVal(Integer type Number Value) = 1001034567
		String sNumVal = String.valueOf(iNumVal);	// type casting(Integer to String)
		String kopo09_result="";	// number read result
		
		System.out.printf("==> %s [%d자리]\n", sNumVal, sNumVal.length());	// print number and number of digits
		
		String[] kopo09_numbers = {"영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};	// Array of string type variable(kopo09_numbers) declaration and The initial value is name of numbers.
		String[] kopo09_units = {"","십", "백", "천", "만", "십", "백" ,"천" , "억", "십"};	// Array of string type variable(kopo09_unit) declaration and The initial value is name of units.

		int kopo09_numbers_Index, kopo09_units_Index;	// Integer type variables(kopo09_numbers_Index, kopo09_units_Index) declaration
														// kopo09_numbers_Index is index of kopo09_numbers
														// kopo09_units_Index is index of kopo09_units
		
		kopo09_numbers_Index=0;	// start from the front.
		kopo09_units_Index=sNumVal.length()-1;	// start from the back. 
												// Since it is an index, it is set to length-1
		
		while(true) {	// loop
			if(kopo09_numbers_Index>= sNumVal.length()) break;	// Escape when you've finished reading

			// Read and print the corresponding numbers in order from the front
			// Use only kopo09_numbers
			System.out.printf("%s[%s]", sNumVal.substring(kopo09_numbers_Index, kopo09_numbers_Index+1), kopo09_numbers[Integer.parseInt(sNumVal.substring(kopo09_numbers_Index, kopo09_numbers_Index+1))]);	
			
			// Read number using kopo09_numbers and kopo09_units
			if(sNumVal.substring(kopo09_numbers_Index, kopo09_numbers_Index+1).equals("0")) {	// If current Index(kopo09_numbers_Index) is equal to 0,
				if(kopo09_units[kopo09_units_Index].equals("만") || kopo09_units[kopo09_units_Index].equals("억") ) {		// check indix(kopo09_units_Index) to represent "만" and "억".
					kopo09_result = kopo09_result + "" + kopo09_units[kopo09_units_Index];	// If correct, put "만" or "억" into the kopo09_result
				}	
			} else {	// If current Index(kopo09_numbers_Index) is not equal to 0,
				kopo09_result = kopo09_result + kopo09_numbers[Integer.parseInt(sNumVal.substring(kopo09_numbers_Index, kopo09_numbers_Index+1))]+ kopo09_units[kopo09_units_Index];	// put name of number into the kopo09_result
			}
			kopo09_numbers_Index++;	// next index of kopo09_numbers
			kopo09_units_Index--;	// next index of kopo09_units
		}
		System.out.printf("\n %s[%s]\n", sNumVal, kopo09_result);	// Print value of kopo09_result
	}

}
