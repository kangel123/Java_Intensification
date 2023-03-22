package Lesson3;


public class MyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kopo09_price = 12345;	// goods price
		double kopo09_tax_rate = 0.1;	// tax_rate

		int kopo09_netprice = netprice(kopo09_price, kopo09_tax_rate);	// call netprice method
		int tax = kopo09_price - kopo09_netprice;	// calculate tax
		
		System.out.printf("**********************************\n");	// Print Start
		System.out.printf("*     소비자가, 세전가격, 세금 계산     *\n");	// Print Title
		System.out.printf("소비자가격: %d 세전가격:%d 세금: %d\n", kopo09_price, kopo09_netprice, tax);	// Print goods price, Pre-tax price, tax
		System.out.printf("**********************************\n");	// Print End		
	}

	// Pre-tax price calculation method
	public static int netprice(int price, double rate) {
		return (int)(price/(1+rate));	// return pre-tax price
	}
}
