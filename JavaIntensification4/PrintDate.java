package JavaIntensification4;

public class PrintDate {
	public static void main(String[] args) {

//		printAllDate1();
//		printAllDate2();
//		printAllDate3();
//		printAllDate4();
//		printAllDate5();
	}
	
	// Outputting the month and day with a double for statement 1
	public static void printAllDate1() {
		for(int kopo09_month = 1; kopo09_month < 13; kopo09_month++) {	// kopo09_month repeats from 1 to 12
			System.out.printf("%d월 =>", kopo09_month);	//Print month
			for(int kopo09_date = 1; kopo09_date < 32; kopo09_date++) {	// kopo09_date repeats from 1 to 31	
				System.out.printf("%d", kopo09_date);	// Print date
				
				if(kopo09_month==1 && kopo09_date==31) break;	// If January 31st, escape the for statement
				if(kopo09_month==2 && kopo09_date==28) break;	// If February 28st, escape the for statement
				if(kopo09_month==3 && kopo09_date==31) break;	// If March 31st, escape the for statement
				if(kopo09_month==4 && kopo09_date==30) break;	// If April 30st, escape the for statement
				if(kopo09_month==5 && kopo09_date==31) break;	// If May 31st, escape the for statement
				if(kopo09_month==6 && kopo09_date==30) break;	// If June 30st, escape the for statement
				if(kopo09_month==7 && kopo09_date==31) break;	// If July 31st, escape the for statement
				if(kopo09_month==8 && kopo09_date==31) break;	// If August 31st, escape the for statement
				if(kopo09_month==9 && kopo09_date==30) break;	// If September 30st, escape the for statement
				if(kopo09_month==10 && kopo09_date==31) break;	// If October 31st, escape the for statement
				if(kopo09_month==11 && kopo09_date==30) break;	// If November 30st, escape the for statement
				if(kopo09_month==12 && kopo09_date==31) break;	// If December 31st, escape the for statement
		
				System.out.printf(", ");	// Print ", "
			}
			System.out.printf("\n");	// Next Line
		}
	}

	// Outputting the month and day with a double for statement 2
	public static void printAllDate2() {
		for(int kopo09_month = 1; kopo09_month < 13; kopo09_month++) {	// kopo09_month repeats from 1 to 12
			System.out.printf("%d월 =>", kopo09_month);	//Print month
			for(int kopo09_date = 1; kopo09_date < 32; kopo09_date++) {	// kopo09_date repeats from 1 to 31	
				System.out.printf("%d", kopo09_date);	// Print date
				
				if(kopo09_month==4 || kopo09_month==6 || kopo09_month==9 || kopo09_month==11) {	// If April, June, September, November
					if(kopo09_date==30) break;	// and 30st, escape the for statement
				}
				if(kopo09_month==2) {	// If February
					if(kopo09_date==28) break;	// and 28st, escape the for statement
				}
				
				if(kopo09_date!=31) System.out.printf(", ");	// Print ", "
			}
			System.out.printf("\n");	// Next Line
		}
	}
	

	// Outputting the month and day with a double for statement 3
	public static void printAllDate3() {
		for(int kopo09_month = 1; kopo09_month < 13; kopo09_month++) {	// kopo09_month repeats from 1 to 12
			System.out.printf("%d월 =>", kopo09_month);	//Print month
			for(int kopo09_date = 1; kopo09_date < 32; kopo09_date++) {	// kopo09_date repeats from 1 to 31	
				System.out.printf("%d", kopo09_date);	// Print date
				
				if((kopo09_month==4 || kopo09_month==6 || kopo09_month==9 || kopo09_month==11) && (kopo09_date==30)) break;	// If April, June, September, November and 30st, escape the for statement
				if(kopo09_month==2 && kopo09_date==28) break;	// If February 28st, escape the for statement
				
				if(kopo09_date!=31) System.out.printf(", ");	// Print ", "
			}
			System.out.printf("\n");	// Next Line
		}
	}
	

	// Outputting the month and day with a double for statement and switch statement
	public static void printAllDate4() {
		for(int kopo09_month = 1; kopo09_month < 13; kopo09_month++) {	// kopo09_month repeats from 1 to 12
			System.out.printf("%d월 =>", kopo09_month);	//Print month
			LOOP: for(int kopo09_date = 1; kopo09_date < 32; kopo09_date++) {	// LOOP start, kopo09_date repeats from 1 to 31	
				System.out.printf("%d", kopo09_date);	// Print date
				
				switch(kopo09_month) {	// Compare months using switch
				case 4: case 6: case 9: case 11:	// If April, June, September, November
					if(kopo09_date==30) break LOOP;	// and 30st, escape LOOP
					break;	// else escape switch and continue for statement
				case 2:	// If February
					if(kopo09_date==28) break LOOP;	// and 28st, escape LOOP
					break;	// else escape switch and continue for statement
				}
				if(kopo09_date!=31) System.out.printf(", ");	// Print ", "
			}
			System.out.printf("\n");	// Next Line
		}
	}

	// Outputting the month and day with a double for statement and array
	public static void printAllDate5() {
		int[] kopo09_iLMD = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};	// Array of integer type variable(kopo09_iLMD) declaration and The initial value is the maximum day of the month.
		
		for(int kopo09_month = 1; kopo09_month < 13; kopo09_month++) {	// kopo09_month repeats from 1 to 12
			System.out.printf("%d월 =>", kopo09_month);	//Print month
			for(int kopo09_date = 1; kopo09_date < 32; kopo09_date++) {	// kopo09_date repeats from 1 to 31	
				System.out.printf("%d", kopo09_date);	// Print date
			
				if(kopo09_iLMD[kopo09_month-1]==kopo09_date) break;	// If the (kopo09_month-1)th index of the array and the date are the same, escape the for statement
				
				System.out.printf(", ");	// Print ", "
			}
			System.out.printf("\n");	// Next Line
		}
	}
}
