package JavaIntensification3;

import java.text.DecimalFormat; // DecimalFormat class import
import java.text.SimpleDateFormat; // DecimalFormat class import
import java.util.Calendar;	// Calendar class import


public class ExchageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExchangeFormat();
	}

	// Simple exchange calculation
	public static void Exchange1() {
		int kopo09_MyWon = 1000000; // Hanwha
		double kopo09_MoneyEx = 1238.21; // Exchange Rate
		double kopo09_commission = 0.003; // commission = 0.3%

		int kopo09_usd = (int) (kopo09_MyWon / kopo09_MoneyEx); // Calculate exchange amount, Dollar
		int kopo09_remain = (int) (kopo09_MyWon - kopo09_usd * kopo09_MoneyEx); // Calculate remain, Won

		System.out.printf("*******************************************\n"); // Print Start
		System.out.printf("*               수수료없이 계산               *\n"); // Print Title
		System.out.printf("총 한화환전금액: %d원 => 미화: %d달러, 잔돈: %d원\n", kopo09_MyWon, kopo09_usd, kopo09_remain); // Print Hanwha, exchange amount, remain
		System.out.printf("*******************************************\n"); // Print End
	}

	// exchange calculation including commission(1)
	public static void Exchange2() {
		int kopo09_MyWon = 1000000; // Hanwha
		double kopo09_MoneyEx = 1238.21; // Exchange Rate
		double kopo09_commission = 0.003; // commission = 0.3%

		int kopo09_usd = (int) (kopo09_MyWon / kopo09_MoneyEx); // Calculate exchange amount, Dollar

		double kopo09_comperOne = kopo09_MoneyEx * kopo09_commission; // commission per dollar, won
		double kopo09_totalcom = kopo09_usd * kopo09_comperOne; // commission of exchanged amountm, won

		System.out.printf("*******************************************\n"); // Print Start
		System.out.printf("*                수수료 계산                *\n"); // Print Title
		System.out.printf("총 수수료: %f원 => 미화: %d달러, 달러당 수수료: %f원\n", kopo09_totalcom, kopo09_usd, kopo09_comperOne); // Print total commission, exchangeamount, commission per dollar
		System.out.printf("*******************************************\n"); // Print End
	}

	// exchange calculation including commission(2)
	public static void Exchange3() {
		int kopo09_MyWon = 1000000; // Hanwha
		double kopo09_MoneyEx = 1238.21; // Exchange Rate
		double kopo09_commission = 0.003; // commission = 0.3%

		int kopo09_usd = (int) (kopo09_MyWon / kopo09_MoneyEx); // Calculate exchange amount, Dollar
		int kopo09_remain = (int) (kopo09_MyWon - kopo09_usd * kopo09_MoneyEx); // Calculate remain, Won
		
		double kopo09_comperOne = kopo09_MoneyEx * kopo09_commission; // commission per dollar, won
		double kopo09_totalcom = kopo09_usd * kopo09_comperOne; // commission of exchanged amountm, won
		
		int kopo09_i_totalcom; // Integer type variable(kopo09_i_totalcom) declaration
		
		if(kopo09_totalcom != (double)(int)kopo09_totalcom){	// If kopo09_totalcom is an double,
			kopo09_i_totalcom=(int)kopo09_totalcom + 1;		// Add 1 to the total commission
		}else {													// If kopo09_totalcom is an integer,
			kopo09_i_totalcom=(int)kopo09_totalcom;			// total commission is not change
		}
		
		kopo09_remain = (int)(kopo09_MyWon-kopo09_usd*kopo09_MoneyEx - kopo09_i_totalcom);	// Calculate remain, Won
		
		System.out.printf("*******************************************\n"); // Print Start
		System.out.printf("*               수수료 적용환전               *\n"); // Print Title
		System.out.printf("총 수수료: %d원 => 미화: %d달러, 달러당 수수료: %f원\n", kopo09_i_totalcom, kopo09_usd, kopo09_comperOne); // Print total commission, exchangeamount, commission per dollar
		System.out.printf("총 환화환전금액: %d원 => 미화: %d달러, 수수료징구: %d원 잔돈: %d원\n", kopo09_MyWon, kopo09_usd, kopo09_i_totalcom,kopo09_remain); // Print Hanwha, exchange amount, total commission, remain
		System.out.printf("*******************************************\n"); // Print End
	}

	// exchange calculation including commission(3)
	public static void Exchange4() {
		int kopo09_MyWon = 1000000; // Hanwha
		double kopo09_MoneyEx = 1238.21; // Exchange Rate
		double kopo09_commission = 0.003; // commission = 0.3%
		double kopo09_comperOne = kopo09_MoneyEx * kopo09_commission; // commission per dollar, won

		int kopo09_usd = (int) (kopo09_MyWon / (kopo09_MoneyEx+kopo09_comperOne)); // Calculate exchange dollar, Hanwha / (Korean Won per Dollar + commission per dollar)
		double kopo09_totalcom = kopo09_usd * kopo09_comperOne; // total commission
		
		int kopo09_i_totalcom; // Integer type variable(kopo09_i_totalcom) declaration
		if(kopo09_totalcom != (double)(int)kopo09_totalcom){	// If kopo09_totalcom is an double,
			kopo09_i_totalcom=(int)kopo09_totalcom + 1;		// Add 1 to the total commission
		}else {													// If kopo09_totalcom is an integer,
			kopo09_i_totalcom=(int)kopo09_totalcom;			// total commission is not change
		}
		
		int kopo09_remain = (int)(kopo09_MyWon-kopo09_usd*kopo09_MoneyEx - kopo09_i_totalcom);	// Calculate remain, Won
		
		System.out.printf("*******************************************\n"); // Print Start
		System.out.printf("*            (정확한)수수료 적용환전            *\n"); // Print Title
		System.out.printf("총 수수료: %d원 => 미화: %d달러, 달러당 수수료: %f원\n", kopo09_i_totalcom, kopo09_usd, kopo09_comperOne); // Print total commission, exchangeamount, commission per dollar
		System.out.printf("총 환화환전금액: %d원 => 미화: %d달러, 수수료징구: %d원 잔돈: %d원\n", kopo09_MyWon, kopo09_usd, kopo09_i_totalcom,kopo09_remain); // Print Hanwha, exchange amount, total commission, remain
		System.out.printf("*******************************************\n"); // Print End
	}
	
	public static void ExchangeFormat() {
		// Use DecimalFormat and Make Comma
		int kopo09_MyWon = 1000000; // Hanwha
		double kopo09_MoneyEx = 1238.21; // Exchange Rate
		double kopo09_commission = 0.003; // commission = 0.3%
		double kopo09_comperOne = kopo09_MoneyEx * kopo09_commission; // commission per dollar, won

		int kopo09_usd = (int) (kopo09_MyWon / (kopo09_MoneyEx+kopo09_comperOne)); // Calculate exchange dollar, Hanwha / (Korean Won per Dollar + commission per dollar)
		double kopo09_totalcom = kopo09_usd * kopo09_comperOne; // total commission
		
		int kopo09_i_totalcom; // Integer type variable(kopo09_i_totalcom) declaration
		if(kopo09_totalcom != (double)(int)kopo09_totalcom){	// If kopo09_totalcom is an double,
			kopo09_i_totalcom=(int)kopo09_totalcom + 1;		// Add 1 to the total commission
		}else {													// If kopo09_totalcom is an integer,
			kopo09_i_totalcom=(int)kopo09_totalcom;			// total commission is not change
		}
		
		int kopo09_remain = (int)(kopo09_MyWon-kopo09_usd*kopo09_MoneyEx - kopo09_i_totalcom);	// Calculate remain, Won
		
		DecimalFormat df = new DecimalFormat("###,###,###,###,###"); // Create format

		System.out.printf("*************************\n"); // Print Start
		System.out.printf("*       콤마찍기, 날짜 적용       *\n");	//Print Title

		System.out.printf("총 수수료: %s원 => 미화: %s달러, 달러당 수수료: %f원\n", df.format(kopo09_i_totalcom), df.format(kopo09_usd), kopo09_comperOne);	// Use format and Print total commision, exchange amount, commission per dollar
		System.out.printf("총 환화환전금액: %s원 => 미화: %s달러, 수수료징구: %s원 잔돈: %s원\n", df.format(kopo09_MyWon), df.format(kopo09_usd), df.format(kopo09_i_totalcom),df.format(kopo09_remain)); // Use format and 																																												
																																									//Print Hanwha, exchange amount, total commission, remain

		// Use SimpleDateFormat and show the time
		Calendar kopo09_calt = Calendar.getInstance();	// kopo09_calt = current time,  Calendar.getInstance() = (Function to get the current time)
		SimpleDateFormat sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss"); // Create SimpleDateFormat object
		System.out.printf("최종실행시간: %s\n", sdt.format(kopo09_calt.getTime()));	//Print current time, getTime() = (Function to get stored time)
		System.out.printf("*************************\n"); // Print End
	}
	
}
