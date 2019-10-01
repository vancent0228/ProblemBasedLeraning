package Lesson001.Chapter03;

import java.util.Scanner;

public class Ex3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int total = 0, item;
		String[] items = { "汽水", "餅乾", "御便當" };
		System.out.printf("超商收銀機、請注意是否歸零 = %d\n", total);
		for (int i = 0; i < items.length; i++) {
			System.out.printf("請輸入" + items[i] + "的金額 => ");
			item = in.nextInt();
			total += item;
			if (i < 2)
				System.out.printf("目前纍進金額 = %d\n", total);
		}
		System.out.printf("\t總金額為 = %d  謝謝光臨 !!!\n", total);
	}

}
