package Lesson3;

public class Taxcalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kopo09_val = 271;	// goods price
		int kopo09_rate = 3;	// tax rate

		int kopo09_tax = taxcal(kopo09_val, kopo09_rate); // Call taxcal method

		System.out.printf("******************************\n");	// Print Start
		System.out.printf("*         단순 세금 계산         *\n");	// Print Title
		System.out.printf("실제 세금계산 : %f\n", kopo09_val * kopo09_rate / 100.0);	// Print real tax
		System.out.printf("세천가격: %d 세금:%d 세포함가격: %d\n", kopo09_val, kopo09_tax, kopo09_val + kopo09_tax);	// Print goods price, tax, goods price including tax
		System.out.printf("******************************\n");	// Print End
	}

	// Method of tax calculation
	public static int taxcal(int kopo09_val, int kopo09_rate) {
		int kopo09_ret; // Integer type variable(kopo09_ret) declaration

		// Calculations for two cases
		if ((double) kopo09_val * (double) kopo09_rate / 100.0 == kopo09_val * kopo09_rate / 100) { 	// When there is no discarded value
			kopo09_ret = kopo09_val * kopo09_rate / 100; // no change
		} else { 															// When there is a discarded value
			kopo09_ret = kopo09_val * kopo09_rate / 100 + 1; // 1 raise
		}
		return kopo09_ret; // return value(kopo09_ret)
	}	
}
	