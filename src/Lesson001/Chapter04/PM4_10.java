package Lesson001.Chapter04;

import java.util.Scanner;

public class PM4_10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double toll, weight, bmi, adjust;

		System.out.printf("=== 歡迎使用 BMI 評估系統 (18~24) ===\n\n");
		System.out.printf("請輸入客戶身高(公分) => ");
		toll = in.nextDouble() / 100;
		System.out.printf("請輸入客戶體重(公斤) => ");
		weight = in.nextDouble();
		bmi = weight / (toll * toll);

		System.out.printf("\n\n客戶 BMI = %.4f\n", bmi);

		if (bmi <= 18.5) {
			adjust = 18 * toll * toll - weight;
			System.out.printf("\n您身材太瘦了，需要增胖 %.2f 公斤\n", adjust);
		} else {
			adjust = (int)(((bmi - 23)) / 0.5);
			if (bmi > 18.5 && bmi <= 22.9) {
				System.out.printf("\n理想體重");
			} else if (bmi > 23.0 && bmi <= 24.9) {
				System.out.printf("\n過重( 輕度增加 )");
			} else if (bmi > 25.0 && bmi <= 29.9) {
				System.out.printf("\n第一度肥胖( 中度增加 )");
			} else if (bmi > 30.0 && bmi <= 34.9) {
				System.out.printf("\n第二度肥胖( 重度增加 )");
			} else if (bmi > 35.0) {
				System.out.printf("\n第三度肥胖( 病態肥胖 )");
			}
			if (adjust > 1)
				System.out.printf("，需要花費 %.0f 萬元達成標準身材\n", adjust);

		}
		System.out.println("\n== 系統結束，歡迎再次光臨 ==\n");
	}
}
