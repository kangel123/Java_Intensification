package Lesson3;

public class MyTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] kopo09_item = { "맛동산", "웨하스", "롯데센드", "오땅", "사브레" }; // Array of snack name
		int[] kopo09_price = { 1000, 2000, 3000, 2500, 1450 }; // goods price
		int[] kopo09_amount = { 10, 2, 1, 3, 5 }; // goods count
		double tax_rate = 0.1;	// tax rate
		int kopo09_total_sum = 0;		// sum of goods, Initial value = 0

		// Print billing item Start
		System.out.printf("********************************************************\n");	
		System.out.printf("			너가 지른 과자들		\n");	// Title
		System.out.printf(" 항 목 \t\t 단 가 \t\t 수 량 \t\t 합 계\n");	// Field
		
		// Print Recode Start
		for (int i = 0; i < kopo09_item.length; i++) {		// Iterate over the number of items in the array
			int sum = kopo09_price[i] * kopo09_amount[i];	// Calculate of sum for each goods
			kopo09_total_sum += sum;	// Calculate sum of goods
			System.out.printf("%.5s \t\t%5d \t\t %3d \t\t %5d\n", kopo09_item[i], kopo09_price[i], kopo09_amount[i], sum);	// Print goods name, goods price, goods count, goods sum
		}
		//Print Recode End
		
		System.out.printf("********************************************************\n");	
		// Print billing item End
		
		// Print tax information Start
		System.out.printf("지불 금액 : %44d\n", kopo09_total_sum);	// Print kopo09_total_sum
		int total_net_price = (int) (kopo09_total_sum / (1 + tax_rate));		// Calculate Pre-tax prices
		System.out.printf("과세금액  : %44d\n", total_net_price);		// Print total_net_price
		int tax = kopo09_total_sum - total_net_price;	// Calculate tax
		System.out.printf("세  금  : %45d\n", tax);		// Print tax
		// Print tax information End
	}

}
