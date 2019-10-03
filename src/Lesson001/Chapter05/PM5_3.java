package Lesson001.Chapter05;

import java.util.Scanner;

public class PM5_3 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		double total = 0, cost, num=0;

		System.out.printf("歡迎光臨 == 春嬌超商 == \n\n");
		do {
			System.out.printf("累計 %.1f 請輸入貨品單價 (0 結束) => ", total);
			cost = keyin.nextDouble();
			if (cost > 0) {
				System.out.printf("\t請輸入購買數量 => ");
				num = keyin.nextDouble();
			}
			total += cost * num;
		} while (cost != 0);

		System.out.printf("總計 => %.1f 元", total);

	}

}
