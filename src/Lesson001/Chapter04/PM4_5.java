package Lesson001.Chapter04;

import java.util.Scanner;

public class PM4_5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final double base = 18d, height = 24d;
		double toll, weight, bmi, adjust;

		System.out.printf("=== 歡迎使用 BMI 評估系統 (18~24) ===\n\n");
		System.out.printf("請輸入客戶身高(公分) => ");
		toll = in.nextDouble() / 100;
		System.out.printf("請輸入客戶體重(公斤) => ");
		weight = in.nextDouble();
		bmi = weight / (toll * toll);

		System.out.printf("\n\n客戶 BMI = %.4f\n", bmi);

		if (bmi <= base) {
			adjust = 18 * toll * toll - weight;
			System.out.printf("\n您身材太瘦了，需要增胖 %.2f 公斤\n", adjust);
		} else if (bmi >= height) {
			adjust = weight - 24 * toll * toll;
			System.out.printf("\n您身材太胖了，需要減重 %.2f 公斤\n", adjust);
		} else
			System.out.printf("\n恭喜您有一個健美體材\n");

		System.out.println("\n== 系統結束，歡迎再次光臨 ==\n");

	}

}
