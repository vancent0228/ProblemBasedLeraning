package Lesson001.Chapter05;

import java.util.Scanner;

public class Ex5_7 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		double credit;	//貸款額度(萬)
		double rate;	//月利率
		int num;		//未繳交利息月數
		double total;	//貸款取得金額
		
		System.out.printf("==歡迎光臨錢莊貸款試算系統==\n");
		System.out.printf("請輸入貸款金額(萬) => ");
		credit = keyin.nextDouble();
		System.out.printf("請輸入月利率 (如 0.04) => ");
		rate = keyin.nextDouble();
		System.out.printf("多個月沒繳交利息(如 10 個月) => ");
		num=keyin.nextInt();
		System.out.printf("列印相關借貸數據如下: \n");
		total=credit-credit*0.04-credit*0.05;
		System.out.printf("實際取得貸款金額 = %.2f 萬元\n",total);
		System.out.printf("每個月應繳交計息= %.2f 萬元\n",credit*0.04);
		for (int i=0;i<num;i++) {
			credit=credit+credit*0.04+credit*0.05;
		}
		System.out.printf("未繳利息 %d 個月後，本金累積為 %.2f 萬元\n",num,credit);
		System.out.printf("\t之後每月利息 = %.2f 萬元\n",credit*0.04);
		
		

	}

}
