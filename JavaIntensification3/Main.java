package JavaIntensification3;

public class Main {

	public static void main(String[] args) {
		fourArithmeticOperation();
		sumAndAverage();
		roundOfNumber();
		roundUpAndDown();
		dividingIntegerAndDouble();
	}

	// #1. Four arithmetic operations check
	public static void fourArithmeticOperation() {
		int kopo09_i; // Integer type variable(kopo09_i) declaration
		kopo09_i = 1 + 2; // kopo09_i = 3
		System.out.printf("#1-1 : %d\n", kopo09_i); // Print kopo09_i value

		kopo09_i = 1 + 2 * 3; // kopo09_i = 7
		System.out.printf("#1-2 : %d\n", kopo09_i); // Print kopo09_i value
	}

	// #2. Sum and Average
	public static void sumAndAverage() {
		int kopo09_sum; // Integer type variable(kopo09_sum) declaration
		kopo09_sum = 0; // (Initial value of kopo09_sum) = 0

		// Add from 1 to 100
		for (int i = 1; i < 101; i++) {
			kopo09_sum += 1;
		}
		System.out.printf("#2-1 : %d\n", kopo09_sum); // Print kopo09_sum value
		System.out.printf("#2-2 : %d\n", kopo09_sum / 100); // Print average value

		int[] kopo09_numbers = { 1, 2, 3, 4, 5 }; // Array type variable(kopo09_numbers) = [1, 2, 3, 4 ,5];
		int kopo09_sumOfNumbers; // Integer type variable(kopo09_sumOfNumbers) declaration
		kopo09_sumOfNumbers = 0; // (Initial value of kopo09_sumOfNumbers) = 0

		// Sum of variable(kopo09_numbers) values
		for (int i = 0; i < 5; i++) {
			kopo09_sumOfNumbers += kopo09_numbers[i]; // kopo09_sumOfNumbers = kopo09_sumOfNumbers[0] + kopo09_sumOfNumbers[1] + kopo09_sumOfNumbers[2] + kopo09_sumOfNumbers[3] + kopo09_sumOfNumbers[4]
		}
		System.out.printf("#2-3 : %d\n", kopo09_sumOfNumbers); // Print kopo09_sumOfNumbers value
	}

	// #3. Integer variable divide and Remainder Arithmetic Application
	public static void roundOfNumber() {
		// Integer variable divide
		int kopo09_i = 1000 / 3; // kopo09_i is quotient of 1000 divided by 3
		System.out.printf("#3-1 : %d\n", kopo09_i); // Print kopo09_i value, kopo09_i = 333
		kopo09_i = 1000 % 3; // kopo09_i is Remainder of dividing 1000 by 3
		System.out.printf("#3-2 : %d\n", kopo09_i); // Print kopo09_i value, kopo09_i = 1

		// Remainder Arithmetic Application
		for (int i = 0; i < 20; i++) {	// Repeat from 0 to 19
			System.out.printf("#3-3 : %d ", i); // Print variable(i) value

			// Print 5 per line, Example : line 1 = (0,1,2,3,4) , line 2 = (5,6,7,8,9), ...
			if (((i + 1) % 5) == 0) { // Why i+1 : i ranges form 0 to 19 and prints 5 per line
				System.out.printf("\n"); // If the remainder is 0, pass to the next line
			}
		}
	}

	// #4. Round up, Round down
	public static void roundUpAndDown() {
		// Round down 1 won
		int kopo09_money = 12345; // Integer type variable(kopo09_money) = 12345 won
		int kopo09_roundDownMoneyBy1Won = (kopo09_money / 10) * 10; // kopo09_roundDownMoneyBy1Won = (12345 / 10) * 10 = 1234 * 10 = 12340
		System.out.printf("#4-1 : %d\n", kopo09_roundDownMoneyBy1Won); // Print kopo09_roundDownMoneyBy1Won value

		// Round to 1 won
		kopo09_money = 12345; // Reset kopo09_money, kopo09_money = 12345
		int kopo09_roundMoneyBy1Won = ((kopo09_money + 5) / 10) * 10; // kopo09_roundMoneyBy1Won = ((12345 + 5) / 10) * 10 = (12350 / 10) * 10 = 12350
		System.out.printf("#4-2 : %d\n", kopo09_roundMoneyBy1Won); // Print kopo09_roundMoneyBy1Won value

		kopo09_money = 12344; // Reset kopo09_money, kopo09_money = 12344
		kopo09_roundMoneyBy1Won = ((kopo09_money + 5) / 10) * 10; // kopo09_roundMoneyBy1Won = ((12344 + 5) / 10) * 10 = (12349 / 10) * 10 = 12340
		System.out.printf("#4-2 : %d\n", kopo09_roundMoneyBy1Won); // Print kopo09_roundMoneyBy1Won value
	
		// Round down 100 won
		kopo09_money = 12345; // Reset kopo09_money, kopo09_money = 12345
		int kopo09_roundDownMoneyBy100Won = (kopo09_money / 1000) * 1000; // kopo09_roundDownMoneyBy100Won = (12345 / 1000) * 1000 = 12 * 1000 = 12000
		System.out.printf("#4-3 : %d\n", kopo09_roundDownMoneyBy100Won); // Print kopo09_roundDownMoneyBy100Won value
		
		
		// Round to 100 won
		kopo09_money = 12345; // Reset kopo09_money, kopo09_money = 12345
		int kopo09_roundMoneyBy100Won = ((kopo09_money + 500) / 1000) * 1000; // kopo09_roundMoneyBy100Won = ((12345 + 500) / 1000) * 1000 = (12845 / 1000) * 1000 = 12000
		System.out.printf("#4-4 : %d\n", kopo09_roundMoneyBy100Won); // Print kopo09_roundMoneyBy100Won value
		
		kopo09_money = 12645; // Reset kopo09_money, kopo09_money = 12645
		kopo09_roundMoneyBy100Won = ((kopo09_money + 500) / 1000) * 1000; // kopo09_roundMoneyBy100Won = ((12645 + 500) / 1000) * 1000 = (13145 / 1000) * 1000 = 13000
		System.out.printf("#4-4 : %d\n", kopo09_roundMoneyBy100Won); // Print kopo09_roundMoneyBy100Won value
	}

	// #5. Dividing Integer type and Double type
	public static void dividingIntegerAndDouble() {
		int kopo09_integerTypeValue = 14 / 5; // Integer variable(kopo09_integerTypeValue) = 2
		System.out.printf("#5-1 : %d\n", kopo09_integerTypeValue); // Print kopo09_integerTypeValue value

		double kopo09_doubleTypeValue; // Double type variable(kopo09_doubleTypeValue) declaration
		kopo09_doubleTypeValue = 14 / 5; // kopo09_doubleTypeValue = 2.0
		System.out.printf("#5-2 : %f\n", kopo09_doubleTypeValue);	// Print kopo09_doubleTypeValue value
		
		kopo09_doubleTypeValue = 14.0 / 5; // kopo09_doubleTypeValue = 2.8
		System.out.printf("#5-3 : %f\n", kopo09_doubleTypeValue);	// Print kopo09_doubleTypeValue value

		kopo09_doubleTypeValue = (14.0) / 5 + 0.5; // kopo09_doubleTypeValue = 2.8 + 0.5 = 3.3
		System.out.printf("#5-4 : %f\n", kopo09_doubleTypeValue);	// Print kopo09_doubleTypeValue value		
		

		kopo09_integerTypeValue = (int)((14.0) / 5 + 0.5); // (14.0) / Type casting, Double type(5 + 0.5 = 2.8 + 0.5 = 3.3) -> Integer type(3)
		System.out.printf("#5-5 : %d\n", kopo09_integerTypeValue);	// Print kopo09_integerTypeValue value		
	}
	
}
