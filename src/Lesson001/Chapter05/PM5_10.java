package Lesson001.Chapter05;

import java.util.Scanner;

public class PM5_10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int month = 0;
		double balance = 0, rate = 0, credit = 0, interest = 0, interestSum = 0;
		System.out.printf("***歡迎光臨 零存 整付 試算系統***\n");
		System.out.printf("預定每月儲存金額(如 10000) => ");
		credit = in.nextDouble();
		System.out.printf("存款期限(6,9,12,24) => ");
		month = in.nextInt();
		System.out.printf("目前儲蓄年利率(如 0.15) => ");
		rate = in.nextDouble();
		// balance=credit;
		for (int i = 0; i < month; i++) {

			interest = (int) ((balance * rate) / 12);

			balance = balance + interest;
			interestSum += interest;
			balance = balance + credit;

			System.out.printf("\t第%d月   本金 %.0f 利息 %.0f\n", i + 1, balance, interest);

		}
		System.out.printf("到期可領回 %.0f\n", balance);
		System.out.printf("增加 %.0f 元利息\n", interestSum);
	}

}
