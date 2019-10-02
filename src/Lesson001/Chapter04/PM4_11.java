package Lesson001.Chapter04;

import java.util.Scanner;

public class PM4_11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int hour = 0, hour1 = 0, hour2 = 0, hourMax = 0, moneyBase = 0, moneyAdd = 0, moneyTotal = 0;
		System.out.printf("請輸入該月工作時數 => ");
		hour = in.nextInt();

		if (hour <= 160) {
			hour1 = hour;
			hour2 = 0;
			moneyAdd = 0;
			moneyBase = hour1 * 105;
			moneyTotal = moneyBase + moneyAdd;
		} else if (hour >= 161 && hour <= 205) {
			hour1 = hour - 160;
			hour2 = 0;
			moneyAdd = (int) ((double) hour1 * (105d * 1.50d));
			moneyBase = 160 * 105;
			moneyTotal = moneyBase + moneyAdd;

		} else  {
			hour2 = hour-205;
			hour1 = hour-hour2 - 160;
			moneyAdd = (int) ((double) hour1 * (105d * 1.50d));
			moneyBase = 160 * 105;
			moneyTotal = moneyBase + moneyAdd;

		}

		System.out.printf("本月基本薪資如下:\n");
		System.out.printf("\t基本薪資 = %d\n", moneyBase);
		System.out.printf("\t加班費 = %d\n", moneyAdd);
		System.out.printf("\t總共薪資 = %d\n", moneyTotal);
		System.out.printf("\t不計費時間 = %d\n", hour2);

	}

}
