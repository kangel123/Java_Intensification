package JavaIntensification4;

public class Comparison {

	public static void main(String[] args) {
//		simpleComparison();
//		numberAndCharacterComparison();
//		rangeComparison();
	}

	// Make stars using while statement
	public static void simpleComparison() {
		int kopo09_iA, kopo09_iB;	// Integer type variables(kopo09_iA, kopo09_iB) declaration

		kopo09_iA = 0;	//  The initial value of kopo09_iA is 0
		while (true) {	// keep repeating
			kopo09_iB = 0;	// The initial value of kopo09_iB is 0
			while (true) {	// keep repeating
				System.out.printf("*");	// Print star(*)
				if (kopo09_iA == kopo09_iB) break;	// If  value of kopo09_iA is equal to value of kopo09_iB, escape the while statement
					kopo09_iB++;	// Add 1 to kopo09_iB
			}
			System.out.printf("\n");	// Next Line
			kopo09_iA++;	// Add 1 to kopo09_iA
			if (kopo09_iA == 30) break;	// If value of kopo09_iA is equal to 30, escape the while statement
		}
	}

	// Compare numbers and characters
	public static void numberAndCharacterComparison() {
		// Comparing integer type and double type
		int kopo09_il;	// Integer type variable(kopo09_il) declaration
		double kopo09_iD;	// Double type variable(kopo09_iD) declaration

		kopo09_il = 10/3;	//  The initial value of kopo09_il is 3(=10/3)
		kopo09_iD = 10/3.0;	//  The initial value of kopo09_iD is 3.333333(=10/3)
		
		if(kopo09_il==kopo09_iD) System.out.printf("equal\n");	// if value of kopo09_il is equal to value of kopo09_iD, Print "equal"
		else System.out.printf("Not equal[%f][%f]\n", (double)kopo09_il, kopo09_iD);	// else Print kopo09_il, kopo09_iD

		// The significant figure of kopo09_iD is 3.333333, but the value is not 3.333333
		// So, kopo09_iD is not equal 3.333333
		if(kopo09_iD==3.333333) System.out.printf("equal\n");	// if value of kopo09_il is equal to value of kopo09_iD, Print "equal"
		else System.out.printf("Not equal[3.333333][%f]\n", kopo09_iD);	// else Print kopo09_il, kopo09_iD
		
		kopo09_iD = (int)kopo09_iD;	// (int)kopo09_iD= (int)3.3333333 = 3, but since kopo09_iD is a double type. So kopo09_iD becomes 3.00000
		if(kopo09_il==kopo09_iD) System.out.printf("equal\n");	// if value of kopo09_il is equal to value of kopo09_iD, Print "equal"
		else System.out.printf("Not equal[%f][%f]\n", (double)kopo09_il, kopo09_iD);	// else Print kopo09_il, kopo09_iD

		System.out.printf("int로 인쇄[%d][%f]\n", kopo09_il, kopo09_iD);	// Print kopo09_il and kopo09_iD as int type
		System.out.printf("double로 인쇄[%f][%f]\n", (double)kopo09_il, kopo09_iD);	// Print kopo09_il and kopo09_iD as int type
		
		// Comparing character type
		char kopo09_a = 'c';	// Character type variable(kopo09_a) declaration and initialize it to 'c'
		if (kopo09_a=='b')System.out.printf("a는 b이다\n");	// Comparing kopo09_a with 'b' is false. so it doesn't print
		if (kopo09_a=='c')System.out.printf("a는 c이다\n");	// Comparing kopo09_a with 'c' is true. so it prints
		if (kopo09_a=='d')System.out.printf("a는 d이다\n");	// Comparing kopo09_a with 'd' is false. so it doesn't print

		// Comparing string type
		String kopo09_aa = "abcd";	// String type variable(kopo09_aa) declaration and initialize it to "abcd"
		if(kopo09_aa.equals("abcd"))System.out.printf("aa는 abcd이다\n");	// If kopo09_aa is equal to "abcd", print text. 	A.equals(B) is a function that compares strings
		else System.out.printf("aa는 abcd이 아니다\n");	// else print text.
		
		// Comparing boolean type and !(not)
		boolean kopo09_bb = true;	// Boolean type variable(kopo09_aa) declaration and initialize it to true
		if(!!kopo09_bb)System.out.printf("bb가 아니고 아니면 참이다\n");	// if !!kopo09_bb is true, print text. (kopo09_bb == true, !kopo09_bb == false, !!kopo09_bb == true)
		else System.out.printf("bb가 아니고 아니면 거짓이다\n");	// else print text.
	}
	
	// Compare by range
	public static void rangeComparison() {
		int kopo09_iVal;	// Integer type variable(kopo09_iVal) declaration
		for(int i = 0; i < 300; i++) {	// i repeats from 0 to 299
			kopo09_iVal = 5 * i; 	//  The initial value of kopo09_il 5 * (value of i)
			if(kopo09_iVal >= 0 && kopo09_iVal < 10)System.out.printf("일 %d\n", kopo09_iVal);	// Output "일" and kopo09_iVal if kopo09_iVal is greater than or equal 0 and less than 10
			else if(kopo09_iVal >= 10 && kopo09_iVal < 100)System.out.printf("십 %d\n", kopo09_iVal);	// Output "십" and kopo09_iVal if kopo09_iVal is greater than or equal 10 and less than 100
			else if(kopo09_iVal >= 100 && kopo09_iVal < 1000)System.out.printf("백 %d\n", kopo09_iVal);	// Output "백" and kopo09_iVal if kopo09_iVal is greater than or equal 100 and less than 1000
			else System.out.printf("천 %d\n", kopo09_iVal);	// Output "천" and kopo09_iVal if kopo09_iVal is greater than or equal 1000
		}
	}
}
