package Lesson001.Chapter03;

import java.util.Scanner;

public class Ex3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyin = new Scanner(System.in);
		float ave = 0, sum = 0, cost = 0;
		int number = 0;
		char[] days = { '一', '二', '三', '四', '五' };
		System.out.printf("*** 計算股票平均價系統 ***\n");
		for (int i = 0; i < days.length; i++) {
			if (i == 0)
				System.out.printf("請輸入第%c個交易日股價 =>", days[i]);
			else
				System.out.printf("(目前平均價 = %.2f)請輸入第%c個交易日股價 =>", ave, days[i]);
			cost = keyin.nextFloat();
			sum += cost;
			ave = sum / (i+1);
		}
		System.out.printf("%c日平均價 = %.2f\n", days[4], ave);
	}

}
