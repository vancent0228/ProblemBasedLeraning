package Lesson001.Chapter04;

import java.util.Scanner;

public class PM4_14 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int watt=0, money=0;
		System.out.printf("請輸入使用度數 => ");
		watt = in.nextInt();
		if (watt <= 50) {
			money = 150;
		} else if (watt > 51 && watt < 100) {
			money = 150 + (watt - 50) * 5;
		} else if (watt > 100 && watt < 150) {
			money = 150 + 50 * 5 + (watt - 100) * 6;
		} else if (watt > 150 && watt < 200) {
			money = 150 + 50 * 5 + 50 * 6 + (watt - 150) * 7;
		} else if (watt > 200) {
			money = 150 + 50 * 5 + 50 * 6 + 50 * 7 + (watt - 200) * 8;
		}
		
		System.out.printf("\n電費收取 => %d 元",money);

	}

}
