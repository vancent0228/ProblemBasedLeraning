package Lesson001.Chapter07;

import java.util.Scanner;

public class PM7_2 {
	static double stock[] = { 78, 72, 61, 56, 87, 66, 74, 88, 76, 58, 65, 57, 90, 78, 67, 89, 56, 77, 56, 87, 67, 80,
			77, 86, 67, 75, 86, 98, 88, 78 };

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		double cost;
		int select;
		disp_menu();
		select = keyin.nextInt();
		while (select != 4) {
			switch (select) {
			case 1:
				disp_stock();
				break;
			case 2:
				System.out.printf("\n請登錄當日收盤股價 => ");
				cost = keyin.nextDouble();
				for (int i = (30 - 1); i >= 1; i--)
					stock[i] = stock[i - 1];
				stock[0] = cost;
				break;
			case 3:
				System.out.printf("\n請登錄目前股價 => ");
				cost = keyin.nextDouble();
				double ave_15=cal_ave(15);
				double ave_30=cal_ave(30);
				//顯示平均價
				System.out.printf("\n15日平均 %.2f   30日平均 %.2f\n",ave_15,ave_30);
				
				if ( cost>ave_15 && cost>ave_30) 
					System.out.println("目前是 多頭走勢\n");
				else if  ( cost<ave_15 && cost<ave_30)
					System.out.println("目前是 空頭走勢\n");
				else if  ( cost>ave_15 && cost<ave_30)
					System.out.println("目前是 盤整轉向多頭走勢\n");
				else if  ( cost<ave_15 && cost>ave_30)
					System.out.println("目前是 盤整轉向空頭\n");
				break;
			default:
				System.out.printf("\n輸入錯誤!! 請重新輸入\n");
			}
			disp_menu();
			select = keyin.nextInt();
		}
	}

	private static void disp_menu() {
		System.out.printf("\n\n===歡迎光臨 股票走勢分析系統===\n");
		System.out.printf("(1) 列印 30 日歷史收盤價\n");
		System.out.printf("(2) 登錄當日收盤價\n");
		System.out.printf("(3) 分析目前股票走勢\n");
		System.out.printf("(4) 離開系統\n");
		System.out.printf("\t 請輸入工作選項 =>");

	}

	private static void disp_stock() {
		System.out.printf("\n===列印最近 30 日股價===\n");
		for (int i = 0; i < stock.length; i++) {
			System.out.printf("%.2f  ", stock[i]);
			if ((i + 1) % 5 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}
	
	private static double cal_ave(int k) {
		double sum=0;
		for (int i = 0; i < k; i++) {
			sum+=stock[i];
		}
		return sum/k;
	}
}