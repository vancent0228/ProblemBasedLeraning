package Lesson001.Chapter03;

import java.util.Scanner;

public class PM3_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		final String[] symptoms = { "想哭", "心情不好", "比以前更容易發脾氣", "我睡不好", "我覺得不想吃東西", "我覺得想事情或做事情比以前慢", "我比較會往壞的方向想",
				"我覺得身體不舒服", "我覺得自己很沒用", "我很想不開、甚至想死" };
		final int[] weights = { 5, 4, 5, 3, 2, 3, 4, 2, 3, 5 };

		int sum1 = 0, sum2 = 0, val = 0, weight = 0;
		float value = 0;

		System.out.printf("*** 登革熱自我診斷系統 ***\n");
		System.out.printf("請輸入各種症狀明顯度如何 (0~10)\n");
		System.out.printf("\t如: 不明顯(0),稍明顯(4),明顯(6),很明顯(10)\n");

		for (int i = 0; i < weights.length; i++) {
			do {
				System.out.printf("\n(%d) " + symptoms[i] + "(比重 %d) 症狀明顯否(0~10) =>",i+1,weights[i]);
				val = in.nextInt();
			} while (!(val >= 0 && val <= 10));
			sum1 += val;
			sum2 += val*weights[i];
			weight += weights[i];
		}
		System.out.println("總合計算 (0~100), 判斷結果: 正常  (0~30)");
		System.out.println("  輕微憂鬱症(30~60), 明顯憂鬱症(60~100)");
		System.out.printf("\n您憂鬱症指數為 => %d", sum1);

		System.out.println("\n\n加權指數計算 (0~10), 判斷結果: 正常  (0~3)");
		System.out.println("  輕微憂鬱症(3~6), 明顯憂鬱症(6~10)");
		value = sum2 / (float) weight;
		System.out.printf("\n您憂鬱症指數為 => %.2f", value);

	}

}
