package Lesson001.Chapter05;

import java.util.Scanner;

public class PM5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 宣告相關物件與變數 */
		Scanner keyin = new Scanner(System.in);
		double credit = 0; // 需要貸款額度(萬)
		double pay_month; // 每月還錢金額(萬)
		double pay; // 總共要還多少錢
		double sum = 0; // 累加產生利息
		double rate; // 年利率
		double stages = 0; // 還錢期數
		double balance; // 目前貸款餘額
		double interest; // 本月延伸利息
		int count = 0; // 累計繳納期數

		/* 讀取客戶資料 */
		System.out.printf("==============學貸償還試算系統==============");
		System.out.printf("\n請輸入貸款金額（萬）=>");
		credit = keyin.nextDouble();
		System.out.printf("\n請輸入年利率 (如0.04) =>");
		rate = keyin.nextDouble();
		System.out.printf("\n請輸入就讀期間貸款學期數 =>");
		stages = keyin.nextInt();
		System.out.printf("\n前 10 期應繳納金額如下：");

		balance = credit;
		pay_month = credit / (stages * 12);
		do {
			interest = (balance * rate) / 12;
			pay = pay_month + interest;
			balance = balance - pay_month;
			count = count + 1;
			sum = sum + interest;
			
			if (count <= 10)
				System.out.printf("\n第 %d 期需繳納 %.2f 萬元", count, pay);
			
		} while (count < stages * 12);
		
		System.out.printf("\n到清償為止，總共延伸利息 %.2f 萬元", sum);

	}

}
