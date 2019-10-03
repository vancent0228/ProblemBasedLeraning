package Lesson001.Chapter05;

import java.util.Scanner;

public class Ex5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyin = new Scanner(System.in);
		final int limit =240;	//最高期限
		double credit;	//貸款額度(萬)
		double pay;	//每月攤還金額(萬)
		double rate;	//年利率
		int count=0;	//累計繳納期數
		double balance;	//目前貸款餘額
		
		//讀取客戶輸入資料
		System.out.printf("==歡迎光臨藝術銀行貸款試算系統==\n");
		System.out.printf("請輸入貸款金額 (萬) => ");
		credit = keyin.nextDouble();
		System.out.printf("請輸入年利率 (如 0.04) => ");
		rate=keyin.nextDouble();
		System.out.printf("期望每月還款額度 (萬) => ");
		pay=keyin.nextDouble();
		
		//計算還款期數
		balance=credit;
		do {
			balance=balance+(balance*rate)/12;
			balance=balance-pay;
			count++;
			
			
		} while (balance>0);
		
		System.out.printf("您需要 %d 期(月)  才");
		
		//if (count>limit)
	}

}
