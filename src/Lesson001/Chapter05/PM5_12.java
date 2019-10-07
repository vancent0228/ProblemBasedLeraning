package Lesson001.Chapter05;

import java.util.Scanner;

public class PM5_12 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int month=0;
		int year_p=0;
		int year_n=0;
		double rate,balance,credit,interest,avg;
		System.out.printf("***平估退休後生活品質系統***\n");
		System.out.printf("請輸入幾歲開始儲存退休金(如30)歲=>");
		year_n=in.nextInt();
		System.out.printf("請問幾歲準備退休(如60)歲=>");
		year_p=in.nextInt();
		System.out.printf("請輸入預估年利率(如0.14)=>");
		rate=in.nextDouble();
		System.out.printf("請輸入預估每月儲蓄(如10000)元=>");
		credit=in.nextDouble();
		
		month=((year_p-year_n)+1)*12;
		balance=0;
		for (int i = 1; i <=month; i++) {
			balance=balance+credit;
			interest=((balance*rate)/12);
			System.out.printf("\t第%d月   本金 %.0f 利息 %.0f\n", i, balance, interest);
			balance=balance+interest;
		}
		avg = balance/(((80-year_p)+1)*12);
		System.out.printf("\n到退休之前可儲存 %.0f 元",balance);
		System.out.printf("\n平均每個月有 %.0f 元生活費",avg);

		if (avg<=5000) {
			System.out.printf("\n\n等待救濟");
		}else if (avg>5000 && avg<=10000) {
			System.out.printf("\n\n免強可以湖口");
		}else if (avg>10000 && avg<=20000) {
			System.out.printf("\n\n安逸舒適");
		}else if (avg>20000 && avg<=40000) {
			System.out.printf("\n\n富貴生活");
		}else if (avg>40000) {
			System.out.printf("\n\n遨遊世界");
		}
	}

}
